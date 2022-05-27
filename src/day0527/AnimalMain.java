package day0527;

class Animal{
	
	/* 동물의 수를 출력
	 * 인스턴스 변수(이름, 색깔, 나이)
	 * 생성자
	 *  */
	
	String name;
	String color;
	int age;
	
	static int numbers = 0; // static이라서 객체가 생성될 때 초기화되지 않는다.
	
	Animal(){}
	
	Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
		
		++numbers; // 뒤에 오면 사용하고 증가하는 거라 앞에 붙여줌

	}
	
}

public class AnimalMain {

	public static void main(String[] args) {

		// 동물이름, 색깔, 나이 입력
		
		Animal a1 = new Animal("자기야", "흰색", 14);
		Animal a2 = new Animal("다람이", "갈색", 5);

		
		// 지금까지 접수된 반려동물 수 : 2
		System.out.println("지금까지 접수된 반려동물 수 : " + Animal.numbers);

	}

}
