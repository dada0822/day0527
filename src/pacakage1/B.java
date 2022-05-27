package pacakage1;

public class B {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.pub); // ok
		System.out.println(a.pro); // ok
		System.out.println(a.def); // ok
//		System.out.println(a.pri); // error private 같은 클래스 내에서만 사용 가능

	}

}
