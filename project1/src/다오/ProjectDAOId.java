package 다오;

import java.sql.*;
import java.util.ArrayList;





public class ProjectDAOId {
	String url = "jdbc:mysql://localhost:3306/movieworld";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	UsersDTO dto=null;
	static ProjectDAOPw dao;
	
public UsersDTO select(String name , String mail)  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "select * from users where name = ? AND mail=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name );
			ps.setString(2, mail );
			
			System.out.println("3.SQL 문 객체화 ok.. ");
			
			
			//4. SQl문을 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL 문 전송 ok.. ");
			
			// SQl 문의 결과가 있으면 받아서 처리해라!
			
			if(rs.next()) {
				dto = new UsersDTO();
				String id = rs.getString(1);
				
				//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
				dto.setId(id);
				System.out.print(id);
				
						
			}else {
				System.out.println("검색 결과가 없습니다!!");
			}
			
			
		} catch (Exception e) {
			System.out.println("DB처리중 에러발생");
			System.out.println(e.getMessage());
			
		} finally {
			//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
			 try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e) {
				//e.printStackTrace();안써도 그만이다
				System.out.println("자원 해제중 에러발생!!");
			}//catch
			 
		}//try-catch-finally
		return dto;
						
	}//select




public UsersDTO selectId(String Id)  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from users where id = ? ";
		ps = con.prepareStatement(sql);
		ps.setString(1, Id );
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		if(rs.next()) {
			dto = new UsersDTO();
			String id = rs.getString(1);
			
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setId(id);
			System.out.print(id);
			
					
		}else {
			System.out.println("검색 결과가 없습니다!!");
		}
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
					
}//select


public UsersDTO selectNicname(String Nicname)  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from users where nicname = ? ";
		ps = con.prepareStatement(sql);
		ps.setString(1, Nicname);
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		if(rs.next()) {
			dto = new UsersDTO();
			String nicname = rs.getString(1);
			
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setNicname(nicname);
			System.out.print(nicname);
			
					
		}else {
			System.out.println("검색 결과가 없습니다!!");
		}
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
					
}//select


public UsersDTO selectMail(String Mail)  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from users where mail = ? ";
		ps = con.prepareStatement(sql);
		ps.setString(1, Mail);
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		if(rs.next()) {
			dto = new UsersDTO();
			String mail = rs.getString(1);
			
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setMail(mail);
			System.out.print(mail);
			
					
		}else {
			System.out.println("검색 결과가 없습니다!!");
		}
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
					
}//select

public UsersDTO selectLogin(String Id,String Pw )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from users where id=? AND Pw=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Id );
		ps.setString(2, Pw );
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		if(rs.next()) {
			dto = new UsersDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			
			
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			
			
			System.out.print(id);
			System.out.print(pw);
			
			
					
		}else {
			System.out.println("검색 결과가 없습니다!!");
		}
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			rs.close();
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
					
}//select












}


