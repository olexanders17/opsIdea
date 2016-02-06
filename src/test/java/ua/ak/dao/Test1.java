package ua.ak.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import ua.ak.domain.FieldOperation;

public class Test1    {
	private EntityManagerFactory factory;
	private EntityManager em;

	@Before
	public void setUp() {
		factory = new Persistence().createEntityManagerFactory("Primary");
		em = factory.createEntityManager();
	}

	@Test()
	public void QueryTest() {
		
		
		em.getTransaction().begin();
		System.out.println("tis is test");
		
		String chemicalTypeBudget="Chemicals.Herbicide";
		double year=2015.;
		
		
		List<FieldOperation> listFO =  
				em.createQuery("SELECT fo from  FIELD_OPERATION as fo where fo.chemicalTypeBudget=:chemicalTypeBudget and fo.year=:year  " )
				.setParameter("chemicalTypeBudget", chemicalTypeBudget)
				.setParameter("year", year)				
				.getResultList();
		System.out.println(em);
		
		for (FieldOperation fo : listFO) {
			System.out.println(fo);
		}
		em.getTransaction().commit();
		em.close();
		factory.close();

	};

}
