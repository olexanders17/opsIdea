package ua.ak.run;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.ak.dao.FieldOperationDao;
import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;
import ua.ak.service.impl.FieldOperationServiceImpl;
import ua.ak.utils.ExcelReader;
import ua.ak.utils.JsonCalendarData;

public class Main {

	public static void main(String[] args) throws IOException {

		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("META-INF/appContext.xml");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		

//		 ExcelReader er = new ExcelReader("Ops.xlsx");
//		 List<FieldOperation> list0 = er.getAllOperations();
//		 for (FieldOperation fieldOperation : list0) {
//		 em.persist(fieldOperation);
//		 }

//		List<FieldOperation> list = em.createQuery("from FieldOperation").getResultList();
//
//		for (FieldOperation fieldOperation : list) {
//			System.out.println(fieldOperation);
//		}
//
//		JsonCalendarData js = new JsonCalendarData();
//		String as = js.getJsonCalendarData(list);

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
