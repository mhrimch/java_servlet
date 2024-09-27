package com.mohammed.hrimch.hrservlet;

import java.util.List;

public class Employee {

    Long id;
    String name;
    double salary;

    List<Role> roles;

    private Departement departement;

    public Employee() {}
    public Employee(Long id, String name, double salary, Departement departement) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departement = departement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Departement getDepartement(){
        return this.departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void saySalam(String name){
        System.out.println("Salam Le3alam,my name is "+ name);
        System.out.println("My salary is "+ this.getSalary());
        System.out.println("I belong to "+ this.getDepartement().getName());
        System.out.println("My Roles are: ");
        for (Role r: this.roles) {
            System.out.print(r.getName() +"  ");
        }

    }





}
