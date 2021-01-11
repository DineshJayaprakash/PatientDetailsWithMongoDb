package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Service;

import java.util.List;

import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Dto.PatientDto;

/**
 * interface PatientService
 * 
 * @author dines
 * @created Date 21/12
 * @description used to implement the crud operations using repository
 *
 */
public interface PatientService {
	
	/**
	 * function savePatient
	 * 
	 * @param myPatient
	 * @return PatientDto
	 * @description used to save the Patient Details into db
	 */
	public PatientDto savePatient(PatientDto myPatient);
	
	/**
	 * function getAllPatients
	 * 
	 * @param none
	 * @return List of PatientDto
	 * @description used to get all the Patient Details from db
	 */
	public List<PatientDto> getAllPatients();
	
	/**
	 * function getPatientById
	 * 
	 * @param id
	 * @return PatientDto
	 * @description used to get the details of the patient for given id
	 */
	public PatientDto getPatientById(long id);
	
	/**
	 * function updatePatientById
	 * 
	 * @param myPatient,id
	 * @return PatientDto
	 * @description used to update the details of patient by id
	 */
	public PatientDto updatePatientById(PatientDto myPatient, long id);
	
	/**
	 * function deletePatientById
	 * 
	 * @param id
	 * @return none
	 * @description delete the patient details by Id
	 */
	public void deletePatientById(long id);
	
	

}
