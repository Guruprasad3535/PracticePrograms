package Atm_Machine;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pin = Bank.pin();
		if (pin == Bank.pin) {
			Bank.disp();

			System.out.println("Select the choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Withdraw W = new Withdraw();
				W.atm();

				break;

			case 2:
				M_transfer T = new M_transfer();
				T.atm();

				break;
			case 3:
				MiniStatement S = new MiniStatement();
				S.atm();

				break;
			case 4:
				Pinchange P = new Pinchange();
				P.atm();

				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} else {
			System.out.println("Invalid Pin");
		}
	}

}
