package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your test score: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = 'F';
        int Lastdigit;
        int lastdigit = score % 10;
        String sign = " ";

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 69)
            grade = 'C';
        else if (score > 60)
            grade = 'D';
        else {
            grade = 'F';
        }

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");

        if (lastdigit > 6)
            sign = "+";
        else if (lastdigit < 3)
            sign = "-";



            System.out.println(" print grade:" + grade + sign);


    }
}
