package com.techelevator;

public class Department {

    private String name;
    private int departmentID;

//    CONSTRUCTOR

    public Department(int departmentID, String name) {
        this.departmentID = departmentID;
        this.name = name;

    }
//    GETTER AND SETTER

    public String getName() {
        return name;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
}
