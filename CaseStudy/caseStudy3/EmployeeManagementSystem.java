package com.evergent.corejava.charan.caseStudy2;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
    // HashMap to store employee records (ID -> Employee object)
    private HashMap<Integer, Employee> employeeMap=new HashMap<>();

    // Constructor
    /*public EmployeeManagementSystem() {
        employeeMap = new HashMap<>();
    }*/

    // Method to add a new employee
    
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        System.out.println("Employee added successfully!");
    }

    // Method to retrieve employee details by ID
    public Employee getEmployeeById(int id) {
        if (employeeMap.containsKey(id)) {
            return employeeMap.get(id);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
            return null;
        }
    }

    // Method to update employee details
    public void updateEmployee(int id, String newName, String newDepartment) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.setName(newName);
            employee.setDepartment(newDepartment);
            System.out.println("Employee updated successfully!");
        }
    }

    // Method to remove an employee by ID
    public void removeEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Method to list all employees
    public void listAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("List of all employees:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getValue().toString());
            }
        }
    }
}
