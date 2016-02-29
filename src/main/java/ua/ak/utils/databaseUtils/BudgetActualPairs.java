package ua.ak.utils.databaseUtils;

/**
 * Created by Adm on 28.02.2016.
 */
public class BudgetActualPairs {

    String budgetName;
    String actualsName;


    public BudgetActualPairs(String budgetName, String actualsName) {
        this.budgetName = budgetName;
        this.actualsName = actualsName;
    }


    public String getBudgetName() {
        return budgetName;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
    }

    public String getActualsName() {
        return actualsName;
    }

    public void setActualsName(String actualsName) {
        this.actualsName = actualsName;
    }
}
