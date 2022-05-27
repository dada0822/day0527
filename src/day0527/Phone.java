package day0527;

public class Phone {

	/* Phone
	 * Galaxy Apple
	 * PhoneMainjava 생성하여 결과 출력
	 *
	 * - 출력 결과
	 * 모델명 : 갤럭시Z플립
	 * 스펙 : 6.7인치 Dynamic Amoled
	 * 가격 : 1500000
	 * 모델명 : IPHONE12Pro
	 * 스펙 : 6.7인치 SUper Letina
	 * 가격 : 1400000 */
	
	String name;
	String spec;
	int cost;

	public Phone(String name, String spec, int cost) {
		this.name = name;
		this.spec = spec;
		this.cost = cost;
	}
	
	void phoneInfo() {
		System.out.println("모델명 : " + name);
		System.out.println("스펙 : " + spec);
		System.out.println("가격 : " + cost);
	}
	
}
