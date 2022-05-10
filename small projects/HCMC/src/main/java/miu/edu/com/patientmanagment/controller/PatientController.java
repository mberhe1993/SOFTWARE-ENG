package miu.edu.com.patientmanagment.controller;



import miu.edu.com.patientmanagment.domain.Patient;

import miu.edu.com.patientmanagment.dto.PatientDto;
import miu.edu.com.patientmanagment.service.implementation.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/patients")
public class PatientController {



    @Autowired
    private PatientServiceImpl patientService;

    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatient();
    }

    @PostMapping("/create")
    public Patient save(@RequestBody PatientDto patientDto) {
        Patient patient=new Patient();
        patient.setPatientId(patientDto.getPatientId());
        patient.setAge(patientDto.getAge());
        patient.setEmail(patientDto.getEmail());
        patient.setContactPhoneNumber(patientDto.getContactPhoneNumber());
        patient.setFullName(patientDto.getFullName());
        patient.setIsAnOut(patientDto.getIsAnOut());
        return patientService.save(patient);
    }

}
