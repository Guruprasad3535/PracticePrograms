package edu.qspiders.demo1;

import java.util.Scanner;

public class Array2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arr");
		int []arr=new int[10];
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for (int i=0;i<arr.length;i++)
		{
			int count=0,count1=0;
			int j;
			for (j=0;j<i;j++)
			{
				if (arr[i]==arr[j])
				{
					count++;
				}
			}
			if(i==j)
			{
				count1++;
			}
			if (count==count1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
