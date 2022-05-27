package day0527;

public class Car {

	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		
		System.out.println("자동차를 만들었어요!");
	}
	
	public Car(int num, double gas) {
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량번호를 " + num + ", 연료량을 " + gas + "로 설정함");
	}
	
	void setCar(int num, double gas) {
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량번호를 " + num + ", 연료량을 " + gas + "로 변경함");
	}
	
	public void show() {
		System.out.println("차량번호는 " + num);
		System.out.println("연료량은 " + gas);
	}
	
}
