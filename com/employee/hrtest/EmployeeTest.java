package com.employee.hrtest;
import com.employee.hr.*;

public class EmployeeTest {



    public static void main(String[] args) {
        //creating an instance for class Employee
        Employee employee = new Employee("Felcy", 101, 50000.00);
        employee.printName();
        employee.printSalary();
    }
    
}
