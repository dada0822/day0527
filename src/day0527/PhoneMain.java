package day0527;

public class PhoneMain {

	public static void main(String[] args) {

		Galaxy g = new Galaxy("갤럭시Z플립", "6.7인치 Dynamic Amoled", 1500000);
		
		Apple a = new Apple("IPHONE12Pro", "6.7인치 SUper Letina", 1400000);
		
		g.phoneInfo();
		a.phoneInfo();

	}

}
