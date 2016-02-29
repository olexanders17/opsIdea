package ua.ak.utils.databaseUtils;

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

    private GeneralCropInfo() {
        intiateBudgetActualPairs();
    }

    public  String getBudgetNameByActualName(String actualCropName) {
        String result = null;
        //budgetActualPairsList
        for (BudgetActualPairs el : budgetActualPairsList) {
            if (el.getActualsName().equals(actualCropName)) {
                return result = el.getActualsName();
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

    public List<BudgetActualPairs> getBudgetActualPairsList() {
        return budgetActualPairsList;
    }
}
