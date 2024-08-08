package com.hospital.Repository.Do;

import jakarta.persistence.*;
import org.hibernate.annotations.processing.Pattern;


@Entity
@Table(name = "Patient")
public class PatientDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patient_id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String patient_age;
    private String gender;
    private String contact_number;
    private String email;
    private String address;
    private String postal_code;
    private String emergency_contact_name;
    private String emergency_contact_phone;
    private String emergency_contact_relationship;

    public PatientDo(int patient_id, String first_name, String last_name, String date_of_birth, String patient_age, String gender, String contact_number, String email, String address, String postal_code, String emergency_contact_name, String emergency_contact_phone, String emergency_contact_relationship) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.patient_age = patient_age;
        this.gender = gender;
        this.contact_number = contact_number;
        this.email = email;
        this.address = address;
        this.postal_code = postal_code;
        this.emergency_contact_name = emergency_contact_name;
        this.emergency_contact_phone = emergency_contact_phone;
        this.emergency_contact_relationship = emergency_contact_relationship;
    }

    public PatientDo() {

    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getEmergency_contact_name() {
        return emergency_contact_name;
    }

    public void setEmergency_contact_name(String emergency_contact_name) {
        this.emergency_contact_name = emergency_contact_name;
    }

    public String getEmergency_contact_phone() {
        return emergency_contact_phone;
    }

    public void setEmergency_contact_phone(String emergency_contact_phone) {
        this.emergency_contact_phone = emergency_contact_phone;
    }

    public String getEmergency_contact_relationship() {
        return emergency_contact_relationship;
    }

    public void setEmergency_contact_relationship(String emergency_contact_relationship) {
        this.emergency_contact_relationship = emergency_contact_relationship;
    }
}
