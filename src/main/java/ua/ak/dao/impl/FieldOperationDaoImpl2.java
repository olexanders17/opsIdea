package ua.ak.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.ak.dao.FieldOperationDao;
import ua.ak.domain.FieldOperation;

@Repository
public class FieldOperationDaoImpl2 {

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

	public FieldOperationDaoImpl2() {
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public List<FieldOperation> findData() {
		// F.LV.02.18.02
		List<FieldOperation> query= (List<FieldOperation>) em.createQuery("SELECT fo from FieldOperation fo")
				.getResultList();
		return  query;
	}

}
