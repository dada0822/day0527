package pacakage2;

import pacakage1.A;

public class C extends A {

	public void printMembers() {
		System.out.println(pub); // ok
		System.out.println(pro); // ok
//		System.out.println(def); // error 같은 패키지
//		System.out.println(pri); // error 같은 클래스
	}

}
