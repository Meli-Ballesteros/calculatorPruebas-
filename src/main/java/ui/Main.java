package ui;
import model.project;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    project calculator;

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
    public Main() {
        calculator = new project();
    }

    public void menu() {
        int option = 0;
        do{
            System.out.println("\nWelcome to calculator");
            System.out.println("-----------------------");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("**********");
            System.out.println("5. Exit");
            option = sc.nextInt();

            switch(option){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    //division();
                    break;
                case 5:
                    System.out.println("See u later");
                    break;
            }


        }while (option != 5);
    }

    public void addition(){
        System.out.println("Enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        sc.nextLine();

        int result = calculator.addition(a,b);
        System.out.println("the result is: "+ result);
    }

    public void subtraction(){
        System.out.println("Enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        sc.nextLine();

        int result = calculator.subtraction(a,b);
        System.out.println("the result is:"+ result);
    }
    public void multiplication(){
        System.out.println("Enter first number");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        sc.nextLine();

        int result = calculator.multiplication(a,b);
        System.out.println("the result is:"+ result);
    }

}
