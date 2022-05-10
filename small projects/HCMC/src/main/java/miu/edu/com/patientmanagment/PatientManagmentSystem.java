package miu.edu.com.patientmanagment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientManagmentSystem {

    public static void main(String[] args) {
        SpringApplication.run(PatientManagmentSystem.class, args);
    }

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
