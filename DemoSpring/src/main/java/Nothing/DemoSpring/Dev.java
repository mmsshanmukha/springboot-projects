package Nothing.DemoSpring;

import org.springframework.stereotype.Component;

@Component
public class Dev {

	private Computer com;
	
	Dev(){
		System.out.println("Dev");
	}
	public void build() {
		System.out.println("Working on awesome project");
		com.compile();
	}

	public Computer getCom() {
		return com;
	}
	public void setCom(Computer com) {
		this.com = com;
	}
	
	
}
