package model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class Employee {

    private int id;

    @Length(max = 10)
    private String firstName;

    @Length(max = 50)
    private String lastName;

    private int salary;

    @Email
    private String emailAddress;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int salary, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
