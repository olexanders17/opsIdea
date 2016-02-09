package ua.ak.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ua.ak.domain.FieldOperation;

//only read from excel
public class ExcelReader {

	private Date date;
	private String fieldCode;
	private double fiedArea;
	private String operation;
	private double doneHa;
	private String tractor;
	private String registrationNumber;
	private String tractordriver;
	private double motorHours;
	private String equipment;
	private String serialNumber;
	private double fuelLiters;
	private String crop;
	private String seedsType;
	private double seedsUsageQty;
	private String fertilizerType;
	private double fertilizerUsageQty;
	private String chemicalsType;
	private double chemicalsUsageQty;
	private double year;

	private final int COL_DATE = 3;
	private final int COL_FIELD_CODE = 4;
	private final int COL_FIELD_AREA = 5;
	private final int COL_OPERATION = 6;
	private final int COL_DONE_HA = 7;
	private final int COL_TRACTOR = 8;
	private final int COL_REGISTRATION_NUMBER = 9;
	private final int COL_TRACTOR_DRIVER = 10;
	private final int COL_MOTOR_HOURS = 11;
	private final int COL_EQUIPMENT = 12;
	private final int COL_SERIAL_NUMBER = 13;
	private final int COL_FUEL_LITERS = 14;
	private final int COL_CROP = 15;
	private final int COL_SEEDS_TYPE = 16;
	private final int COL_SEEDS_USAGE_QTY = 17;
	private final int COL_FERTILIZER_TYPE = 18;
	private final int COL_FERTILIZER_USAGE_QTY = 19;
	private final int COL_CHEMICALS_TYPE = 20;
	private final int COL_CHEMICALS_USAGE_QTY = 21;
	private final int COL_YEAR = 22;

	private String FILE_NAME; // "Ops.xlsx";
	private final String WORKSHEET_NAME = "Dailyactivities";
	private final int ROW_HEADER = 1;
	private final int MAX_ROW_FROM_EXCEL = 20000;

	public ExcelReader(String FILE_NAME) {
		this.FILE_NAME=FILE_NAME;
	}

	public List<FieldOperation> getAllOperations() {
		List<FieldOperation> listFieldOperation = new ArrayList<FieldOperation>();
		try {

		} catch (Exception e) {

		}
		try {

			InputStream in = new FileInputStream(FILE_NAME);
			XSSFWorkbook exelBook = new XSSFWorkbook(in);
			XSSFSheet excelSheet = exelBook.getSheetAt(0);
			XSSFRow currentRow;

			for (int i = ROW_HEADER + 1; i < MAX_ROW_FROM_EXCEL; i++) {
				currentRow = excelSheet.getRow(i);
				System.out.println(i);
				// check in date is appicable

				if (currentRow == null || currentRow.getCell(COL_DATE).getRawValue() == null || currentRow.getCell(COL_DATE).getRawValue() == "") {
					continue;
				}

				date = DateUtil.getJavaDate(Double.parseDouble(currentRow.getCell(COL_DATE).getRawValue()));
				fieldCode = currentRow.getCell(COL_FIELD_CODE).getStringCellValue();
				fiedArea = currentRow.getCell(COL_FIELD_AREA).getNumericCellValue();
				operation = currentRow.getCell(COL_OPERATION).getStringCellValue();
				doneHa = currentRow.getCell(COL_DONE_HA).getNumericCellValue();
				tractor = currentRow.getCell(COL_TRACTOR).getStringCellValue();
				registrationNumber = currentRow.getCell(COL_REGISTRATION_NUMBER).getStringCellValue();
				tractordriver = currentRow.getCell(COL_TRACTOR_DRIVER).getStringCellValue();
				motorHours = currentRow.getCell(COL_MOTOR_HOURS).getNumericCellValue();
				equipment = currentRow.getCell(COL_EQUIPMENT).getStringCellValue();
				serialNumber = currentRow.getCell(COL_SERIAL_NUMBER).getStringCellValue();
				fuelLiters = currentRow.getCell(COL_FUEL_LITERS).getNumericCellValue();
				crop = currentRow.getCell(COL_CROP).getStringCellValue();
				seedsType = currentRow.getCell(COL_SEEDS_TYPE).getStringCellValue();
				seedsUsageQty = currentRow.getCell(COL_SEEDS_USAGE_QTY).getNumericCellValue();
				fertilizerType = currentRow.getCell(COL_FERTILIZER_TYPE).getStringCellValue();
				fertilizerUsageQty = currentRow.getCell(COL_FERTILIZER_USAGE_QTY).getNumericCellValue();
				chemicalsType = currentRow.getCell(COL_CHEMICALS_TYPE).getStringCellValue();
				chemicalsUsageQty = currentRow.getCell(COL_CHEMICALS_USAGE_QTY).getNumericCellValue();
				year = currentRow.getCell(COL_YEAR).getNumericCellValue();

				listFieldOperation.add(new FieldOperation(date, fieldCode, fiedArea, operation, doneHa, tractor, registrationNumber, tractordriver,
						motorHours, equipment, serialNumber, fuelLiters, crop, seedsType, seedsUsageQty, fertilizerType, fertilizerUsageQty,
						chemicalsType, chemicalsUsageQty, year));

			}

			exelBook.close();

		} catch (IOException e) {
			e.printStackTrace();

		}

		return listFieldOperation;

	}

}
