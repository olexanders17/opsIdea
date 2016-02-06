package ua.ak.webservice;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import ua.ak.domain.FieldOperation;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FieldOperationWSDto  {
	
	@XmlElement(name = "listOperations")
	public List<FieldOperation> list;
	
	

}
