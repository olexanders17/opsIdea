package ua.ak.dao;

import org.springframework.transaction.annotation.Transactional;
import ua.ak.utils.dto.InputSumQAndAmount;

import java.util.List;

/**
 * Created by Adm on 28.02.2016.
 */
public interface InputsBudgetDaoCustom {

    @Transactional
    List<InputSumQAndAmount> SumQAndAmount(String cropNameInBudgetFormat);
}
