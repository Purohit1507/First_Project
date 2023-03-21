package Basic_Java;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of A and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("A= "+a+" b= "+b);
		System.out.println("\npress1 for addition \npress2 for substraction\npress 3 for multiplication\npress4 for division");
		System.out.println("enter value of your choice");
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1: System.out.println("addition "+(a+b));
		      break;
		case 2: System.out.println("substraction "+(a-b));
		     break;
		case 3: System.out.println("multiplication "+(a*b));
		     break;
		case 4: System.out.println("division "+((float)a/b));
		     break;
		default: System.out.println("invalid number");
		     break;
		
	}
	}}


