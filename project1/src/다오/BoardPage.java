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
		p1.setBounds(0,0,913,900);
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
		
		
		
			
			jtf1[0] = new JTextField();
			jtf1[0].setBounds(12, 90, 139, 23);
			jtf1[0].setEditable(false);
			jtf1[0].setColumns(10);
			p1.add(jtf1[0]);
			
			
			
			
			
			jtf1[1] = new JTextField();
			jtf1[1].setColumns(10);
			jtf1[1].setBounds(12, 134, 139, 23);
			jtf1[1].setEditable(false);
			p1.add(jtf1[1]);
			
			jtf1[2] = new JTextField();
			jtf1[2].setColumns(10);
			jtf1[2].setBounds(12, 189, 139, 23);
			jtf1[2].setEditable(false);
			p1.add(jtf1[2]);
			
			jtf1[3] = new JTextField();
			jtf1[3].setColumns(10);
			jtf1[3].setBounds(12, 241, 139, 23);
			jtf1[3].setEditable(false);
			p1.add(jtf1[3]);
			
			jtf1[4] = new JTextField();
			jtf1[4].setColumns(10);
			jtf1[4].setBounds(12, 294, 139, 23);
			jtf1[4].setEditable(false);
			p1.add(jtf1[4]);
			
			jtf1[5] = new JTextField();
			jtf1[5].setColumns(10);
			jtf1[5].setBounds(12, 342, 139, 23);
			jtf1[5].setEditable(false);
			p1.add(jtf1[5]);
			
			jtf1[6] = new JTextField();
			jtf1[6].setColumns(10);
			jtf1[6].setBounds(12, 397, 139, 23);
			jtf1[6].setEditable(false);
			p1.add(jtf1[6]);
			
			jtf1[7] = new JTextField();
			jtf1[7].setColumns(10);
			jtf1[7].setBounds(12, 456, 139, 23);
			jtf1[7].setEditable(false);
			p1.add(jtf1[7]);
			
			jtf1[8] = new JTextField();
			jtf1[8].setColumns(10);
			jtf1[8].setBounds(12, 521, 139, 23);
			jtf1[8].setEditable(false);
			p1.add(jtf1[8]);
			
			jtf1[9] = new JTextField();
			jtf1[9].setColumns(10);
			jtf1[9].setBounds(12, 579, 139, 23);
			jtf1[9].setEditable(false);
			p1.add(jtf1[9]);
			
		
		
		
		//settext로 number값 지정하는중
		for (int i = board1.length-1; i >= 0; i--) {
			jtf1[i].setText(""+board1[i]);
		}

		//jbutton 배열 이름지정
	    for (int i = 0; i < board4.length; i++) {
			
	    	jb[i] = new JButton(""+board4[i]);
	    	
		}
		
		
		
		
	
		jb[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[0].setBounds(192, 90, 357, 23);
		p1.add(jb[0]);
		
		 jb[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		 jb[1].setBounds(192, 134, 357, 23);
		p1.add(jb[1]);
		
		jb[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[2].setBounds(192, 189, 357, 23);
		p1.add(jb[2]);
		
		jb[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[3].setBounds(192, 241, 357, 23);
		p1.add(jb[3]);
		
		jb[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[4].setBounds(192, 294, 357, 23);
		p1.add(jb[4]);
		
		jb[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[5].setBounds(192, 342, 357, 23);
		p1.add(jb[5]);
		
		jb[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[6].setBounds(192, 397, 357, 23);
		p1.add(jb[6]);
		
		jb[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[7].setBounds(192, 456, 357, 23);
		p1.add(jb[7]);
		
		jb[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[8].setBounds(192, 521, 357, 23);
		p1.add(jb[8]);
		
		jb[9].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jb[9].setBounds(192, 579, 357, 23);
		p1.add(jb[9]);
		
		
		JButton button = new JButton("글쓰기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardInsert write = new BoardInsert();
				p2.add(write);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
			}
		});
		
		jtf2[0] = new JTextField();
		jtf2[0].setColumns(10);
		jtf2[0].setBounds(599, 90, 139, 23);
		jtf2[0].setEditable(false);
		p1.add(jtf2[0]);
		
		jtf2[1] = new JTextField();
		jtf2[1].setColumns(10);
		jtf2[1].setBounds(599, 134, 139, 23);
		jtf2[1].setEditable(false);
		p1.add(jtf2[1]);
		
		jtf2[2] = new JTextField();
		jtf2[2].setColumns(10);
		jtf2[2].setBounds(599, 189, 139, 23);
		jtf2[2].setEditable(false);
		p1.add(jtf2[2]);
		
		jtf2[3] = new JTextField();
		jtf2[3].setColumns(10);
		jtf2[3].setBounds(599, 241, 139, 23);
		jtf2[3].setEditable(false);
		p1.add(jtf2[3]);
		
		jtf2[4] = new JTextField();
		jtf2[4].setColumns(10);
		jtf2[4].setBounds(599, 294, 139, 23);
		jtf2[4].setEditable(false);
		p1.add(jtf2[4]);
		
		jtf2[5] = new JTextField();
		jtf2[5].setColumns(10);
		jtf2[5].setBounds(599, 342, 139, 23);
		jtf2[5].setEditable(false);
		p1.add(jtf2[5]);
		
		jtf2[6] = new JTextField();
		jtf2[6].setColumns(10);
		jtf2[6].setBounds(599, 397, 139, 23);
		jtf2[6].setEditable(false);
		p1.add(jtf2[6]);
		
		jtf2[7] = new JTextField();
		jtf2[7].setColumns(10);
		jtf2[7].setBounds(599, 456, 139, 23);
		jtf2[7].setEditable(false);
		p1.add(jtf2[7]);
		
		jtf2[8] = new JTextField();
		jtf2[8].setColumns(10);
		jtf2[8].setBounds(599, 521, 139, 23);
		jtf2[8].setEditable(false);
		p1.add(jtf2[8]);
		
		jtf2[9] = new JTextField();
		jtf2[9].setColumns(10);
		jtf2[9].setBounds(599, 579, 139, 23);
		jtf2[9].setEditable(false);
		p1.add(jtf2[9]);
		
		//settext로 name값 지정하는중
				for (int i = board3.length-1; i >= 0; i--) {
					jtf2[i].setText(""+board3[i]);
				}
		
		
		
		jtf3[0] = new JTextField();
		jtf3[0].setColumns(10);
		jtf3[0].setBounds(750, 90, 116, 23);
		jtf3[0].setEditable(false);
		p1.add(jtf3[0]);
		
		jtf3[1] = new JTextField();
		jtf3[1].setColumns(10);
		jtf3[1].setBounds(750, 134, 116, 23);
		jtf3[1].setEditable(false);
		p1.add(jtf3[1]);
		
		jtf3[2] = new JTextField();
		jtf3[2].setColumns(10);
		jtf3[2].setBounds(750, 189, 116, 23);
		jtf3[2].setEditable(false);
		p1.add(jtf3[2]);
		
		jtf3[3] = new JTextField();
		jtf3[3].setColumns(10);
		jtf3[3].setBounds(750, 241, 116, 23);
		jtf3[3].setEditable(false);
		p1.add(jtf3[3]);
		
		jtf3[4] = new JTextField();
		jtf3[4].setColumns(10);
		jtf3[4].setBounds(750, 294, 116, 23);
		jtf3[4].setEditable(false);
		p1.add(jtf3[4]);
		
		jtf3[5] = new JTextField();
		jtf3[5].setColumns(10);
		jtf3[5].setBounds(750, 342, 116, 23);
		jtf3[5].setEditable(false);
		p1.add(jtf3[5]);
		
		jtf3[6] = new JTextField();
		jtf3[6].setColumns(10);
		jtf3[6].setBounds(750, 397, 116, 23);
		jtf3[6].setEditable(false);
		p1.add(jtf3[6]);
		
		jtf3[7] = new JTextField();
		jtf3[7].setColumns(10);
		jtf3[7].setBounds(750, 456, 116, 23);
		jtf3[7].setEditable(false);
		p1.add(jtf3[7]);
		
		jtf3[8] = new JTextField();
		jtf3[8].setColumns(10);
		jtf3[8].setBounds(750, 521, 116, 23);
		jtf3[8].setEditable(false);
		p1.add(jtf3[8]);
		
		jtf3[9] = new JTextField();
		jtf3[9].setColumns(10);
		jtf3[9].setBounds(750, 579, 116, 23);
		jtf3[9].setEditable(false);
		p1.add(jtf3[9]);
		
		
		
		//settext로 id값 지정하는중
		for (int i = board2.length-1; i >= 0; i--) {
			jtf3[i].setText(""+board2[i]);
		}
		
		
		
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setBounds(12, 731, 260, 60);
		p1.add(button);
		
		JButton button_1 = new JButton("글수정");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardUpdate update = new BoardUpdate();
				p2.add(update);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 20));
		button_1.setBounds(309, 731, 260, 60);
		p1.add(button_1);
		
		JButton button_2 = new JButton("글삭제");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardDelete delete = new BoardDelete();
				p2.add(delete);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 20));
		button_2.setBounds(616, 731, 260, 60);
		p1.add(button_2);
		
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
		button_3.setBounds(12, 801, 864, 50);
		p1.add(button_3);
		
		lblNewLabel_1 = new JLabel("게시글번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 41, 139, 30);
		p1.add(lblNewLabel_1);
		
		label = new JLabel("제목");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(192, 41, 357, 30);
		p1.add(label);
		
		label_1 = new JLabel("이름");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(599, 41, 139, 30);
		p1.add(label_1);
		
		label_2 = new JLabel("아이디");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(749, 41, 116, 30);
		p1.add(label_2);
		
		
		
	}
	
	
}
