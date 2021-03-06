package edu.miu.cs.cs425.finalexampracticehcmcwebapp.controller;

import edu.miu.cs.cs425.finalexampracticehcmcwebapp.model.Patient;
import edu.miu.cs.cs425.finalexampracticehcmcwebapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/hcmcweb/api/patient")
public class PatientRestController {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/list")
    public List<Patient> displayAllPatients() {
        return patientService.getAllPatientsSorted();
    }
}
