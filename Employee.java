package com.ERP.Sales.Commission.Employee;

import java.util.UUID;

public class Employee {
    private final UUID id;
    private final String name;
    private final String email;
    private final String password;
    private final String designation;
    private final String department;
    private final int age;

    public Employee(UUID id, String name, String email, String password, String designation, String department, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.designation = designation;
        this.department = department;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
