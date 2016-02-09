package ua.ak.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.ak.dao.FieldOperationDao;
import ua.ak.dao.FieldOperationDaoCustom;
import ua.ak.domain.FieldOperation;
import ua.ak.utils.dto.InputSumQAndAmount;

@Repository
public class FieldOperationDaoCustomImpl implements FieldOperationDaoCustom {

    @Autowired
    private FieldOperationDao dao;

    @PersistenceContext(unitName = "Primary")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public FieldOperationDaoCustomImpl() {
    }


    @Override
    @Transactional
    public List<InputSumQAndAmount> SumQAndAmount(String fieldCode) {
        //fieldCode = "F.LV.02.03.01";
        String str = "SELECT fo.inputTypeBudget, SUM (fo.inputUsageQty), SUM(fo.inputAmount) FROM  FIELD_OPERATION AS fo  WHERE  fo.fieldCode='" + fieldCode + "' GROUP BY fo.inputTypeBudget";
        Query query = em.createQuery(str);
        List<InputSumQAndAmount> inputSumQAndAmountList = new ArrayList<InputSumQAndAmount>();
        for (Iterator it = query.getResultList().iterator(); it.hasNext(); ) {
            Object[] row = (Object[]) it.next();
            inputSumQAndAmountList.add(new InputSumQAndAmount((String) row[0], (Double) row[1], (Double) row[2]));
        }

        return inputSumQAndAmountList;
    }

    @Override
    public List<FieldOperation> findData() {
        return null;
    }
}
