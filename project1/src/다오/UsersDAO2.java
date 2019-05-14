package 다오;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UsersDAO2 {
	//멤버변수 
		Connection con;
		PreparedStatement ps;
		String url;
		String user;
		String password;
	
		public void update(UsersDTO dto ) throws Exception {
	
//			1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");//www.naver.com=>com.naver.www
			//자바이외의 파일을 다룰때는 예외처리를 꼭해라!
			System.out.println("1. 드라이버 설정 OK.....");
			
			
//			2.DB연결(DB명,id,pw)
			 url = "jdbc:mysql://localhost:3306/movieworld";
			 user = "root";
			 password = "1234";
			 con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//db버에서  mysql에서 오른쪽클릭에서 에디트 커넥트 세팅
			
			
//			3.SQL선택
			String sql = "update users set name=? where id=?";
			// 객체화
			 ps =  con.prepareStatement(sql);
			 ps.setString(1, dto.getName());
			 ps.setString(2, dto.getId());
			
			 
			System.out.println("3. SQL문 결정 OK....");
			
			
//			4.SQL전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 완료");
	
			
		}

		

}
