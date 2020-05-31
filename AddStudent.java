package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class AddStudent extends Teacherlogin implements student  {
 Scanner scanner= new Scanner(System.in);
    String [] Studentsname;
    double [] gpa;
    String[] id;
    int[] midterm;
    int [] finalgarde;
    public void addstudent(){
        super.checkSid();
        if(choice==1){
            System.out.println("How many students you have?");
            int numberofStudents= scanner.nextInt();
            Studentsname= new String[numberofStudents];
            id=new String[numberofStudents];
            midterm= new int[numberofStudents];
            finalgarde= new int[numberofStudents];
            gpa=new double[numberofStudents];
            int k=1;
            for(int i=0; i<Studentsname.length; i++){
                System.out.println(k++ + ". "+ " Student name:-");
                Studentsname[i]=scanner.next();
                System.out.println("What's the id of this student?");
                id[i]=scanner.next();
                System.out.println("Midterm garde");
                midterm[i]=scanner.nextInt();
                System.out.println("Final Grade");
                finalgarde[i]=scanner.nextInt();
            }
        }
    }
    public void calculator(){
        for(int i=0; i<Studentsname.length; i++){
            if((midterm[i]+finalgarde[i])/2>=90){
                gpa[i]=4.0;
            }
            else if((midterm[i]+finalgarde[i])/2>=80&& (midterm[i]+finalgarde[i])/2<90){
                gpa[i]=3.0;
            }
            else if((midterm[i]+finalgarde[i])/2>=70&& (midterm[i]+finalgarde[i])/2<80){
                gpa[i]=2.0;
            }
            else if((midterm[i]+finalgarde[i])/2>=60&& (midterm[i]+finalgarde[i])/2<70){
                gpa[i]=1.0;
            }
            else {
                gpa[i]=0.0;
            }
        }

    }
    public void display() throws IOException {
        String[]s= new String[Studentsname.length];
        FileWriter fileWriter= new FileWriter("/Users/soura/Desktop/record.text");
        int o=1;
        fileWriter.write("Student result 2020:- \n");
        fileWriter.write("----------------------\n");
        System.out.println("Student result 2020:-   ");
        System.out.println("------------------------");

        for(int i=0; i<Studentsname.length;i++){
            calculator();
           System.out.print(s[i] = (o++ + ". " + "Student name:-"
                        + Studentsname[i] + ". " + "Student id:- " + id[i] + ". Midterm" + ":- " +
                        "" + +midterm[i] + ". " + "Final" + ":- " + finalgarde[i] + ". Gpa:- " + gpa[i])+"\n");
            fileWriter.write(s[i]);
        }
        fileWriter.close();

    }
}


