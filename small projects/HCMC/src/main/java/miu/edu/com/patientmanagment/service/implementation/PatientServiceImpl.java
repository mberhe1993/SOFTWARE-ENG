package miu.edu.com.patientmanagment.service.implementation;

import miu.edu.com.patientmanagment.domain.Patient;
import miu.edu.com.patientmanagment.repository.PatientRepository;
import miu.edu.com.patientmanagment.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }
}
