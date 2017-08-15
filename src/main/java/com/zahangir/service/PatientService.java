package com.zahangir.service;

import java.util.List;

import com.zahangir.model.Patient;

public interface PatientService {
	
	void addPatient(Patient patient);
	void updatePatient(Patient patient);
	Patient getPatient(int id);
	List<Patient> getAllPatient();
	void deletePatient(int id);
	

}
