package 다오;

import java.sql.*;
import java.util.ArrayList;







public class ProjectDAOPw {
	String url = "jdbc:mysql://localhost:3306/movieworld";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	UsersDTO  dto = null;//변수의 생존범위: 선언의 위치
	
public UsersDTO select(String id , String name, int hint, String pwhint)  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "select * from users where id = ? AND name=? AND hint=? AND pwhint=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id );
			ps.setString(2, name );
			ps.setInt(3, hint );
			ps.setString(4, pwhint );
			
			System.out.println("3.SQL 문 객체화 ok.. ");
			
			
			//4. SQl문을 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL 문 전송 ok.. ");
			
			// SQl 문의 결과가 있으면 받아서 처리해라!
			
			if(rs.next()) {
				dto = new UsersDTO();
				String pw = rs.getString(2);
				
				
				//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
				dto.setPw(pw);
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


public UsersDTO insert(String Id , String Pw, String Name, String Nicname, String Mail , int Hint, String Pwhint , int Grade )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "insert into users values(?,?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, Id );
		ps.setString(2, Pw );
		ps.setString(3, Name );
		ps.setString(4, Nicname );
		ps.setString(5, Mail );
		ps.setInt(6, Hint);
		ps.setString(7, Pwhint );
		ps.setInt(8, Grade );
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select



public UsersDTO selectPw(String Pw)  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from users where pw = ? ";
		ps = con.prepareStatement(sql);
		ps.setString(1, Pw );
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		if(rs.next()) {
			dto = new UsersDTO();
			String pw = rs.getString(2);
			
			
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setPw(pw);
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






public UsersDTO delete(String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "delete from users where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Id );
		
		
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select


public UsersDTO updatePw(String Pw ,String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "update users set pw=?  where id =?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Pw );
		ps.setString(2, Id );
	
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select

public UsersDTO updateNicname(String Nicname ,String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "update users set nicname=?  where id =?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Nicname );
		ps.setString(2, Id );
	
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select

public UsersDTO updateMail(String Mail ,String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "update users set mail=?  where id =?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Mail );
		ps.setString(2, Id );
	
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select

public UsersDTO updateHint(String hint ,String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "update users set hint=?  where id =?";
		ps = con.prepareStatement(sql);
		ps.setString(1, hint );
		ps.setString(2, Id );
	
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select

public UsersDTO updatePwhint(String Pwhint ,String Id  )  {//메서드 만드는중
	
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "update users set pwhint=?  where id =?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Pwhint );
		ps.setString(2, Id );
	
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		ps.executeUpdate();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		
		
		
		
		
	} catch (Exception e) {
		System.out.println("DB처리중 에러발생");
		System.out.println(e.getMessage());
		
	} finally {
		//에러 발생 여부와 상관없이 무조건 실행 시켜야하는 코드는 여기다 넣는다
		 try {
			ps.close();
			con.close();
		} catch (Exception e) {
			//e.printStackTrace();안써도 그만이다
			System.out.println("자원 해제중 에러발생!!");
		}//catch
		 
	}//try-catch-finally
	return dto;
	
					
}//select


public ArrayList selectAll() {
	ArrayList list = new ArrayList();
	UsersDTO  dto = null;
	// 1. 드라이버 설정
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1.드라이버 설정 ok.. ");

				// 2. DB연결
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2.DB 연결  ok.. ");

				// 3. SQL문 결정(객체화)
				String sql = "select * from users ";
				ps = con.prepareStatement(sql);
				
				System.out.println("3.SQL 문 객체화 ok.. ");

				// 4. SQl문을 전송
				rs = ps.executeQuery();
				System.out.println("4.SQL 문 전송 ok.. ");

				// SQl 문의 결과가 있으면 받아서 처리해라!

	
	while(rs.next()) {
		dto = new UsersDTO();
		String id = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString(3);
		String nicname = rs.getString(4);
		String mail = rs.getString(5);
		int hint = rs.getInt(6);
		String pwhint = rs.getString(7);
		//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setNicname(nicname);
		dto.setMail(mail);
		dto.setHint(hint);
		dto.setPwhint(pwhint);
		
		list.add(dto);
				
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
	
	return list;






}// selectall




}//class end


