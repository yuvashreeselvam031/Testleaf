package assignment3;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		//super.deposit();
		System.out.println("AxisBank deposit");
	}
	
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
