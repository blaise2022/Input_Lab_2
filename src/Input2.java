//NAME - Blaise Martinez
//DATE - 09/14/2023
//PURPOSE - Input Lab #2

import java.util.Scanner;

public class Input2
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String FirstName;
        String LastName;
        int age, gradeNumber, studentID;
        String suprise;
        String password;

        System.out.print("Enter first name :: ");
        FirstName = keyboard.next();

        System.out.print("Enter last name :: ");
        LastName = keyboard.next();

        System.out.print("Enter age :: ");
        age = keyboard.nextInt();

        System.out.print("Enter grade number (numbers only) :: ");
        gradeNumber = keyboard.nextInt();

        System.out.print("Enter studentID :: ");
        studentID = keyboard.nextInt();

        System.out.print("Enter security question- favorite color :: ");
        suprise = keyboard.next();

        System.out.print("Enter password :: ");
        password = keyboard.next();




        System.out.println("####################");
        System.out.println("####################");
        System.out.print(FirstName + " ");
        System.out.print(LastName);
        System.out.println("   ");
        System.out.println("####################");
        System.out.println("####################");
        System.out.print(LastName + ", ");
        System.out.print(FirstName);
        System.out.println("   ");
        System.out.println("####################");
        System.out.println("####################");
        System.out.println("Age of student :: " + age);
        System.out.println("Grade of student :: " + gradeNumber);
        System.out.println("Student ID number :: " + studentID);
        System.out.println("####################");
        System.out.println("####################");
        System.out.println("Favorite color security question :: " + suprise);
        System.out.println("####################");
        System.out.println("####################");
        System.out.println("Password :: " + password);
        System.out.println("####################");
        System.out.println("####################");

    }
}