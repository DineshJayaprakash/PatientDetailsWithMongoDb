package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Dto;

import lombok.Data;

/**
 * class PatientDto
 * 
 * 
 * @author dines
 * @created Date 21/12
 * @description Layout to add the datas into Collection of NosqlDb
 *
 */

@Data
public class PatientDto {
	
	/**
	 *  Id of the patient
	 */
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
