package ua.ak.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "INPUTS")
public class Inputs {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "INPUTS_NAME")
	private String inputsName;

	@Column(name = "INPUTS_NAME_BUDGET")
	private String inputsNameBudget;

	@Column(name = "INPUTS_TYPE")
	private String inputsType;

	@Column(name = "INPUTS_PRICE")
	private Double inputsPrice;

	public Inputs() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInputsName() {
		return inputsName;
	}

	public void setInputsName(String inputsName) {
		this.inputsName = inputsName;
	}

	public String getInputsType() {
		return inputsType;
	}

	public void setInputsType(String inputsType) {
		this.inputsType = inputsType;
	}

	public Double getInputsPrice() {
		return inputsPrice;
	}

	public void setInputsPrice(Double inputsPrice) {
		this.inputsPrice = inputsPrice;
	}

	public String getInputsNameBudget() {
		return inputsNameBudget;
	}

	public void setInputsNameBudget(String inputsNameBudget) {
		this.inputsNameBudget = inputsNameBudget;
	}

}
