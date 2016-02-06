package ua.ak.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.ak.domain.InputsBudget;

public interface InputsBudgetDao extends JpaRepository<InputsBudget, Long> {

}
