package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import java.lang.reflect.Type;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Dto.PatientDto;
import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Exception.PatientNotFoundException;
import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Model.Patient;
import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Repository.PatientRepository;


/**
 * 
 * @author dines
 * @created Date 21/12
 * @description used implement the patient service
 *
 */
@Service
public class PatientServiceImpl implements PatientService {

	private final PatientRepository myPatientRepository;
	
	private final ModelMapper myModelMapper;
	
	@Autowired
	public PatientServiceImpl(PatientRepository myPatientRepository, ModelMapper myModelMapper)
	{
		this.myPatientRepository = myPatientRepository;
		this.myModelMapper = myModelMapper;
	}

	@Override
	public PatientDto savePatient(PatientDto myPatient) {
		
		Patient MyPatient = myModelMapper.map(myPatient, Patient.class);
		myPatientRepository.save(MyPatient);
		return myPatient;
	}

	@Override
	public List<PatientDto> getAllPatients() {
		
		List<Patient> MyPatients = myPatientRepository.findAll();
		Type listType = new TypeToken<List<PatientDto>>(){}.getType();
		List<PatientDto> myPatientDtoList = myModelMapper.map(MyPatients, listType);
		return myPatientDtoList;
	}

	@Override
	public PatientDto getPatientById(long id) {
		
		Patient myPatient = myPatientRepository.findById(id).get();
		PatientDto myPatientDto = myModelMapper.map(myPatient, PatientDto.class);
		return myPatientDto;
	}

	@Override
	public PatientDto updatePatientById(PatientDto myPatient, long id) {
		Patient MyPatient = myModelMapper.map(myPatient, Patient.class);
		myPatientRepository.findById(id).map(patient->{patient.setPatientName(MyPatient.getPatientName());
		patient.setGender(MyPatient.getGender());
		patient.setAge(MyPatient.getAge());
		patient.setMobile(MyPatient.getMobile());
		return myPatientRepository.save(MyPatient); }).orElseGet(()->{MyPatient.setId(id);
		return myPatientRepository.save(MyPatient);});
		return myPatient;
	}

	@Override
	public void deletePatientById(long id) {
		try {
			myPatientRepository.deleteById(id);
		}
		catch(Exception Ex){
			throw new PatientNotFoundException(id);
		}
		
	}

}
