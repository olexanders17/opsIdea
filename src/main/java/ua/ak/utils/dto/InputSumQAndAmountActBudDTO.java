package ua.ak.utils.dto;

import ua.ak.utils.databaseUtils.GeneralCropInfo;

/**
 * Created by Adm on 05.03.2016.
 */

/*  for sending   comparing  actual budget and contains full data  */
public class InputSumQAndAmountActBudDTO {

    private String actualsInputName;
    private Double actualsQty;
    private Double actualsAmount;

    private String budgetInputName;
    private Double budgetQty;
    private Double budgetAmount;

    private boolean isCurrencyAdj = false;

    public InputSumQAndAmountActBudDTO(String actualsInputName, Double actualsQty, Double actualsAmount, String budgetInputName, Double budgetQty, Double budgetAmount) {
        this.actualsInputName = actualsInputName;
        this.actualsQty = actualsQty;
        this.actualsAmount = actualsAmount;
        this.budgetInputName = budgetInputName;
        this.budgetQty = budgetQty;
        this.budgetAmount = budgetAmount;
    }





    public String getActualsInputName() {
        return actualsInputName;
    }

    public void setActualsInputName(String actualsInputName) {
        this.actualsInputName = actualsInputName;
    }

    public Double getActualsQty() {
        return actualsQty;
    }

    public void setActualsQty(Double actualsQty) {
        this.actualsQty = actualsQty;
    }

    public Double getActualsAmount() {
        return actualsAmount;
    }

    public void setActualsAmount(Double actualsAmount) {
        this.actualsAmount = actualsAmount;
    }

    public String getBudgetInputName() {
        return budgetInputName;
    }

    public void setBudgetInputName(String budgetInputName) {
        this.budgetInputName = budgetInputName;
    }

    public Double getBudgetQty() {
        return budgetQty;
    }

    public void setBudgetQty(Double budgetQty) {
        this.budgetQty = budgetQty;
    }

    public Double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    @Override
    public String toString() {
        return "InputSumQAndAmountActBudDTO{" +
                "actualsInputName='" + actualsInputName + '\'' +
                ", actualsQty=" + actualsQty +
                ", actualsAmount=" + actualsAmount +
                ", budgetInputName='" + budgetInputName + '\'' +
                ", budgetQty=" + budgetQty +
                ", budgetAmount=" + budgetAmount +
                '}';
    }
}
