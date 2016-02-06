package ua.ak.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ua.ak.dao.YieldHistoryDaoCustom;
import ua.ak.domain.YieldHistory;

@Repository
public class YieldHistoryDaoCustomImpl implements YieldHistoryDaoCustom {

	@Autowired
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<YieldHistory> findByCode(String fieldCode) {
		
		return (List<YieldHistory>) em.createQuery("select yh from YIELD_HISTORY as yh where yh.fieldCode ='" + fieldCode + "'").getResultList();
	}

}

// SELECT
// fo.CHEMICALS_TYPE_BUDGET, SUM(CHEMICALS_AMOUNT)
// FROM
// FIELD_OPERATION AS fo