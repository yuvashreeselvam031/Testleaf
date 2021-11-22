package nov22;

public class SoftwareResources implements Software, Hardware {

	public void desktopModel() {
		System.out.println("desktopModel");

	}

	public void hardwareResources() {

		System.out.println("hardwareResources");
	}

	public void softwareResources() {
		System.out.println("softwareResources");
	}
	public static void main(String[] args) {
		SoftwareResources obj = new SoftwareResources();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();	
		
	}
}
