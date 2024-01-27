package com.mycompany.app.training;

//EmployeeMain.java
public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Srini", "HR Manager", 40000);
        Employee employee2 = new Employee("Meher", "Software Engineer", 60000);
        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Srini':");
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Meher':");
        employee2.printEmployeeDetails();
    }
}