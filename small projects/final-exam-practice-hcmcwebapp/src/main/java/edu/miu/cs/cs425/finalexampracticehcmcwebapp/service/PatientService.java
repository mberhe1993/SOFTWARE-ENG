package edu.miu.cs.cs425.finalexampracticehcmcwebapp.service;

import edu.miu.cs.cs425.finalexampracticehcmcwebapp.model.Patient;

import java.util.List;

public interface PatientService {

    public abstract List<Patient> getAllPatientsSorted();
}
