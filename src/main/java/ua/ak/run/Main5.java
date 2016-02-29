package ua.ak.run;

import org.apache.tiles.request.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.ak.dao.FieldOperationDaoCustom;
import ua.ak.dao.impl.FieldOperationDaoCustomImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Iterator;

/**
 * Created by Adm on 20.02.2016.
 */
public class Main5 {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("file:C:\\Users\\Adm\\IdeaProjects\\ops\\src\\main\\webapp\\WEB-INF\\spring\\servlet-context.xml");


        EntityManagerFactory factory = new Persistence().createEntityManagerFactory("Primary");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        FieldOperationDaoCustom custom = new FieldOperationDaoCustomImpl();
        System.out.println(custom.findCropByField("dd"));




        em.close();
        em.getTransaction().commit();
        factory.close();
    }
}
