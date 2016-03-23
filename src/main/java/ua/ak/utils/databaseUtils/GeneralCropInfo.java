package ua.ak.utils.databaseUtils;

import ua.ak.utils.dto.InputSumQAndAmount;
import ua.ak.utils.dto.InputSumQAndAmountActBudDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adm on 28.02.2016.
 */

// keeps all initial  inforamtion for crops parameters  , can be moved to database

public class GeneralCropInfo {
    //TODO: use as singelton
    private List<BudgetActualPairs> budgetActualPairsList = new ArrayList<BudgetActualPairs>();
    private static GeneralCropInfo instanse;
    private List<String> inputsSceleton = new ArrayList<String>();
    public static final double BUDGETED_XRATE_2016 = 23.;


    private GeneralCropInfo() {
        intiateBudgetActualPairs();
        intiateInputsSceletion();
    }

    public String getBudgetNameByActualName(String actualCropName) {
        String result = null;
        //budgetActualPairsList
        for (BudgetActualPairs el : budgetActualPairsList) {
            if (el.getActualsName().equals(actualCropName)) {
                return result = el.getBudgetName();
            }
        }


        return result = "no_crop_found";
    }

    public static GeneralCropInfo getInstance() {

        if (instanse == null) {
            return instanse = new GeneralCropInfo();
        }
        return instanse;
    }

    private List<BudgetActualPairs> intiateBudgetActualPairs() {
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Winter wheat 2016", "WW"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Winter barley 2016", "WB"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Winter rapeseed 2016", "OSR"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Soya 2016", "Soya"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Peas, Beans & chick-pea 2016", "Peas"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Spring wheat 2016", "SW"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Sunflower 2016", "SF"));
        budgetActualPairsList.add(new BudgetActualPairs("(Crops) Mulching", "Mulching"));

        return budgetActualPairsList;
    }

    private List<String> intiateInputsSceletion() {

        inputsSceleton.add("Seed.Winter Wheat");
        inputsSceleton.add("Seed.Winter Rapeseed");
        inputsSceleton.add("Seed.Winter Barley");
        inputsSceleton.add("Seed.Sunflower");
        inputsSceleton.add("Seed.Maize");
        inputsSceleton.add("Seed.Peas");
        inputsSceleton.add("Seed.Spring Wheat");

        inputsSceleton.add("Fertilisers.Classic");
        inputsSceleton.add("Fertilisers.Microfertiliser");

        inputsSceleton.add("Chemicals.Herbicide");
        inputsSceleton.add("Chemicals.Fungicide");
        inputsSceleton.add("Chemicals.Insecticide");
        inputsSceleton.add("Chemicals.Desiccant");
        inputsSceleton.add("Chemicals.Growth regulator");
        inputsSceleton.add("Chemicals.Treatment");
        inputsSceleton.add("Chemicals.Crop Oil");
        inputsSceleton.add("Chemicals.Other");

        return inputsSceleton;
    }


    public List<InputSumQAndAmountActBudDTO> sortOnSceleton(List<InputSumQAndAmount> actualsList, List<InputSumQAndAmount> budgetlsList) {
        List<InputSumQAndAmountActBudDTO> result = new ArrayList<InputSumQAndAmountActBudDTO>();


        for (String inScel : inputsSceleton) {
            double aQty = 0.;
            double aAmount = 0.;

            double bQty = 0.;
            double bAmount = 0.;
            int counter=0;

            for (InputSumQAndAmount actuals : actualsList) {
                if (inScel.equals(actuals.getInputName())) {
                    aQty = actuals.getQty();
                    aAmount = actuals.getAmount();
                    counter++;
                }
            }

            for (InputSumQAndAmount budget : budgetlsList) {
                if (inScel.equals(budget.getInputName())) {
                    bQty = budget.getQty();
                    bAmount = budget.getAmount();
                    counter++;

                }

            }
            if (counter > 0) {
                result.add(new InputSumQAndAmountActBudDTO(inScel, aQty, aAmount, inScel , bQty, bAmount));
            }



        }




        return result;
    }


    public List<BudgetActualPairs> getBudgetActualPairsList() {
        return budgetActualPairsList;
    }

    public List<String> getInputsSceleton() {
        return inputsSceleton;
    }
}
