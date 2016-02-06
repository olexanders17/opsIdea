package ua.ak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ak.domain.YieldHistory;

public interface YieldHistoryDao extends JpaRepository<YieldHistory, Long> {

}
