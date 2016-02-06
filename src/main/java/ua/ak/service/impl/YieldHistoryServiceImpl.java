package ua.ak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ak.dao.YieldHistoryDao;
import ua.ak.dao.YieldHistoryDaoCustom;
import ua.ak.domain.YieldHistory;
import ua.ak.service.YieldHistoryService;

@Service
public class YieldHistoryServiceImpl implements YieldHistoryService {

	@Autowired
	private YieldHistoryDao dao;

	@Autowired
	private YieldHistoryDaoCustom daoCustom;

	public YieldHistoryDao getDao() {
		return dao;
	}

	public void setDao(YieldHistoryDao dao) {
		this.dao = dao;
	}

	public YieldHistoryDaoCustom getDaoCustom() {
		return daoCustom;
	}

	public void setDaoCustom(YieldHistoryDaoCustom daoCustom) {
		this.daoCustom = daoCustom;
	}

	@Override
	public List<YieldHistory> getAll() {
		return dao.findAll();
	}

	@Override
	public List<YieldHistory> getByFieldCode(String fieldCode) {
		return daoCustom.findByCode(fieldCode);
	}
	
	
	
	
	
	
	
	
	
	
	
}
