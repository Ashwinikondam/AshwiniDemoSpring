package com.example.entity;

//import javax.persistence.*;

//@Entity
//@Table(name = "employee")
public class Employee {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer emp_id;
    private String emp_name;
    private double salary;
    private String gender;

    public Employee() {
    }

    /*public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}