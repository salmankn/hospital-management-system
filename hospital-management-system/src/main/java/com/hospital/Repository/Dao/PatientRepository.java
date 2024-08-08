package com.hospital.Repository.Dao;

import com.hospital.Model.PatientTable;
import com.hospital.Repository.Do.PatientDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientTable, Integer> {

    //List<PatientTable> findAll();
   // List<PatientTable> getAllPatient();

    //Optional<PatientDo> getPatientsById(int patients_id);
}
