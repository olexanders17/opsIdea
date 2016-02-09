package ua.ak.run;

import java.lang.reflect.Method;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main3 {

    public static void main(String[] args) {

        EntityManagerFactory factory = new Persistence().createEntityManagerFactory("Primary");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        System.out.println("tis is test");

        // SELECT
        // fo.CHEMICALS_TYPE_BUDGET, SUM(CHEMICALS_AMOUNT)
        // FROM
        // FIELD_OPERATION AS fo
        // WHERE
        // fo.FIELD_CODE='F.LV.02.03.01'
        //
        // GROUP BY fo.CHEMICALS_TYPE_BUDGET

        // List<Object[]> listFO = em
        // .createQuery(
        // "SELECT fo.chemicalTypeBudget as type, SUM(fo.chemicalsAmount) as
        // amount from FIELD_OPERATION as fo where fo.fieldCode='F.LV.02.03.01'
        // group by fo.chemicalTypeBudget ")
        // .getResultList();
        // // System.out.println(listFO.get(0).getClass());
        //
        // for (int i = 0; i < listFO.size(); i++) {
        // Object[] arr = listFO.get(i);
        // for (int j = 0; j < arr.length; j++) {
        // System.out.println("Elemant " + i + j + "--" + arr[j]);
        // }
        //
        // }

        Object[] listFO2 = (Object[]) em
                .createQuery(
                        "SELECT fo.chemicalTypeBudget, SUM(fo.chemicalsAmount)  from  FIELD_OPERATION as fo where fo.fieldCode='F.LV.02.03.01' and  fo.chemicalTypeBudget='Chemicals.Herbicide' group by fo.chemicalTypeBudget ")
                .setMaxResults(1).getSingleResult();

        System.out.println(listFO2);
        for (int i = 0; i < listFO2.length; i++) {
            System.out.println(listFO2[i]);
        }


        Class class1 = listFO2[0].getClass();

        Method[] m = class1.getDeclaredMethods();

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }


        em.getTransaction().commit();
        em.close();
        factory.close();
    }

}
