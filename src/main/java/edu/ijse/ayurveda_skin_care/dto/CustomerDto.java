package edu.ijse.ayurveda_skin_care.dto;

import java.time.LocalDate;

public class CustomerDto {
    private String customer_Id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String profile_Id;
    private LocalDate registration_Date;


    public CustomerDto() {
    }

    public CustomerDto(String customer_Id, String name, int age, String email, String phone, String address, String profile_Id, LocalDate registration_Date) {
        this.customer_Id = customer_Id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.profile_Id = profile_Id;
        this.registration_Date = registration_Date;
    }

    public String getCustomer_Id() {
        return customer_Id;
    }
    public void setCustomer_Id(String customer_Id) {
        this.customer_Id = customer_Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getProfile_Id() {
        return profile_Id;
    }
    public void setProfile_Id(String profile_Id) {
        this.profile_Id = profile_Id;
    }
    public LocalDate getRegistration_Date() {
        return registration_Date;
    }
    public void setRegistration_Date(LocalDate registration_Date) {
        this.registration_Date = registration_Date;
    }
    public String toString() {
        return "CustomerDto{" + "customer_Id=" + customer_Id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address=" + address + ", profile_Id=" + profile_Id + ", registration_Date=" + registration_Date + '}';
    }
}