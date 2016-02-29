package ua.ak.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.ak.dao.FieldOperationDao;
import ua.ak.dao.InputsBudgetDao;
import ua.ak.dao.InputsBudgetDaoCustom;
import ua.ak.utils.dto.InputSumQAndAmount;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Adm on 28.02.2016.
 */
@Repository
public class InputsBudgetDaoCustomImpl implements InputsBudgetDaoCustom {

    @Autowired
    private InputsBudgetDao dao;

    @PersistenceContext(unitName = "Primary")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public List<InputSumQAndAmount> SumQAndAmount(String cropNameInBudgetFormat) {
        cropNameInBudgetFormat = "(Crops) Winter wheat 2016";// to cahnge !!!
        String str = "select ib.inputBudgetType , sum (ib.inputQuantityTotal), sum (ib.inputAmountTotal) from INPUTS_BUDGET ib where ib.сropName=:cropNameInBudgetFormat group by ib.inputBudgetType";
        Query query = em.createQuery(str).setParameter("cropNameInBudgetFormat", cropNameInBudgetFormat);

        List<InputSumQAndAmount> listBudgetInputSumQAndAmounts = new ArrayList<InputSumQAndAmount>();
        for (Iterator it = query.getResultList().iterator(); it.hasNext(); ) {
            Object[] row = (Object[]) it.next();
            String line = (String) row[0];
            if (line != null && !line.equals("")) {
                listBudgetInputSumQAndAmounts.add(new InputSumQAndAmount((String) row[0], (Double) row[1], (Double) row[2]));
            }
        }



        return listBudgetInputSumQAndAmounts;
    }

}
