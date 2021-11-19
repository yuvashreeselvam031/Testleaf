package assignment1;

public class Desktop extends Computer{

	public void desktopSize() {

		System.out.println("desktop size: 15.5");
	}
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
