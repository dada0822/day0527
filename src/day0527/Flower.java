package day0527;

public class Flower {

	/* 1. 부모클래스 Flower.java 생성
	 * - 필드 : name(꽃이름), cost(가격)
	 * - 메서드 : flowerInfo (void)
	 * 
	 * 2. Flower.java를 상속받는 Rose.java Tulip.java 생성
	 * 
	 * 3. FlowerMain.java 생성하여 결과 출력
	 * - 출력 결과
	 * 장미 1송이의 가격의 1,500원입니다.
	 * 튤립 1송이의 가격은 2,000원입니다. */
	
	public String name;
	public int cost;
	
	public Flower(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	void flowerInfo() {
		System.out.printf("%s 1송이의 가격은 %,d원입니다.\n", name, cost);
	}
	
}
