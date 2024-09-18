package com.evergent.corejava.charan.caseStudy2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee by ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. List All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String department = sc.nextLine();
                    Employee employee = new Employee(id, name, department);
                    system.addEmployee(employee);
                    break;

                case 2:
                    // Retrieve Employee by ID
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    Employee foundEmployee = system.getEmployeeById(searchId);
                    if (foundEmployee != null) {
                        System.out.println("Employee Details: " + foundEmployee);
                    }
                    break;

                case 3:
                    // Update Employee
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();
                    system.updateEmployee(updateId, newName, newDepartment);
                    break;

                case 4:
                    // Remove Employee
                    System.out.print("Enter Employee ID: ");
                    int removeId = sc.nextInt();
                    system.removeEmployee(removeId);
                    break;

                case 5:
                    // List All Employees
                    system.listAllEmployees();
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the system.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
