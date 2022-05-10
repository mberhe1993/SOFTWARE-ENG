package miu.edu.com.patientmanagment.dto;

import lombok.Data;

@Data
public class PatientDto {
    private String patientId;
    private String isAnOut;
    private String fullName;
    private String email;
    private String contactPhoneNumber;
    private Integer age;
}
