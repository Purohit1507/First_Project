package Basic_Java;

import java.util.Scanner;

/*
 * Conditional Statements : 
 * 
 * Condition : it is a boolean value. it will evaluate to either true/false
 * 
 *1) simple if
 *
 *	Syntax: 
 *			if(condition)
 *			{
 *				//statements
 *			}
 *
 *2) if/else
 *
 *	syntax: if(condition)
 *			{
 *				//statements
 *			}
 *			else
 *			{
 *				//statement
 *			}
 *
 *3) nested if/else
 *
 * syntax : if(condition)
 * 			{
 *				if(condition)
 *				{	
 *					//statements
 *				}
 *				else
 * 				{
 * 					//statements	
 * 				}
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 *				{	
 *					//statements
 *				}
 *				else
 * 				{
 * 					//statements	
 * 				} 				
 * 			}
 * 
 * 4) Ladder if/else
 * 
 * Syntax:
 * 
 * 			if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else if(condition)
 * 			{
 * 				//statements
 * 			}
 * 			else
 * 			{
 * 				//statements
 * 			}
 * 
 *
 *
 * 
 *2) if/else
 *3) nested if/else
 *4) ladder if/else
 * 			
 * 
 * 
 * 
 * 
 * 
 */

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
    
    
    
    
	


