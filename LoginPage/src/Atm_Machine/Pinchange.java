package Atm_Machine;

import java.util.Scanner;

public class Pinchange extends Bank {

	@Override
	public void atm() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome\n");

		System.out.println("Old pin: ");
		int o_pin = sc.nextInt();
		System.out.println("");

		System.out.println("New pin: ");
		int n_pin = sc.nextInt();
		System.out.println("");

		System.out.println("Confirm pin: ");
		int c_pin = sc.nextInt();
		System.out.println("\n**********************************************");

		if (o_pin == pin) {
			if (n_pin == c_pin) {
				pin = c_pin;
				System.out.println("pin changed successfully");
			} else {
				System.out.println("New pin is not matching with confirm pin");
			}

		} else {
			System.out.println("\nInvalid Old pin");
		}

	}

}
