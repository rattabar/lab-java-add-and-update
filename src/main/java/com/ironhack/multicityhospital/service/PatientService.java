package com.ironhack.multicityhospital.service;


import com.ironhack.multicityhospital.model.Patient;
import com.ironhack.multicityhospital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j

public class PatientService {
    private final PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        log.info("Get all patients");
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long patientId) {
        log.info("Get patient by patientId");
        return patientRepository.findById(patientId);
    }

    public Patient addNewPatient(Patient patient){
        log.info("adding new patient {}", patient);
        return patientRepository.save(patient);
    }

    public void deletePatient(Long patientId){
        log.info("Removing patient with id {}", patientId);

        patientRepository.deleteById(patientId);
    }
}
