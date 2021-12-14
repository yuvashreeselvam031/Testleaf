package dec14;

public class Child extends Parent {

	public Child() {}
	public void move() {
	     super.move(); // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
}
