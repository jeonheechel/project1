package 다오;

import java.util.Scanner;




public class UsersMain {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디:");
		String id = sc.next();
		System.out.print("패스워드:");
		String pw = sc.next();
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("닉네임:");
		String nicname = sc.next();
		System.out.print("이메일:");
		String mail= sc.next();
		System.out.print("등급:");
		String grade = sc.next();
		
		
		UsersDAO user = new UsersDAO();
		UsersDTO dto = new UsersDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setNicname(nicname);
		dto.setMail(mail);
		
		
		user.insert(dto);
		

	}

}

