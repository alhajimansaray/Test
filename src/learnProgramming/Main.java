package learnProgramming;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");

        String name = scanner.nextLine();


        System.out.println("Enter the marks");

        int marks = 100;


        marks = scanner.nextInt();


        if(marks <50){
            System.out.println("'C' Fail");
        }

        else if(marks ==50){
            System.out.println("'C' Pass");
        }

        else if(marks >=51 && marks<=64){
            System.out.println(" 'B' Pass");
        }

        else if(marks >=65 && marks <=75){
            System.out.println(" 'A' Credit");
        }

        else if(marks >=76 && marks <=100){
            System.out.println(" 'A' Credit");
        }

        else {
            System.out.println("Invalid input");
        }
        System.out.println("Your name is " +name + " and your score is " + marks);

      }




    }
