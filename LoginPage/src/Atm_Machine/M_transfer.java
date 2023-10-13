package Atm_Machine;

import java.util.Scanner;

public class M_transfer extends Bank {

	@Override
	public void atm() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**********************************");
		System.out.println("Money Transfer - Bank Acc\n");
		System.out.println("Enter the Acc no");
		long Tacc_no = sc.nextLong();

		System.out.println("Enter the Amt");
		double t_amt = sc.nextDouble();
		System.out.println("\n-------------------------------------");

		if (blc >= t_amt) {
			System.out.println("Transacation is successful");
			System.out.println("From Account no: " + Acc_no);
			System.out.println("To Account no: " + Tacc_no);
			System.out.println("T_amt Amt: " + t_amt);
			System.out.println("Avl Blc: " + (blc - t_amt) + "\n");
			blc = blc - t_amt;

			System.out.println("*******Thank for visting*******");
		} else {
			System.out.println("Transacation Declined");
			System.out.println("Account no: " + Acc_no);
			System.out.println("");
			System.out.println("Available blc: " + blc);
		}

	}

}
