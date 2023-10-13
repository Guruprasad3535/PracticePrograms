package Atm_Machine;

import java.util.Scanner;

abstract public class Bank {
	static String name = "Guru";
	static String add = "Bangalore";
	static String des = "Savings";
	static String branch = "Kithaganur";
	static String ifsc = "SBIN0011294";
	static long Acc_no = 8970486528l;
	static int pin = 3535;
	static double blc = 5000;

	public static int pin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Swipe your card");

		System.out.println("Enter the pin: ");
		int pin = sc.nextInt();

		return pin;
	}

	public static void disp() {
		System.out.println("Welcome 🙏");
		System.out.println("");
		System.out.println("1: Withdraw\t\t\t2: Transfer");
		System.out.println("3: MiniStatement\t\t4: PIN Change\n");
	}

	abstract public void atm();
}
