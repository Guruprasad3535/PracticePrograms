package edu.qspiders.demo2;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the choice whic u prefer ");
		int choice = sc.nextInt();

		switch (choice) 
		{
		case 1:
			Eclaris a1 = new Eclaris();
			a1.chocalate();
			break;

		case 2:
			Milkybar a2 = new Milkybar();
			a2.chocalate();
			break;

		case 3:
			Perk a3 = new Perk();
			a3.chocalate();
			break;
		default:
			System.out.println("invalid choice");

		}
	}
}
