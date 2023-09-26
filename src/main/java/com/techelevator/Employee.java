package com.techelevator;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private static double salary;
    private Department department;
    private String hireDate;
    //Constructor number 1
    public Employee(long employeeId, String firstName, String email, String lastName, String hireDate, Department department) {

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

    public double raiseSalary(double percent){
        return salary;

    }

}
