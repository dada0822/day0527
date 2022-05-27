package day0527;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		
//		m.name = "dd"; 접근 불가능
		
		m.setName("김그린");
		m.setTel("010-1111-2222");
		m.setAddress("울산시 남구");
		
//		m.printMember();
		
		String name = m.getName();
		String tel = m.getTel();
		String address = m.getAddress();
		
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
		
	}

}
