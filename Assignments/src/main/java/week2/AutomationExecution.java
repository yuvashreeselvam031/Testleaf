package week2;

public class AutomationExecution extends MultipleLangauge implements Language,TestTool  {

	public static void main(String[] args) {
		AutomationExecution obj = new AutomationExecution();
		obj.java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}

	public void Selenium() {

		System.out.println("Selenium");
	}

	public void java() {


		System.out.println("java");
	}

	@Override
	public void ruby() {

		System.out.println("ruby");
	}

}
