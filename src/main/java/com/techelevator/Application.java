package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Application {

    private List<Department> departments= new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Project> projects = new HashMap<>();




    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.createDepartments();
        app.createEmployees();
        app.createTeamsProject();
        app.createLandingPageProject();
        app.printDepartments();
        app.printEmployees();
        app.printProjectsReport();

    }

    private void run() {
        // create some departments
        createDepartments(); {
            departments.add(new Department(1, "Marketing"));
            departments.add(new Department(2, "Sales"));
            departments.add(new Department(3, "Engineering"));
        }


        // print each department by name
        printDepartments();  {

        System.out.println("----------------------------DEPARTMENTS----------------------------------");
        for (Department department : departments) {
                System.out.println(department.getName());
            }
        }


        // create employees
        createEmployees(); {

                Department engineeringDepartment = departments.get(2); // Get Engineering department
                Department marketingDepartment = departments.get(0);  // Get Marketing department

                employees.add(new Employee(1, "Steve", "Carmicael", "steve@teams.com", engineeringDepartment, "08/21/2020"));
                employees.add(new Employee(2, "Chala", "Mosisa", "chala@teams.com", engineeringDepartment, "08/21/2020"));
                employees.add(new Employee(3, "Nigus", "Gebremariam", "nigus@teams.com", marketingDepartment, "08/21/2020"));

            // give Chala a 10% raise, she is doing a great job!
            Employee Chala = employees.get(1);
            Chala.raiseSalary(10);
        }


        // print all employees
        printEmployees(); {
            System.out.println("------------- EMPLOYEES ------------------------------");
            for (Employee employee : employees) {
                System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().getName());
            }
        }

        // create the TEams project
        createTeamsProject(); {
            Project teamsProject = new Project("Teams", "Project Management Software", "10/10/2020", "11/10/2020");

            for (Employee employee : employees) {
                if (employee.getDepartment().getName().equals("Engineering")) {
                    teamsProject.getTeamMembers().add(employee);
                }
            }

            projects.put(teamsProject.getName(), teamsProject);
        }
        // create the Marketing Landing Page Project
        createLandingPageProject(); {
            Project landingPageProject = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");

            for (Employee employee : employees) {
                if (employee.getDepartment().getName().equals("Marketing")) {
                    landingPageProject.getTeamMembers().add(employee);
                }
            }

            projects.put(landingPageProject.getName(), landingPageProject);
        }

        // print each project name and the total number of employees on the project
        printProjectsReport(); {
            System.out.println("------------- PROJECTS ------------------------------");
            for (Map.Entry<String, Project> entry : projects.entrySet()) {
                String projectName = entry.getKey();
                int teamSize = entry.getValue().getTeamMembers().size();
                System.out.println(projectName + ": " + teamSize);
            }
        }
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {


    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {


    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {


        }



    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {


    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {


    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {


    }
}
