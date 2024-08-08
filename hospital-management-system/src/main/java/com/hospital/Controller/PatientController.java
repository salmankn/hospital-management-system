package com.hospital.Controller;

import com.hospital.Model.PatientTable;
import com.hospital.Repository.Do.PatientDo;
import com.hospital.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//we can use here for all handler we don't need to provide everytime writing handler
//@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patient")
    public List<PatientTable> getAllPatients(Model model){
        List<PatientTable> patients = patientService.getAllPatient();
        model.addAttribute("patient", patients);
        return "patient-list";
    }

    //Patient handler for get all patients details at once
//    @GetMapping("/patient")
//    public ResponseEntity<List<PatientTable>> getAllPatients(){
//       List<PatientTable> patient = patientService.getAllPatient();
//       if(patient.isEmpty()){
//           return ResponseEntity.noContent().build(); // 204 No Content for empty list
//       }else {
//           return ResponseEntity.ok(patient); // 200 OK with list of patients
//       }
//    }

    //Patient handler for get a patient
//    @GetMapping("/{id}")
//    public ResponseEntity<PatientTable> getPatientById(@PathVariable int id){
//        PatientTable patientdo = patientService.getPatientById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + id));
//        return ResponseEntity.ok(patientdo);
//        }

        // This can be useful if you want to catch exceptions that are not globally handled by the @ControllerAdvice
//        @GetMapping("/{id}")
//        public ResponseEntity<<String<PatientsTable>> getPatientById(@PathVariable int id, Model model) {
//        Optional<PatientTable> patient = patientService.getPatientById(id);
//            try {
//                Optional<PatientsTable> patient = patientsService.getPatientById(id);
//                return patient.map(ResponseEntity::ok)
//                        .orElseGet(() -> ResponseEntity.notFound().build());
//            } catch (Exception e) {
//                // Handle the exception locally
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//            }
//        }


    //}

}
