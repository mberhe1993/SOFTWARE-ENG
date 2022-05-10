package edu.miu.cs.cs425.finalexampracticehcmcwebapp.service.impl;

import edu.miu.cs.cs425.finalexampracticehcmcwebapp.model.Patient;
import edu.miu.cs.cs425.finalexampracticehcmcwebapp.repository.PatientRepository;
import edu.miu.cs.cs425.finalexampracticehcmcwebapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatientsSorted() {
        return patientRepository.findAll(Sort.by(Sort.Direction.ASC, "fullNames"));
    }

}
