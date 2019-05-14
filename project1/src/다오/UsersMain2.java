package 다오;

import java.util.Scanner;



public class UsersMain2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name =sc.next();
		System.out.print("아이디:");
		String id =sc.next();
	
		
		UsersDAO2 user = new UsersDAO2();
		UsersDTO dto = new UsersDTO();
		dto.setId(id);
		dto.setName(name);
		try {//에러처리;
			user.update(dto);
		} catch (Exception e) {//잡는부분
			System.out.println("에러발생!! 에러발생!!");
			e.printStackTrace();			
			}
		
		
		
		}

	}

