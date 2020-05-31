package com.company;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
       AddStudent access= new AddStudent();

        System.out.println("Welcome create an account and then log in to order see the next steps ");
        access.newAccount(); access.addstudent();
        System.out.println("Please enter your choice:- ");
        System.out.println("1.Add student. 2.Display Student. 3. Exit");
        int choice=scanner.nextInt();
        if(choice==2){
            access.display();
        }

    }
}
