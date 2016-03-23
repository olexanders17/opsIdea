package ua.ak.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ak.dao.*;
import ua.ak.domain.FieldOperation;
import ua.ak.domain.FieldProfile;
import ua.ak.domain.Inputs;
import ua.ak.service.FieldOperationService;
import ua.ak.utils.AllFieldsTableUtil;
import ua.ak.utils.AmountsForFieldOperations;
import ua.ak.utils.ExcelReaderSingleColumn;
import ua.ak.utils.databaseUtils.GeneralCropInfo;
import ua.ak.utils.dto.InputSumQAndAmount;
import ua.ak.utils.dto.InputSumQAndAmountActBudDTO;

@Service()
public class FieldOperationServiceImpl implements FieldOperationService {

    @Autowired
    private FieldOperationDao dao;
    @Autowired
    private FieldProfileDao fieldProfileDao;

    @Autowired
    private InputsDao daoInputs;

    @Autowired
    private AmountsForFieldOperations afo;

    @Autowired
    private InputsBudgetDaoCustom inputsBudgetDaoCustom;

    @Autowired
    private FieldOperationDaoCustom fieldOperationDaoCustom;

    public void add(double date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor, String registrationNumber,
                    String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop, String seedsType,
                    double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty, double year,
                    double seedsAmount, double fertilizerAmount, double chemicalsAmount) {
        Date dataC;
        // DateUtil.getJavaDate(Double.parseDouble(c;
        // dao.save(new FieldOperation(dateC, fieldCode, fiedArea, operation,
        // doneHa, tractor, registrationNumber, tractordriver, motorHours,
        // equipment, serialNumber, fuelLiters, crop, seedsType, seedsUsageQty,
        // fertilizerType, fertilizerUsageQty, chemicalsType, chemicalsUsageQty,
        // year));

    }

    public void update(long id, String date, String fieldCode, double fiedArea, String operation, double doneHa, String tractor,
                       String registrationNumber, String tractordriver, double motorHours, String equipment, String serialNumber, double fuelLiters, String crop,
                       String seedsType, double seedsUsageQty, String fertilizerType, double fertilizerUsageQty, String chemicalsType, double chemicalsUsageQty,
                       double year, double seedsAmount, double fertilizerAmount, double chemicalsAmount) {

    }

    public List<FieldOperation> getAll() {
        return dao.findAll();
    }

    public FieldOperation getById(Long id) {
        return dao.getOne(id);
    }

    public void delete(Long id) {

    }

    public void add(FieldOperation fieldOperation) {
        dao.save(fieldOperation);

    }

    public FieldOperationDao getDao() {
        return dao;
    }

    public void setDao(FieldOperationDao dao) {
        this.dao = dao;
    }


    public FieldProfileDao getFieldProfileDao() {
        return fieldProfileDao;
    }

    public void setFieldProfileDao(FieldProfileDao fieldProfileDao) {
        this.fieldProfileDao = fieldProfileDao;
    }

    public FieldOperationDaoCustom getFieldOperationDaoCustom() {
        return fieldOperationDaoCustom;
    }

    public void setFieldOperationDaoCustom(FieldOperationDaoCustom fieldOperationDaoCustom) {
        this.fieldOperationDaoCustom = fieldOperationDaoCustom;
    }

    // Just only load
    @Override
    public void fromExceltoDatabse(String filename) {

        ExcelReaderSingleColumn er = new ExcelReaderSingleColumn(filename);
        List<FieldOperation> list = er.getAllOperations();
        List<Inputs> inputsList = daoInputs.findAll();

        // List<FieldOperation> foAfterAmounts= afo.getAmounts(list,
        // inputsList);

        // update amounts
        for (FieldOperation fieldOperation : list) {
            afo.getAmounts(fieldOperation, inputsList);

        }

        dao.save(list);

    }

    @Override
    public void updateBudgetDataNames() {
        List<FieldOperation> foList = dao.findAll();
        List<Inputs> inputsList = daoInputs.findAll();

        // attach budget names
        for (FieldOperation fo : foList) {
            for (Inputs inputs : inputsList) {

                if ((fo.getInputName() != null) && (inputs.getInputsName() != null) && fo.getInputName().equals(inputs.getInputsName())) {
                    fo.setInputName(inputs.getInputsNameBudget());
                    dao.save(fo);
                }

            }

        }
        // recalualte total amounts
        for (FieldOperation fo : foList) {
            for (Inputs inputs : inputsList) {

                if ((fo.getInputName() != null) && (inputs.getInputsName() != null) && fo.getInputName().equals(inputs.getInputsName())) {
                    fo.setInputAmount(fo.getInputUsageQty() * inputs.getInputsPrice());
                    dao.save(fo);
                }

            }

        }
    }


    @Deprecated
    public List<AllFieldsTableUtil> ActBudgetAllfields() {

        List<FieldOperation> listFieldOperationsOr = dao.findAll();
        List<FieldOperation> listFieldOperations = new ArrayList<FieldOperation>();

        for (FieldOperation fo : listFieldOperationsOr) {
            if (fo.getYear() == Double.parseDouble("2015")) {
                listFieldOperations.add(fo);
            }

        }

        for (FieldOperation fo2 : listFieldOperations) {
            System.out.println(fo2);

        }

        return null;

    }

    @Override
    public void deleteAll() {
        dao.deleteAll();

    }

    @Override
    public void test() {
        System.out.println("METHOD TEST");
        FieldProfile fieldProfile = fieldProfileDao.findOne(189L);

        System.out.println("!!!dao = " + fieldProfile);


    }


    public List<InputSumQAndAmountActBudDTO> actBudOneField(String fieldCode) {
        //TODO: sort and clean

        // for actuals
        List<InputSumQAndAmount> actualsInputSumQAndAmountList = fieldOperationDaoCustom.SumQAndAmount(fieldCode);

        System.out.println(" 2 .actualsInputSumQAndAmountList = " + actualsInputSumQAndAmountList);
        //for budget
        String cropInActualsFormat = findCropByCode(fieldCode); //get crop in actual format

        //TODO: add year
        String cropInBudgetFormat = GeneralCropInfo.getInstance().getBudgetNameByActualName(cropInActualsFormat);


        //to transfer in budget format
        List<InputSumQAndAmount> budgetInputSumQAndAmountList = inputsBudgetDaoCustom.SumQAndAmount(cropInBudgetFormat);

        System.out.println(" 1 .budgetInputSumQAndAmountList = " + budgetInputSumQAndAmountList);

        //get soted DTO to fill field profile actuals budget comparsion
        List<InputSumQAndAmountActBudDTO> rezult = GeneralCropInfo.getInstance().sortOnSceleton(actualsInputSumQAndAmountList, budgetInputSumQAndAmountList);

        System.out.println("FieldOperationServiceImpl.actBudOneField");
        System.out.println("rez = " + rezult);


        return rezult;
    }


    @Override
    public List<InputSumQAndAmountActBudDTO> actBudOneFieldPerHa(String fieldCode) {


        List<InputSumQAndAmount> actualsInputSumQAndAmountList = fieldOperationDaoCustom.SumQAndAmount(fieldCode);

        String cropInActualsFormat = findCropByCode(fieldCode); //get crop in actual format
        String cropInBudgetFormat = GeneralCropInfo.getInstance().getBudgetNameByActualName(cropInActualsFormat);

        List<InputSumQAndAmount> budgetInputSumQAndAmountList = inputsBudgetDaoCustom.SumQAndAmountPerHa(cropInBudgetFormat);
        List<InputSumQAndAmountActBudDTO> result = GeneralCropInfo.getInstance().sortOnSceleton(actualsInputSumQAndAmountList, budgetInputSumQAndAmountList);

        return result;
    }


    @Override
    public String findCropByCode(String fieldCode) {
        return fieldOperationDaoCustom.findCropByField(fieldCode);

    }


}
