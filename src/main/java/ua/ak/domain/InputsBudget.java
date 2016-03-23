package ua.ak.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="INPUTS_BUDGET")
public class InputsBudget {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;

	@Column(name = "CROP_NAME")
	String сropName;

	@Column(name = "TOTAL_HA")
	Double totalHa;

	@Column(name = "OPERATION")
	String operation;

	@Column(name = "ACTIVITY_DATE")
	Date activityDate;

	@Column(name = "INPUT_BUDGET_NAME")
	String inputBudgetName;

	@Column(name = "INPUT_BUDGET_TYPE")
	String inputBudgetType;


	@Column(name = "NORM_PER_HA")
	Double normPerHa;

	@Column(name = "USED_HECTARS")
	Double usedHectars;

	@Column(name = "INPUT_QUANTITY_TOTAL")
	Double inputQuantityTotal;

	@Column(name = "INPUT_AMOUNT_TOTAL")
	Double inputAmountTotal;
	
	@Column(name = "DIESEL_NORM_PER_HA")
	Double dieselNormPerHa;
	
	
	@Column(name = "DIESEL_TOTAL_QUANTITY")
	Double DIESEL_TOTAL_QUANTITY; 
	
	@Column(name = "DIESEL_TOTAL")
	Double dieselTotal;


	@Column(name = "INPUT_QUANTITY_PER_TOTAL_HA")
	Double inputQuantityPerTotalHa;


	@Column(name = "INPUT_AMOUNT_PER_TOTAL_HA")
	Double inputAmountPerTotalHa;

	@Column(name = "DIESEL_QUANTITY_PER_TOTAL_HA")
	Double dieselQuantityPerTotalHa;

	@Column(name = "DIESEL_AMOUNT_PER_TOTAL_HA")
	Double dieselAmountPerTotalHa;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getСropName() {
		return сropName;
	}

	public void setСropName(String сropName) {
		this.сropName = сropName;
	}

	public Double getTotalHa() {
		return totalHa;
	}

	public void setTotalHa(Double totalHa) {
		this.totalHa = totalHa;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Date getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(Date activityDate) {
		this.activityDate = activityDate;
	}

	public String getInputBudgetName() {
		return inputBudgetName;
	}

	public void setInputBudgetName(String inputBudgetName) {
		this.inputBudgetName = inputBudgetName;
	}

	public String getInputBudgetType() {
		return inputBudgetType;
	}

	public void setInputBudgetType(String inputBudgetType) {
		this.inputBudgetType = inputBudgetType;
	}

	public Double getNormPerHa() {
		return normPerHa;
	}

	public void setNormPerHa(Double normPerHa) {
		this.normPerHa = normPerHa;
	}

	public Double getUsedHectars() {
		return usedHectars;
	}

	public void setUsedHectars(Double usedHectars) {
		this.usedHectars = usedHectars;
	}

	public Double getInputQuantityTotal() {
		return inputQuantityTotal;
	}

	public void setInputQuantityTotal(Double inputQuantityTotal) {
		this.inputQuantityTotal = inputQuantityTotal;
	}

	public Double getInputAmountTotal() {
		return inputAmountTotal;
	}

	public void setInputAmountTotal(Double inputAmountTotal) {
		this.inputAmountTotal = inputAmountTotal;
	}

	public Double getDieselNormPerHa() {
		return dieselNormPerHa;
	}

	public void setDieselNormPerHa(Double dieselNormPerHa) {
		this.dieselNormPerHa = dieselNormPerHa;
	}

	public Double getDIESEL_TOTAL_QUANTITY() {
		return DIESEL_TOTAL_QUANTITY;
	}

	public void setDIESEL_TOTAL_QUANTITY(Double DIESEL_TOTAL_QUANTITY) {
		this.DIESEL_TOTAL_QUANTITY = DIESEL_TOTAL_QUANTITY;
	}

	public Double getDieselTotal() {
		return dieselTotal;
	}

	public void setDieselTotal(Double dieselTotalUah) {
		this.dieselTotal = dieselTotalUah;
	}


	public Double getInputQuantityPerTotalHa() {
		return inputQuantityPerTotalHa;
	}

	public void setInputQuantityPerTotalHa(Double inputQuantityPerTotalHa) {
		this.inputQuantityPerTotalHa = inputQuantityPerTotalHa;
	}

	public Double getDieselAmountPerTotalHa() {
		return dieselAmountPerTotalHa;
	}

	public void setDieselAmountPerTotalHa(Double dieselAmountPerTotalHa) {
		this.dieselAmountPerTotalHa = dieselAmountPerTotalHa;
	}

	public Double getInputAmountPerTotalHa() {
		return inputAmountPerTotalHa;
	}

	public void setInputAmountPerTotalHa(Double inputAmountPerTotalHa) {
		this.inputAmountPerTotalHa = inputAmountPerTotalHa;
	}
}
