package ua.ak.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import ua.ak.domain.FieldOperation;
import ua.ak.domain.Inputs;

@Component
public class AmountsForFieldOperations {

	public FieldOperation getAmounts(FieldOperation fieldOperation, List<Inputs> inputs) {

		for (Inputs inputsElement : inputs) {

			if (fieldOperation.getInputName().equals(inputsElement.getInputsName())) {
				fieldOperation.setInputAmount(fieldOperation.getInputUsageQty() * inputsElement.getInputsPrice());
			}

		}

		setInputsTypes(fieldOperation, inputs);

		return fieldOperation;

	}

	public void setInputsTypes(FieldOperation fieldOperation, List<Inputs> inputs) {
		for (Inputs inputsElement : inputs) {

			if (fieldOperation.getInputName().equals(inputsElement.getInputsName())) {
				fieldOperation.setInputTypeBudget(inputsElement.getInputsType());
			}

		}

	}

}
