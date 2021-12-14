package dec14;

public class  LearnStatic {

	public static int  exp = 100;

	public static void toLearnStatic() {

		
		System.out.println(exp+"static method");
		
	}
	public static void main(String[] args) {
		System.out.println(exp);
		LearnStatic s = new LearnStatic();
		s.toLearnStatic();
	}
	
}
