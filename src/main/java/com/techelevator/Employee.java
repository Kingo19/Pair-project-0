package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

//    STATIC CONSTANT FOR DEFAULT STARTING SALARY
    private static final double DEFAULT_STARTING_SALARY = 60000.0;

    //Constructor
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = DEFAULT_STARTING_SALARY;

    }
    // Getters
    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public com.techelevator.Department getDepartment() {
        return department;
    }

    public String getHireDate() {
        return hireDate;
    }

    // Setters
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(com.techelevator.Department department) {
        this.department = department;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    // Constructor number 2

    public Employee() {
        
    }

    // Method
    public String getFullName(){

        return lastName + firstName;
    }

    public double raiseSalary(double percent) {
        salary *= (1 + (percent / 100));
        return salary;
    }

}
