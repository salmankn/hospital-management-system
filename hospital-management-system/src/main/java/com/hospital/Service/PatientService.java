package com.hospital.Service;

import com.hospital.Model.PatientTable;
import com.hospital.Repository.Dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    //get all patient details at once
    public List<PatientTable> getAllPatient() {
        List<PatientTable> patientTables = patientRepository.findAll();
        return patientTables;
    }

    //get a patient details
//    public PatientTable getPatientById(int patient_id){
//        Optional<PatientDo> patientDo = patientRepository.findById(patient_id);
//        if(patientDo.isPresent()){
//            PatientDo patientDo1 = patientDo.get();
//            PatientTable patientTable = new PatientTable();
//            patientTable.setPatient_id(patientDo1.getPatient_id());
//            patientTable.setFirst_name(patientDo1.getFirst_name());
//            patientTable.setLast_name(patientDo1.getLast_name());
//            patientTable.setDate_of_birth(patientDo1.getDate_of_birth());
//            patientTable.setPatient_age(patientDo1.getPatient_age());
//            patientTable.setGender(patientDo1.getGender());
//            patientTable.setContact_number(patientDo1.getContact_number());
//            patientTable.setEmail(patientDo1.getEmail());
//            patientTable.setAddress(patientDo1.getAddress());
//            patientTable.setPostal_code(patientDo1.getPostal_code());
//            patientTable.setEmergency_contact_name(patientDo1.getEmergency_contact_name());
//            patientTable.setEmergency_contact_phone(patientDo1.getEmergency_contact_phone());
//            patientTable.setEmergency_contact_relationship(patientDo1.getEmergency_contact_relationship());
//            return patientTable;
//        }
//        return null;
//    }



}