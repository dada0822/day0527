package pacakage2;

import pacakage1.A;

public class D {

	public static void main(String[] args) {

		A a = new A();
		
		System.out.println(a.pub); // ok
//		System.out.println(a.pro); // error 같은 패키지, 다른 패키지의 자손
//		System.out.println(a.def); // error 같은 패키지
//		System.out.println(a.pri); // error 같은 클래스

	}

}
