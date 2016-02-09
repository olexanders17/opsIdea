package ua.ak.utils.dto;

/**
 * Created by Adm on 08.02.2016.
 */
//use for actuals- budget proforma
public class InputSumQAndAmount {

    String inputName;
    Double qty;
    Double amount;


    public InputSumQAndAmount(String inputName, Double qty, Double amount) {
        this.inputName = inputName;
        this.qty = qty;
        this.amount = amount;
    }


    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InputSumQAndAmount{" +
                "inputName='" + inputName + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
