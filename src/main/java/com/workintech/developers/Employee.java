package com.workintech.developers;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name, double salary ) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }

}
