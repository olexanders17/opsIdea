package ua.ak.dao;

import java.util.List;

import ua.ak.domain.YieldHistory;

public interface YieldHistoryDaoCustom {

	List<YieldHistory> findByCode(String fieldCode);

}
