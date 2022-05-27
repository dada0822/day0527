package day0527;

public class RacingCar extends Car {


	private int course;
	
	/* 1. 생성자를 통해서 '레이싱카가 생성되었습니다.' 출력 
	 * 2. 매개변수 3개짜리 생성자를 이용해서
	 * 	'코스번호가 x인 레이싱카가 생성되었습니다.' 출력
	 * 3. 코스번호에 대한 정보를 출력하는 setCourse 메서드 만들기
	 * 	'코스번호를 x번으로 설정하였습니다.' 출력 */
	
	
	public RacingCar() { 
		course = 0; // 생성자의 목적은 초기화!
		System.out.println("레이싱카가 생성되었습니다.");
		
	}
	
	public RacingCar(int num, double gas, int course) {
		super(num, gas);
		this.course = course;
	}
	
	public void setCourse(int course) {
		this.course = course;
		System.out.println("코스번호를 " + course + "번으로 설정하였습니다.");
	}
	
}
