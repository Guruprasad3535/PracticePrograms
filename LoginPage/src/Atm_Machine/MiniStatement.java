package Atm_Machine;

public class MiniStatement extends Bank {

	@Override
	public void atm() {
		System.out.println("\n*************************************");
		System.out.println("Welcome to Mini Statement\n");

		System.out.println("Acc Name: " + name);
		System.out.println("Address: " + add);
		System.out.println("Acc No: " + Acc_no);
		System.out.println("Acc Des: " + des);
		System.out.println("Branch: " + branch);
		System.out.println("IFSC: " + ifsc);
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Date\t\tDetails\t\tDebit\tCredit\tBalance");
		System.out.println("------------------------------------------------------");
		System.out.println("12/02/2021\tFrom guru\t\t2000\t4000");
		System.out.println("------------------------------------------------------");
		System.out.println("09/02/2021\tTo prasad\t3000\t\t2000");
		System.out.println("------------------------------------------------------");
		System.out.println("");
		System.out.println("*******Thank for visting*******");

	}

}
