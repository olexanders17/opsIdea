package ua.ak.domain;

import java.util.Date;

import javax.persistence.*;

@Entity(name = "FIELD_OPERATION")
public class FieldOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "DATE_OPERATION")
	private Date date;

	@Column(name = "FIELD_CODE")
	private String fieldCode;

	@Column(name = "FIED_AREA")
	private double fiedArea;

	@Column(name = "OPERATION")
	private String operation;

	@Column(name = "DONE_HA")
	private double doneHa;

	@Column(name = "TRACTOR")
	private String tractor;

	@Column(name = "REGISTRATION_NUMBER")
	private String registrationNumber;

	@Column(name = "TRACTOR_DRIVER")
	private String tractordriver;

	@Column(name = "MOTOR_HOURS")
	private double motorHours;

	@Column(name = "EQUIPMENT")
	private String equipment;

	@Column(name = "SERIAL_NUMBER")
	private String serialNumber;

	@Column(name = "FUEL_LITERS")
	private double fuelLiters;

	@Column(name = "CROP")
	private String crop;
	////////////////////////////
	@Column(name = "INPUT_NAME")
	private String inputName;

	@Column(name = "INPUT_USAGE_QTY")
	private double inputUsageQty;

	@Column(name = "INPUT_AMOUNT")
	private double inputAmount;

	@Column(name = "YEAR")
	private double year;

	@Column(name = "INPUT_NAME_BUDGET")
	private String seedsNameBudget;

	@Column(name = "INPUT_TYPE_BUDGET")
	private String inputTypeBudget;

/*	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "some_id")
	FieldProfile fieldProfile;*/


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getInputAmount() {
		return inputAmount;
	}

	public void setInputAmount(double seedsAmount) {
		this.inputAmount = seedsAmount;
	}

	public FieldOperation() {

	}

	public FieldOperation(Date date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor, String registrationNumber,
			String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop, String seedsType,
			double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year) {
		super();
		this.date = date;
		this.fieldCode = fieldCode;
		this.fiedArea = fiedArea;
		this.operation = operation;
		this.doneHa = doneHa;
		this.tractor = tractor;
		this.registrationNumber = registrationNumber;
		this.tractordriver = tractordriver;
		this.motorHours = motorHours;
		this.equipment = equipment;
		this.serialNumber = serialNumber;
		this.fuelLiters = fuelLiters;
		this.crop = crop;
		this.inputName = seedsType;
		this.inputUsageQty = seedsUsageQty;
		this.year = year;
	}

	public FieldOperation(Date date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor, String registrationNumber,
			String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop, String seedsName,
			double seedsUsageQty, double year) {
		super();

		this.date = date;
		this.fieldCode = fieldCode;
		this.fiedArea = fiedArea;
		this.operation = operation;
		this.doneHa = doneHa;
		this.tractor = tractor;
		this.registrationNumber = registrationNumber;
		this.tractordriver = tractordriver;
		this.motorHours = motorHours;
		this.equipment = equipment;
		this.serialNumber = serialNumber;
		this.fuelLiters = fuelLiters;
		this.crop = crop;
		this.inputName = seedsName;
		this.inputUsageQty = seedsUsageQty;
		this.year = year;
	}

	public FieldOperation(Date date, String fieldCode, double fiedArea) {
		super();
		this.date = date;
		this.fieldCode = fieldCode;
		this.fiedArea = fiedArea;
	}

	private void calculateAmounts() {

		// seedsAmount=seedsUsageQty*

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public double getFiedArea() {
		return fiedArea;
	}

	public void setFiedArea(double fiedArea) {
		this.fiedArea = fiedArea;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getDoneHa() {
		return doneHa;
	}

	public void setDoneHa(double doneHa) {
		this.doneHa = doneHa;
	}

	public String getTractor() {
		return tractor;
	}

	public void setTractor(String tractor) {
		this.tractor = tractor;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getTractordriver() {
		return tractordriver;
	}

	public void setTractordriver(String tractordriver) {
		this.tractordriver = tractordriver;
	}

	public double getMotorHours() {
		return motorHours;
	}

	public void setMotorHours(double motorHours) {
		this.motorHours = motorHours;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getFuelLiters() {
		return fuelLiters;
	}

	public void setFuelLiters(double fuelLiters) {
		this.fuelLiters = fuelLiters;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String seedsType) {
		this.inputName = seedsType;
	}

	public double getInputUsageQty() {
		return inputUsageQty;
	}

	public void setInputUsageQty(double seedsUsageQty) {
		this.inputUsageQty = seedsUsageQty;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public String getSeedsNameBudget() {
		return seedsNameBudget;
	}

	public void setSeedsNameBudget(String seedsNameBudget) {
		this.seedsNameBudget = seedsNameBudget;
	}

	public String getInputTypeBudget() {
		return inputTypeBudget;
	}

	public void setInputTypeBudget(String seedsTypeBudget) {
		this.inputTypeBudget = seedsTypeBudget;
	}

	@Override
	public String toString() {
		return "FieldOperation [id=" + id + ", date=" + date + ", fieldCode=" + fieldCode + ", fiedArea=" + fiedArea + ", operation=" + operation
				+ ", doneHa=" + doneHa + ", tractor=" + tractor + ", registrationNumber=" + registrationNumber + ", tractordriver=" + tractordriver
				+ ", motorHours=" + motorHours + ", equipment=" + equipment + ", serialNumber=" + serialNumber + ", fuelLiters=" + fuelLiters
				+ ", crop=" + crop + ", inputName=" + inputName + ", inputUsageQty=" + inputUsageQty + ", inputAmount=" + inputAmount + ", year="
				+ year + ", seedsNameBudget=" + seedsNameBudget + ", seedsTypeBudget=" + inputTypeBudget + "]";
	}

}
