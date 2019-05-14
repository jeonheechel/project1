package 다오;

import java.util.Scanner;



public class UsersMain3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String id =sc.next();
	
		
		UsersDAO3 user = new UsersDAO3();
		UsersDTO dto = new UsersDTO();
		dto.setId(id);
		try {//에러처리;
			user.delete(dto);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();
		
		
		
		}

	}
}
