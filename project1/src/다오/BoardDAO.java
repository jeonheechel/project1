package 다오;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDAO {
	String url = "jdbc:mysql://localhost:3306/movieworld";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	BoardDAO dao=null;
	BoardDTO dto=null;
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		BoardDTO  dto = null;
		// 1. 드라이버 설정
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1.드라이버 설정 ok.. ");

					// 2. DB연결
					con = DriverManager.getConnection(url, user, password);
					System.out.println("2.DB 연결  ok.. ");

					// 3. SQL문 결정(객체화)
					String sql = "select * from whiteboard ";
					ps = con.prepareStatement(sql);
					
					System.out.println("3.SQL 문 객체화 ok.. ");

					// 4. SQl문을 전송
					rs = ps.executeQuery();
					System.out.println("4.SQL 문 전송 ok.. ");

					// SQl 문의 결과가 있으면 받아서 처리해라!

		
		while(rs.next()) {
			dto = new BoardDTO();
			int number = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String title = rs.getString(4);
			String content = rs.getString(5);
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setNumber(number);
			dto.setId(id);
			dto.setName(name);
			dto.setTitle(title);
			dto.setContent(content);
			
			
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
	
	
	public ArrayList selectId(String Id)  {//메서드 만드는중
		ArrayList list = new ArrayList();
		BoardDTO  dto = null;
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "select * from whiteboard where id = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, Id );
			
			
			System.out.println("3.SQL 문 객체화 ok.. ");
			
			
			//4. SQl문을 전송
			rs = ps.executeQuery();
			System.out.println("4.SQL 문 전송 ok.. ");
			
			// SQl 문의 결과가 있으면 받아서 처리해라!
			
			while(rs.next()) {
				dto = new BoardDTO();
				int number = rs.getInt(1);
				String id = rs.getString(2);
				String name = rs.getString(3);
				String title = rs.getString(4);
				String content = rs.getString(5);
				//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
				dto.setNumber(number);
				dto.setId(id);
				dto.setName(name);
				dto.setTitle(title);
				dto.setContent(content);
				
				
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
						
	}//select
	
	
	
	public ArrayList selectOther() {
		ArrayList list = new ArrayList();
		BoardDTO  dto = null;
		// 1. 드라이버 설정
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1.드라이버 설정 ok.. ");

					// 2. DB연결
					con = DriverManager.getConnection(url, user, password);
					System.out.println("2.DB 연결  ok.. ");

					// 3. SQL문 결정(객체화)
					String sql = "select number,id,name,title,content from whiteboard order by number desc ";
					ps = con.prepareStatement(sql);
					
					
					
					System.out.println("3.SQL 문 객체화 ok.. ");

					// 4. SQl문을 전송
					rs = ps.executeQuery();
					System.out.println("4.SQL 문 전송 ok.. ");

					// SQl 문의 결과가 있으면 받아서 처리해라!

		
		while(rs.next()) {
			dto = new BoardDTO();
			int number = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String title = rs.getString(4);
			String content = rs.getString(5);
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setNumber(number);
			dto.setId(id);
			dto.setName(name);
			dto.setTitle(title);
			dto.setContent(content);
			
			
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
	
	
	public BoardDTO insert(int Number , String Id, String Name, String Title, String Content)  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "insert into whiteboard values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, Number );
			ps.setString(2, Id );
			ps.setString(3, Name );
			ps.setString(4, Title );
			ps.setString(5, Content );
			
			
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
						
	}//insert
	
	
	
	public BoardDTO delete(String Title )  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "delete from whiteboard where title=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, Title );
			
			
			
			
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
						
	}//delete end
	
	
	public BoardDTO updateTitle(String Content ,String Number  )  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "update whiteboard set content=?  where number=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, Content );
			ps.setString(2, Number );
		
			
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
	}//update end
	
public BoardDTO updateContent(String Title ,String Number  )  {//메서드 만드는중
		
		
		//1. 드라이버 설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 ok.. ");
			
			//2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.DB 연결  ok.. ");
			
			//3. SQL문 결정(객체화)
			String sql = "update whiteboard set title=?  where number=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, Title );
			ps.setString(2, Number );
		
			
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
	}//update end



public ArrayList selectTitle( String Title)  {//메서드 만드는중
	ArrayList list = new ArrayList();
	BoardDTO  dto = null;
	
	//1. 드라이버 설정
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.드라이버 설정 ok.. ");
		
		//2. DB연결
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB 연결  ok.. ");
		
		//3. SQL문 결정(객체화)
		String sql = "select * from whiteboard where title=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, Title );
		
		
		System.out.println("3.SQL 문 객체화 ok.. ");
		
		
		//4. SQl문을 전송
		rs = ps.executeQuery();
		System.out.println("4.SQL 문 전송 ok.. ");
		
		// SQl 문의 결과가 있으면 받아서 처리해라!
		
		while(rs.next()) {
			dto = new BoardDTO();
			int number = rs.getInt(1);
			String id = rs.getString(2);
			String name = rs.getString(3);
			String title = rs.getString(4);
			String content = rs.getString(5);
			//위에서 검색한 값을 순서대로 dto.에다가 넣어준다는 뜻이다
			dto.setNumber(number);
			dto.setId(id);
			dto.setName(name);
			dto.setTitle(title);
			dto.setContent(content);
			
			
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
					
}//select





	
	





}//class end
