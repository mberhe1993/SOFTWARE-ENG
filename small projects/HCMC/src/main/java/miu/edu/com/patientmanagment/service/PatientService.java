package miu.edu.com.patientmanagment.service;


import miu.edu.com.patientmanagment.domain.Patient;


import java.util.List;

public interface PatientService {
    Patient save(Patient patient);
   // Course save(Course course);
    List<Patient> getAllPatient();

}
