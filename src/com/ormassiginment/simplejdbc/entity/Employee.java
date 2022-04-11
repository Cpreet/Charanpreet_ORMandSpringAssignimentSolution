package com.ormassiginment.simplejdbc.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
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

    @Override
    public String toString() {
        return "Employee [ \n" +
            "firstName:="+firstName+"\n"+
            "lastName:="+lastName+"\n"+
            "email:="+email+"\n"+
            "]";
    }
}
