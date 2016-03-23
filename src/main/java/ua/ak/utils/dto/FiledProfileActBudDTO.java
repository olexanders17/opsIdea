package ua.ak.utils.dto;

import java.util.ArrayList;
import java.util.List;

import javax.naming.event.ObjectChangeListener;

import ua.ak.domain.FieldOperation;

// use building patterns
@Deprecated
public class FiledProfileActBudDTO {

	List<VariancesActBud> listItems; // clas to fill jsp
	List<InputsTypeName> listInputsType; // list of type inputs

	public FiledProfileActBudDTO() {
		listItems = new ArrayList<VariancesActBud>();
		listInputsType = new InpuytsTypeUtil().getInputsTypeList();

	}

	List<VariancesActBud> getList(List<Object[]> listTypeBudgetQtyAmount) {

		for (int i = 0; i < listTypeBudgetQtyAmount.size(); i++) {
			Object[] arr = listTypeBudgetQtyAmount.get(i);

			String tmpName = (String) arr[0];
			double tmpAmount = (double) arr[0];

			for (InputsTypeName lit : listInputsType) {
				if (lit.getInputsTypeName().equals((InputsTypeName) arr[0])) {
				//	listItems.add(new VariancesActBud(inputsType, qTyActuals, amountTyActuals));

				}

			}

		}

		return listItems;
	}

}

class VariancesActBud {

	String inputsType;
	double qTyActuals;
	double qTyBudget;
	double amountTyActuals;
	double amountTyBudget;

	
	
	
	public VariancesActBud(String inputsType, double qTyActuals, double amountTyActuals) {
		super();
		this.inputsType = inputsType;
		this.qTyActuals = qTyActuals;
		this.amountTyActuals = amountTyActuals;
	}

	public VariancesActBud(String inputsType) {
		super();
		this.inputsType = inputsType;
	}

	public void setInputsType(String inputsType) {
		this.inputsType = inputsType;
	}

	public void setqTyActuals(double qTyActuals) {
		this.qTyActuals = qTyActuals;
	}

	public void setAmountTyActuals(double amountTyActuals) {
		this.amountTyActuals = amountTyActuals;
	}

	public VariancesActBud(String inputsType, double qTyActuals, double qTyBudget, double amountTyActuals, double amountTyBudget) {
		super();
		this.inputsType = inputsType;
		this.qTyActuals = qTyActuals;
		this.qTyBudget = qTyBudget;
		this.amountTyActuals = amountTyActuals;
		this.amountTyBudget = amountTyBudget;
	}

	public String getInputsType() {
		return inputsType;
	}

	public VariancesActBud buildInputsType(InputsTypeName InputsType) {
		this.inputsType = inputsType;
		return this;

	}

	public double getqTyActuals() {
		return qTyActuals;
	}

	public VariancesActBud buildqTyActuals(double qTyActuals) {
		this.qTyActuals = qTyActuals;
		return this;
	}

	public double getqTyBudget() {
		return qTyBudget;
	}

	public VariancesActBud buildqTyBudget(double qTyBudget) {
		this.qTyBudget = qTyBudget;
		return this;
	}

	public double getAmountTyActuals() {
		return amountTyActuals;
	}

	public VariancesActBud buildAmountTyActuals(double amountTyActuals) {
		this.amountTyActuals = amountTyActuals;
		return this;
	}

	public double getAmountTyBudget() {
		return amountTyBudget;
	}

	public VariancesActBud buildAmountTyBudget(double amountTyBudget) {
		this.amountTyBudget = amountTyBudget;
		return this;
	}

}
