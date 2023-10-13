package edu.qspiders.demo1;

public class Array1 {
       
	public static void main(String[] args) {
		int []arr=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		
		System.out.println(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]+""+arr[4]);
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException A) {
			
			System.out.println(A.getMessage());
		}
		System.out.println("main ends");
		
	}
}
