package assignment3;

import org.apache.poi.ss.formula.functions.Fixed;

public class BankInfo {
	public void saving() {

		System.out.println("savings ");
	}
	public void fixed() {

		System.out.println("fixed");
	}
	public void deposit() {

		System.out.println("deposit");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.deposit();
	}

}
