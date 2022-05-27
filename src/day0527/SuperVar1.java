package day0527;

class Parent{
	int x = 10;
}

class Child extends Parent {
	int x = 20; // 이름은 같지만 각각 다른 값
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperVar1 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}

}
