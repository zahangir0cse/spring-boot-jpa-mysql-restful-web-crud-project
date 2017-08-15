package com.zahangir.repository;

import org.springframework.data.repository.CrudRepository;

import com.zahangir.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
