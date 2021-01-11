package com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PatientDetailsWithMongoDb.PatientDetailsWithMongoDb.Model.Patient;

/**
 * interface PatientRepository
 * 
 * @author dines
 * @created By 21/12
 * @description used to add the fields into NoSql Db
 *
 */
public interface PatientRepository extends MongoRepository<Patient, Long>{

}
