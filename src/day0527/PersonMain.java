package day0527;

class Person{
	// 주민번호, 국적, 이름
	// 주민번호는 고정값이 될 수 없으니까 생성자로 값 받기
	final String SSN; // 임의로 바꾸지 못하는,, 상수는 값 변경 불가능 초기에 값을 넣어줘야함
	final String NATION = "korea";
	String name;
	
	public Person(String ssn, String name){
		this.SSN = ssn; // 명시적 초기화로 값을 넣지 못한다면 생성자로 넣을 수 있다
		this.name = name;
	}
	
}

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "김그린");
		
		System.out.println(p1.SSN);
		System.out.println(p1.NATION);
		System.out.println(p1.name);
		
//		p1.NATION = "USA"; 에러! 상수이기 때문에 값 변경 불가능
//		p1.SSN = "111111-2222222";
		p1.name = "김자바";
		
		System.out.println(p1.name);

	}

}
