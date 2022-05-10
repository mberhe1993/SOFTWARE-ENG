package miu.edu.com.patientmanagment.repository;


import miu.edu.com.patientmanagment.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
