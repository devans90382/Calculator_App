package mini_project;

import java.io.*;
import java.util.*;
public class App_Calculator 
{
	private void addition()
	{
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
 
	private void subtraction()
	{
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
	
	private void multiplication()
	{
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
	
	private void division()
	{
		double num1,num2;
		Scanner reader = new Scanner(System.in);
        System.out.println("Division");
        System.out.println("Enter two numbers");
        System.out.print("Enter the numerator: ");
        num1 = reader.nextDouble();
        System.out.print("Enter the denominator: ");
        num2 = reader.nextDouble();
        if(num2==0)
        	System.out.println("Denominator cannot be zero");
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
	        System.out.println("Options");
	        System.out.println("Enter 1 For Addition");
	        System.out.println("Enter 2 For Subtraction");
	        System.out.println("Enter 3 For Multiplication");
	        System.out.println("Enter 4 For Division");
	        System.out.println("Enter 5 To Exit");
	        System.out.print("Enter your choice: ");
	        ch = reader.nextInt();
	        if(ch==5)
	        {
	            System.exit(0);
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
	            default: System.out.println("Invalid Input");
	            }
	        }
	        System.out.println("Press 1 To Continue and 2 To Exit");
	        int f=reader.nextInt();
	        if(f==2)
	        	System.exit(0);
	        }
	    while(true);
	 }
}
