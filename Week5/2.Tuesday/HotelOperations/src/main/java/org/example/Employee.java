package org.example;

/*
employeeId, name, department, payRate, hoursWorked.
 */
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    /*
            getTotalPay
        getRegularHours
        getOvertimeHours
     */
    //Let's say you work 80 hours.
    //getRegularHours would still retunr 40, and getOvertime would return 40
    public double getRegularHours(){
        if(this.hoursWorked >= 40){
            return 40;
        }
        else{
            return this.hoursWorked;
        }
    }

    public double getOvertimeHours(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        else{
            return 0;
        }
    }
}
