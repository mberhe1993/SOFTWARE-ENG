package miu.edu.com.patientmanagment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue
    private Integer id;
    private String patientId;
    private String isAnOut;
    private String fullName;
    private String email;
    private String contactPhoneNumber;
    private Integer age;

}