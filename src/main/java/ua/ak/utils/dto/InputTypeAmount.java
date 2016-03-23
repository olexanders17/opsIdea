package ua.ak.utils.dto;

/**
 * Created by Adm on 07.02.2016.
 */
@Deprecated
public class InputTypeAmount {

    public String inputTypeBudget;
    public Double SuminputAmount;



    public InputTypeAmount(String inputTypeBudget, Double suminputAmount) {
        this.inputTypeBudget = inputTypeBudget;
        SuminputAmount = suminputAmount;
    }


    public String getInputTypeBudget() {
        return inputTypeBudget;
    }

    public void setInputTypeBudget(String inputTypeBudget) {
        this.inputTypeBudget = inputTypeBudget;
    }

    public Double getSuminputAmount() {
        return SuminputAmount;
    }

    public void setSuminputAmount(Double suminputAmount) {
        SuminputAmount = suminputAmount;
    }

    @Override
    public String toString() {
        return "InputTypeAmount{" +
                "inputTypeBudget='" + inputTypeBudget + '\'' +
                ", SuminputAmount=" + SuminputAmount +
                '}';
    }


}
