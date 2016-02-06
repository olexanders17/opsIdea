package ua.ak.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ua.ak.dao.FieldOperationDao;
import ua.ak.dao.FieldOperationDaoCustom;
import ua.ak.domain.FieldOperation;

public class FieldOperationDaoImpl implements FieldOperationDaoCustom {

//	@Autowired
//	private FieldOperationDao dao;
//
//	@PersistenceContext(unitName = "Primary")
//	private EntityManager em;
//
//	public EntityManager getEm() {
//		return em;
//	}
//
//	public void setEm(EntityManager em) {
//		this.em = em;
//	}
//
//	public FieldOperationDaoImpl() {
//		// TODO Auto-generated constructor stub
//	}
//
	@Transactional
	public List<FieldOperation> findData() {
		return null;
		
	}
		//F.LV.02.18.02	
		
//		
//		return (List<FieldOperation>) 
//				em.createQuery("SELECT fo from FieldOperation fo WHERE fo.fieldCode=:fieldCode")
//				.setParameter("fieldCode", "F.LV.02.18.02")
//				.getResultList();
//	}

}
