package edu.pupr.manager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    Employee(){
        this("",0.0,0,0,0);
    }

    Employee(String name, double salary, int year, int month, int day){
        setName(name);
        setSalary(salary);
        setHireDate(year, month, day);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setHireDate(int year, int month, int day){
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100.0;

        salary += raise;
    }

    @Override
    public String toString() {
        String formattedHireDate = hireDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        return String.format("%s\t%s\t $%,.2f", formattedHireDate, getName(), getSalary());
    }
}