package ua.ak.utils.dto;

import java.util.ArrayList;
import java.util.List;

public class InpuytsTypeUtil {

	private List<InputsTypeName> inputsTypeList;

	public InpuytsTypeUtil() {
		inputsTypeList = new ArrayList<InputsTypeName>();
		intialRecognition();
	}

	private List<InputsTypeName> intialRecognition(){
		
		inputsTypeList.add(new  InputsTypeName( "Seed.Rapeseed"));
		inputsTypeList.add(new  InputsTypeName( "Seed.Wheat"));
		inputsTypeList.add(new  InputsTypeName( "Seed.Barley"));
		inputsTypeList.add(new  InputsTypeName( "Fertilisers.Classic"));
		inputsTypeList.add(new  InputsTypeName( "Fertilisers.Microfertiliser"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Herbicide"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Fungicide"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Insecticide"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Desiccant"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Growth regulator"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Treatment"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Crop Oil"));
		inputsTypeList.add(new  InputsTypeName( "Chemicals.Other"));		
		
		return inputsTypeList;	
		
		
	}

	public List<InputsTypeName> getInputsTypeList() {
		return inputsTypeList;
	}

	
	
	
	
	
	
}
