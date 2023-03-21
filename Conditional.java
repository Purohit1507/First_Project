package Basic_Java;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter value of b: ");
    int b = sc.nextInt();
    System.out.println("Enter value of c: ");
    int c = sc.nextInt();
    
    System.out.println("value of A= "+a+",b= "+b+", c = "+c);
    
    if(a>b)
    {
    	if(a>c)
    	{
    		System.out.println(a+" is greater");
    	}
    	else
    	{  System.out.println(c+"  is greater");
    	}
    }
    else
    {
    	if(b>c)
    	{ 
    		System.out.println(b+" is greater");
    	}
    	else
    	{ System.out.println(c+" is gretaer");
    	}
    }
    	
    	}
    	}
    
    
    
    
	


