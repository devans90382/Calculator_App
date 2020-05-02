package mini_project;

import java.io.*;
import java.util.*;
public class App_Calculator {
	private void addition(){
    	double num1,num2;
	Scanner reader = new Scanner(System.in);
	System.out.println("Addition");
            System.out.println("Enter two numbers");
            System.out.print("Enter number 1: ");
            num1 = reader.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = reader.nextDouble();
            System.out.println(num1+num2);

}
 private void subtraction(){
     	double num1,num2;
	Scanner reader = new Scanner(System.in);
            System.out.println("Subtraction");
            System.out.println("Enter two numbers");
            System.out.print("Enter number 1: ");
            num1 = reader.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = reader.nextDouble();
            System.out.println(num1-num2);


}
private void multiplication(){
 	double num1,num2;
	Scanner reader = new Scanner(System.in);
            System.out.println("Multiplication");
            System.out.println("Enter two numbers");
            System.out.print("Enter number 1: ");
            num1 = reader.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = reader.nextDouble();
            System.out.println(num1*num2);


}
private void division(){
 	double num1,num2;
	Scanner reader = new Scanner(System.in);
            System.out.println("Division");
            System.out.println("Enter two numbers");
            System.out.print("Enter number 1: ");
            num1 = reader.nextDouble();
            System.out.print("Enter number 2: ");
            num2 = reader.nextDouble();
	if(num2==0)
		System.out.println("Second Number cannot be zero... INVALID NUMBER");
	else
            	System.out.println(num1/num2);

}

public static void main(String args[])
{
    int flag=0,ch;
Scanner reader = new Scanner(System.in);
App_Calculator cal = new App_Calculator();
    System.out.println("Calculator System");
    do
    {
        System.out.println("Option Menu");
        System.out.println("");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Exit");
        System.out.print("Enter your choice: ");
        ch = reader.nextInt();
        if(ch==5)
        {
            flag = 1;
        }
        else
        {
            switch(ch)
            {
            case 1:
            cal.addition();
            break;
            case 2:
	cal.subtraction();
            break;
            case 3:
	cal.multiplication();
            break;
            case 4:
	cal.division();
            break;
            default: System.out.println("Exiting program due to invalid input");
            flag=1;
            }
        }
        System.out.println("");
        }while(flag==0);
}
}
