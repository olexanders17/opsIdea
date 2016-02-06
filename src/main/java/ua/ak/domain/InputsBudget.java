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
	
	@Column(name = "DIESEL_TOTAL_UAH")
	Double dieselTotalUah;

}
