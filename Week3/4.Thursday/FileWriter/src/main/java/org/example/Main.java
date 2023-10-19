package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("src/main/resources/example.txt");

            fileWriter.write("It's superkalafradjalisticexpialadocious \n");
            fileWriter.write("Even though the sound of it is something quite atrocious \n");
            fileWriter.write("Even when you say  it you'll always sound precocious \n");

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Had a problem writing the file, so sorry");
        }

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(10, "Dana Wyatt", 52.5, 12.5));
        employeeList.add(new Employee(20, "Ezra Aiden", 17, 16.75));
        employeeList.add(new Employee(30, "Brittanny Thubbs", 40, 16.5));
        employeeList.add(new Employee(40, "Zephaniah Hughes", 2, 10));
        employeeList.add(new Employee(50, "Caylee Callahan", 35, 15.5));
        employeeList.add(new Employee(60, "Zane Stevens", 45, 13.5));
        employeeList.add(new Employee(70, "Maverick Cummings", 20.5, 16.5));
        employeeList.add(new Employee(80, "Kamari Todd", 14.5, 14.5));

        try{
            FileWriter employeeWriter = new FileWriter("src/main/resources/employees.txt");

            //write the header line
            employeeWriter.write("id|name|hours-worked|pay-rate" + "\n");

            //loop through employees and write one line per employee pipe delimited
            for(Employee employee : employeeList){
                employeeWriter.write(employee.getId() + "|" + employee.getName() + "|" + employee.getHoursWorked() + "|" + employee.getPayRate() + "\n");
            }

            employeeWriter.close();
        }
        catch(IOException ex){
            System.out.println("Couldn't write employees");
        }

        //I want to add stuff to the end of an already existing file with stuff already in it
        try{
            FileWriter newEmployeeWriter = new FileWriter("src/main/resources/employees.txt", true);

            Employee employee = new Employee(90, "Hatrick McGee", 200, 8.5);

            //append means add on to the end of something
            newEmployeeWriter.write(employee.getId() + "|" + employee.getName() + "|" + employee.getHoursWorked() + "|" + employee.getPayRate() + "\n");

            newEmployeeWriter.close();
        }
        catch(IOException ex){
            System.out.println("That's a you problem.");
        }
    }
}