package assignment;

public class Students {

	public void stdInfo(int id) {

		System.out.println("id= "+id);
	}
	public void stdInfo(int id,String name) {

		System.out.println("id= "+id);
		System.out.println("name= "+name);
	}
	public void stdInfo(String email, int phnno) {

		System.out.println("email id: "+email);
		System.out.println("phnno : " +phnno);
	}
	public static void main(String[] args) {
		Students std = new Students();
		std.stdInfo(15);
		std.stdInfo(15, "yuvashree");
		std.stdInfo("yuvashree@gmail.com", 97491384);
	}
}
