package week3.day1.org.system;

public class DesktopClass {

	public void desktopSize() {
		System.out.println("inside desktop class");
	}
	public static void main(String[] args) {
		
		ComputerClass computerObject=new ComputerClass();
		computerObject.computerModel();
		DesktopClass desktopObject=new DesktopClass();
		desktopObject.desktopSize();
	}

}
