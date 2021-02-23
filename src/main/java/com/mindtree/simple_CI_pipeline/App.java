package com.mindtree.simple_CI_pipeline;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static int add(int firstNum,int secNum)
	{
		int sum=firstNum+secNum;
		return sum;
	}
	public static int sub(int firstNum,int secNum)
	{
		int diff=firstNum-secNum;
		return diff;
	}
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("CI-PIPELINE\n****************************");
        System.out.println("Enter first number:");
        int firstNum=sc.nextInt();
        System.out.println("Enter first number:");
        int secNum=sc.nextInt();
        
        int sum=add(firstNum, secNum);
        int diff=sub(firstNum,secNum);
        
        
        System.out.println("The sum:"+sum);
        System.out.println("The difference:"+diff);
        
        
        System.out.println();
        
    }
}
