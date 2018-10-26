package com.stackroute.model;

public class User {


    private String empId;
    private String name;
    private int age;
    private long salary;

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
