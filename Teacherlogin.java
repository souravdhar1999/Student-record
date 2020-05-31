package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Teacherlogin implements Login{
    private String Username;
    private String password;
    protected int choice;
    private String name,pass;
    Scanner scanner= new Scanner(System.in);
    public void newAccount(){
        System.out.println("What is your name?");
        name= scanner.next();
        System.out.println("Type the pass");
        pass= scanner.next();
        Username=name; password=pass;
    }
    public void checkSid(){
        String username; String pass2;
        do {
           System.out.println("Enter your name and pass to log in:- ");
           System.out.println(" Whats the name?" );
           username=scanner.next();
           System.out.println("Whats the pass");
           pass2=scanner.next();
          } while (!(username.equalsIgnoreCase(name) ) || !(pass2.equals(pass)));

       if(username.equalsIgnoreCase(Username)&&pass.equals(password)){
           System.out.println("Please enter your choice:- ");
           System.out.println("1.Add student. 2.Display Student. 3. Exit");
           int choice= scanner.nextInt();
           this.choice=choice;
       }
    }
}
