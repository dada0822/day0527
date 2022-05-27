package pacakage1;

public class A {
		
		// 필드
		public int pub; // 제한 없음
		protected int pro; // 같은 패키지 + 다른 패키지의 자손
				int def; // 같은 패키지 내에서만
		private int pri; // 같은 클래스 내에서만
				
		public void printMembers() {
			System.out.println(pub); // ok
			System.out.println(pro); // ok
			System.out.println(def); // ok
			System.out.println(pri); // ok

	}

}
