package 다오;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



import javax.swing.JTextField;

public class BoardPage extends JPanel{
	JTextField[] jtf1; 
	
	JTextField[] jtf2; 
	
	JTextField[] jtf3; 
	
	JButton[] jb;
	 BoardDAO dao = new BoardDAO();
	BoardDTO dto=null;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	//선언
	int[] board1;
	String[] board2;
	String[] board3;
	String[] board4;
	String[] board5;
	 int y = 310;
	 String title = null;
	
	
	public BoardPage() {
		BoardDAO dao = new BoardDAO();
		ArrayList list = dao.selectOther();
		System.out.println(list);
		
		//초기화부분
		board1 = new int[list.size()];
		board2 = new String[list.size()];
		board3 = new String[list.size()];
		board4 = new String[list.size()];
		board5 = new String[list.size()];
		jtf1 = new JTextField[list.size()];
		jtf2 = new JTextField[list.size()];
		jtf3 = new JTextField[list.size()];
		jb = new JButton[list.size()];
		for (int i = 0; i < list.size(); i++) {//전체 출력하기
			BoardDTO dto = (BoardDTO)list.get(i);
			
			System.out.println(dto.getNumber());
			board1[i] = dto.getNumber();
			
			System.out.println(dto.getId());
			board2[i] = dto.getId();
			
			System.out.println(dto.getName());
			board3[i] = dto.getName();
			
			System.out.println(dto.getTitle());
			board4[i] = dto.getTitle();
			
			System.out.println(dto.getContent());
			board5[i] = dto.getContent();
			
			System.out.println();
			
			
		}
	
		
	
		
		setLayout(null);
		setBounds(0, 0, 900,900);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,900,900);
		add(p1);
		p1.setLayout(null);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,900,900);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		p1.setFont(new Font("굴림", Font.PLAIN, 50));
		
		p1.setSize(900,900);
		
		JLabel lblNewLabel = new JLabel("Poster Content");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 35));
		lblNewLabel.setBounds(2, 0, 864, 36);
		p1.add(lblNewLabel);
		
		//넘버텍스트필드출력
		for (int i = 0; i < board1.length; i++) {
			
			jtf1[i] = new JTextField();
			jtf1[i].setBounds(12, y, 139, 23);
			jtf1[i].setEditable(false);
			jtf1[i].setColumns(10);
			p1.add(jtf1[i]);
			y = y + 44;
			
			
			
			
		}
		
			
			
		
		
		
		//settext로 number값 지정하는중
		for (int i = board1.length-1; i >= 0; i--) {
			jtf1[i].setText(""+board1[i]);
		}

		//jbutton 배열 이름지정
	    for (int i = 0; i < board4.length; i++) {
			
	    	jb[i] = new JButton(""+board4[i]);
	    	
		}
		
		
		
		//버튼 출력
	    y=310;
	    for (int i = 0; i < board4.length; i++) {
	    	final int  a = i;
	    	jb[i].addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			
						
	    			게시판출력2 board = new 게시판출력2(board4[a]);
	    				p2.add(board);
	    				p2.setVisible(true);
	    				p1.setVisible(false);
	    				
					

	    		}
	    	});
	    	jb[i].setBounds(192, y, 357, 23);
	    	p1.add(jb[i]);
	    	y = y + 44;

	
	    }
		
		JButton button = new JButton("글쓰기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardInsert write = new BoardInsert();
				p2.add(write);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
			}
		});
		y=310;
		for (int i = 0; i < board3.length; i++) {
			
			jtf2[i] = new JTextField();
			jtf2[i].setColumns(10);
			jtf2[i].setBounds(599, y, 139, 23);
			jtf2[i].setEditable(false);
			p1.add(jtf2[i]);
			y = y + 44;
			
		}
		
		
		//settext로 name값 지정하는중
				for (int i = board3.length-1; i >= 0; i--) {
					jtf2[i].setText(""+board3[i]);
				}
		
		//아이디 텍스트 출력
		y=310;
		for (int i = 0; i < board2.length; i++) {
					
			jtf3[i] = new JTextField();
			jtf3[i].setColumns(10);
			jtf3[i].setBounds(750, y, 116, 23);
			jtf3[i].setEditable(false);
			p1.add(jtf3[i]);
			y = y + 44;
			
			
		}
		
		
		
		//settext로 id값 지정하는중
		for (int i = board2.length-1; i >= 0; i--) {
			jtf3[i].setText(""+board2[i]);
		}
		
		
		
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setBounds(12, 10, 260, 60);
		p1.add(button);
		
		JButton button_1 = new JButton("내가쓴글 목록으로");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyBoardPage2 bp2 = new MyBoardPage2();
				p2.add(bp2);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 20));
		button_1.setBounds(606, 10, 260, 60);
		p1.add(button_1);
		
		JButton button_3 = new JButton("메인페이지로 돌아가기");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				메인페이지 main = new 메인페이지();
				p2.add(main);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_3.setFont(new Font("굴림", Font.PLAIN, 20));
		button_3.setBounds(12, 80, 854, 50);
		p1.add(button_3);
		
		lblNewLabel_1 = new JLabel("게시글번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 243, 139, 30);
		p1.add(lblNewLabel_1);
		
		label = new JLabel("제목");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(211, 243, 357, 30);
		p1.add(label);
		
		label_1 = new JLabel("이름");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(622, 243, 139, 30);
		p1.add(label_1);
		
		label_2 = new JLabel("아이디");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(773, 243, 116, 30);
		p1.add(label_2);
		
		
		
	}
	
	
}
