package ua.ak.run;

import ua.ak.domain.FieldOperation;
import ua.ak.domain.YieldHistory;
import ua.ak.utils.dto.InputTypeAmount;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Adm on 07.02.2016.
 */

//testing crop rotation
//TODO: crop rotation


public class Main4 {

    public static void main(String[] args) {
        EntityManagerFactory factory = new Persistence().createEntityManagerFactory("Primary");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();


        String query = "SELECT  * from yield_history WHERE FIELD_CODE='F.LV.02.14.01'";
        String query2 = "SELECT fo.inputTypeBudget, SUM (fo.inputUsageQty), SUM(fo.inputAmount) FROM  FIELD_OPERATION AS fo  WHERE  fo.fieldCode='F.LV.02.03.01' GROUP BY fo.inputTypeBudget";
        //String query3 = "SELECT new InputTypeAmount( fo.inputTypeBudget,SUM(inputAmount))   FROM  FIELD_OPERATION AS fo  WHERE  fo.fieldCode='F.LV.02.03.01' GROUP BY fo.inputTypeBudget";
        Query query1 = em.createQuery(query2);

        System.out.println(query1);
        List<InputTypeAmount> inputTypeAmountList = new ArrayList<InputTypeAmount>();

            for (Iterator it=query1.getResultList().iterator(); it.hasNext() ; ) {
                Object[] row= (Object[]) it.next();
//                if (row[0] != null) {
//                    //inputTypeAmountList.add(new InputTypeAmount((String) row[0], (Double) row[1]));
//
//
//                }
                System.out.println(0+"= " + row[0] );
                System.out.println(1+"= " + row[1] );
                System.out.println(2+"= " + row[2] );


        }


        for (InputTypeAmount inputTypeAmount : inputTypeAmountList) {
            System.out.println(inputTypeAmount);
        }



        em.getTransaction().commit();
        em.close();
        factory.close();


    }
}
