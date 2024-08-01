package com.ironhack.multicityhospital.repository;

import com.ironhack.multicityhospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
