package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Dto.PatientDto;
import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Service.PatientService;

/**
 * class PatientDetails
 * 
 * @author dines
 * @created By 21/12
 * @description used to map the end points 
 *
 */

@RestController
@RequestMapping("patients")
public class PatientDetails {
	
	/**
	 * bean of Patient Service
	 */
	private final PatientService myPatientService;
	
	/**
	 * parameterized constructor
	 * 
	 * @param myPatientService
	 * @description used to initialize the bean
	 */
	@Autowired
	public PatientDetails(PatientService myPatientService)
	{
		this.myPatientService = myPatientService;
	}
	
	/**
	 * function getAllPatients
	 * 
	 * @return List Of Patients
	 * @description used to display the list of patients available from db
	 */
	@GetMapping("")
	public List<PatientDto> getAllPatients()
	{
		return myPatientService.getAllPatients();
	}
	
	/**
	 * function addPatient
	 * 
	 * @param myPatient
	 * @return save Patient details to db
	 * @description used to add Patient details into db
	 */
	@PostMapping("")
	public PatientDto addPatient(@RequestBody PatientDto myPatient)
	{
		return myPatientService.savePatient(myPatient);
	}
	
	/**
	 * function getPatientById
	 * 
	 * @param id
	 * @return
	 * @description used to get Patient details based on id
	 */
	@GetMapping("/{id}")
	public PatientDto getPatientById(@PathVariable Long id)
	{
		return myPatientService.getPatientById(id);
	}
	
	/**
	 * function updatePatient
	 * 
	 * @param myPatient
	 * @param id
	 * @return updated patient details
	 * @description used to update patient details in db
	 */
	@PutMapping("/{id}")
	public PatientDto updatePatient(@RequestBody PatientDto myPatient, @PathVariable Long id)
	{
		return myPatientService.updatePatientById(myPatient, id);
	}
	
	/**
	 * function deletePatient
	 * 
	 * @param id
	 * @description used to delete patient details from db
	 */
	@DeleteMapping("/{id}")
	public void deletePatient(@PathVariable Long id)
	{
		 myPatientService.deletePatientById(id);
	}

}
