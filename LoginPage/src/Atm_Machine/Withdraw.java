package Atm_Machine;

import java.util.Scanner;

public class Withdraw extends Bank {

	@Override
	public void atm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n************************************");
		System.out.println("Welcome to the WITHDRAW\n");
		System.out.println("Enter the withdraw Amt");
		double w_draw = sc.nextDouble();
		System.out.println("\n-------------------------------------");

		if (blc >= w_draw) {
			System.out.println("Transacation is successful");
			System.out.println("Account no: " + Acc_no);
			System.out.println("W_draw Amt: " + w_draw);
			System.out.println("Avl Blc: " + (blc - w_draw) + "\n");
			blc = blc - w_draw;

			System.out.println("*******Thank for visting*******");
		} else {
			System.out.println("Transcation declined");
			System.out.println("Account no: " + Acc_no);
			System.out.println("");
			System.out.println("Available blc: " + blc);
		}

	}

}
