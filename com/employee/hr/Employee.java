package com.employee.hr;

public class Employee {
    
    public String name;
    public int id;
    public double salary;

    // Constructor 
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    // method to print Name
    public void printName(){
        System.out.println("The Employee's Name is: "+ name);

    }
    //Method to print Salary
    public void printSalary(){
        System.out.println("The Employee's salary: "+ salary);

    }
    
}
