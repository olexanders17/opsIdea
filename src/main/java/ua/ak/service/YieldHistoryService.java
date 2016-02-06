package ua.ak.service;

import java.util.List;

import ua.ak.domain.YieldHistory;

public interface YieldHistoryService {

	List<YieldHistory> getAll();

	List<YieldHistory> getByFieldCode(String fieldCode);

}
