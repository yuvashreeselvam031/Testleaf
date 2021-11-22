package nov22;

public class College extends University {

	@Override
	public void ug() {

		System.out.println("ug");
	}
	public static void main(String[] args) {
		College cg = new College();
		cg.ug();
		cg.pg();
		
	}

}
