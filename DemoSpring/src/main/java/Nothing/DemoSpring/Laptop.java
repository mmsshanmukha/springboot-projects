package Nothing.DemoSpring;

public class Laptop implements Computer {
	Laptop(){
		System.out.println("Laptop");
	}
	@Override
	public void compile() {
		System.out.println("Laptop Compiling....");
	}
}
