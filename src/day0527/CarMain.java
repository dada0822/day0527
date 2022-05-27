package day0527;

public class CarMain {

	public static void main(String[] args) {

		/* 자동차를 만들었어요!
		 * 레이싱카가 생성되었습니다!
		 * 차량번호를 1234, 연료량을 20.5로 설정함
		 * 코스번호를 5번으로 설정하였습니다. */
		
		RacingCar rc = new RacingCar();
		
		RacingCar rc1 = new RacingCar(1234, 20.5, 5);
		rc1.setCourse(5);
	}

}
