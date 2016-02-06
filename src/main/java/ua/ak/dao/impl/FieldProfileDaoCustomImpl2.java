package ua.ak.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.ak.dao.FieldProfileDao;
import ua.ak.dao.FieldProfileDaoCustom;
import ua.ak.domain.FieldProfile;

@Repository
public class FieldProfileDaoCustomImpl2 implements FieldProfileDaoCustom {

	@Autowired
	FieldProfileDao dao;
	
	public FieldProfileDaoCustomImpl2() {
		// TODO Auto-generated constructor stub
	}
	
	

	// use named query

	public FieldProfileDao getDao() {
		return dao;
	}



	public void setDao(FieldProfileDao dao) {
		this.dao = dao;
	}




	public FieldProfile findByCode(String code) {

		return null;
	}

}
