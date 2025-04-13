package edu.ijse.ayurveda_skin_care.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeesDto {
    private String employee_Id;
    private String name;
    private String email;
    private String phone;
    private int age;
    private String address;
    private BigDecimal salary;
    private String emergency_contact;
    private LocalDate hire_Date;
    private String position;
    private String status;

    public EmployeesDto() {
    }

    public EmployeesDto(String employee_Id, String name, String email, String phone, int age, String address, BigDecimal salary, String emergency_contact, LocalDate hire_Date, String position, String Status) {
        this.employee_Id = employee_Id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.emergency_contact = emergency_contact;
        this.hire_Date = hire_Date;
        this.position = position;
        this.status = Status;
    }

    public String getEmployee_Id() {
        return employee_Id;
    }
    public void setEmployee_Id(String employee_Id) {
        this.employee_Id = employee_Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public String getEmergency_contact() {
        return emergency_contact;
    }
    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }
    public LocalDate getHire_Date() {
        return hire_Date;
    }
    public void setHire_Date(LocalDate hire_Date) {
        this.hire_Date = hire_Date;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String toString() {
        return "EmployeesDto{" + "employee_Id=" + employee_Id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + ", address=" + address + ", salary=" + salary + ", emergency_contact=" + emergency_contact + ", hire_Date=" + hire_Date + ", position=" + position + ", status=" + status + '}';
    }
}
