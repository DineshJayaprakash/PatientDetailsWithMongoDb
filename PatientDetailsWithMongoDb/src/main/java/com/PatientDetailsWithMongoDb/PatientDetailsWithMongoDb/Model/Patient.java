package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * class Patient
 * 
 * 
 * @author dines
 * @created Date 21/12
 * @description Layout to add the datas into Collection of NosqlDb
 *
 */

@Data
@Document(collection = "Patient")
public class Patient {
	
	/**
	 *  Id of the patient
	 */
	@Id
	private long id;
	
	/**
	 *  Name of the patient
	 */
	private String patientName;
	
	/**
	 *  Age of the Patient
	 */
	private String age;
	
	/**
	 *  Gender of the Patient
	 */
	private String gender;
	
	/** 
	 *  mobile no of the patient
	 */
	private String mobile;
	
	

}
