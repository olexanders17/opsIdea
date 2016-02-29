package ua.ak.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import ua.ak.domain.FieldOperation;
import ua.ak.utils.dto.InputSumQAndAmount;

public interface FieldOperationDaoCustom {


	@Transactional
	List<InputSumQAndAmount> SumQAndAmount(String fieldCode);

	String findCropByField(String fieldCode);

	List<FieldOperation> findData();
	
	
	
}
