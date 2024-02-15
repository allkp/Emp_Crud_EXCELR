package com.sboot.demo.sbootexample.entity;

import jakarta.persistence.*;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "contact")
    private String contact;

    @Column(name = "department")
    private String depart;

    @Column(name = "salary")
    private String salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String age, String contact, String depart, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.depart = depart;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    
    

}
