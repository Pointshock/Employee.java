package com.company;

//Create a public class
public class Employee {

    private Float Salary; //Variable to hold Salary
    private String EmailAddress; //String to hold email

    //Salary Getter
    public Float getSalary(){
        // Returns what Salary is
        return Salary;
    }

    //Email Getter
    public String getEmail(){
        // Returns what EmailAddress is
        return EmailAddress;
    }

    //Salary Setter
    public void setSalary(Float inp){
        Salary = inp;
    }

    //Email Setter
    public void setEmail(String inp){
        EmailAddress = inp;
    }
}