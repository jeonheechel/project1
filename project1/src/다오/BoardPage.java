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
	JTextField[] jtf = new JTextField[30];
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
		ArrayList list = dao.selectAll();
		System.out.println(list);
		
		//초기화부분
		board1 = new int[list.size()];
		board2 = new String[list.size()];
		board3 = new String[list.size()];
		board4 = new String[list.size()];
		board5 = new String[list.size()];
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
		
		jtf[0] = new JTextField();
		jtf[0].setBounds(12, 90, 139, 23);
		p1.add(jtf[0]);
		jtf[0].setEditable(false);
		jtf[0].setColumns(10);
		
		
		
		
		
		jtf[1] = new JTextField();
		jtf[1].setColumns(10);
		jtf[1].setBounds(12, 134, 139, 23);
		jtf[1].setEditable(false);
		p1.add(jtf[1]);
		
		jtf[2] = new JTextField();
		jtf[2].setColumns(10);
		jtf[2].setBounds(12, 189, 139, 23);
		jtf[2].setEditable(false);
		p1.add(jtf[2]);
		
		jtf[3] = new JTextField();
		jtf[3].setColumns(10);
		jtf[3].setBounds(12, 241, 139, 23);
		jtf[3].setEditable(false);
		p1.add(jtf[3]);
		
		jtf[4] = new JTextField();
		jtf[4].setColumns(10);
		jtf[4].setBounds(12, 294, 139, 23);
		jtf[4].setEditable(false);
		p1.add(jtf[4]);
		
		jtf[5] = new JTextField();
		jtf[5].setColumns(10);
		jtf[5].setBounds(12, 342, 139, 23);
		jtf[5].setEditable(false);
		p1.add(jtf[5]);
		
		jtf[6] = new JTextField();
		jtf[6].setColumns(10);
		jtf[6].setBounds(12, 397, 139, 23);
		jtf[6].setEditable(false);
		p1.add(jtf[6]);
		
		jtf[7] = new JTextField();
		jtf[7].setColumns(10);
		jtf[7].setBounds(12, 456, 139, 23);
		jtf[7].setEditable(false);
		p1.add(jtf[7]);
		
		jtf[8] = new JTextField();
		jtf[8].setColumns(10);
		jtf[8].setBounds(12, 521, 139, 23);
		jtf[8].setEditable(false);
		p1.add(jtf[8]);
		
		jtf[9] = new JTextField();
		jtf[9].setColumns(10);
		jtf[9].setBounds(12, 579, 139, 23);
		jtf[9].setEditable(false);
		
		p1.add(jtf[9]);
		
		
		//settext로 number값 지정하는중
		for (int i = 0; i < board1.length; i++) {
			jtf[i].setText(""+board1[i]);
		}

		
		
		JButton btnNewButton = new JButton("title");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(192, 90, 357, 23);
		p1.add(btnNewButton);
		
		JButton button_13 = new JButton("title");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setBounds(192, 134, 357, 23);
		p1.add(button_13);
		
		JButton button_14 = new JButton("title");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setBounds(192, 189, 357, 23);
		p1.add(button_14);
		
		JButton button_15 = new JButton("title");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_15.setBounds(192, 241, 357, 23);
		p1.add(button_15);
		
		JButton button_16 = new JButton("title");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBounds(192, 294, 357, 23);
		p1.add(button_16);
		
		JButton button_17 = new JButton("title");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_17.setBounds(192, 342, 357, 23);
		p1.add(button_17);
		
		JButton button_18 = new JButton("title");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_18.setBounds(192, 397, 357, 23);
		p1.add(button_18);
		
		JButton button_19 = new JButton("title");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_19.setBounds(192, 456, 357, 23);
		p1.add(button_19);
		
		JButton button_20 = new JButton("title");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_20.setBounds(192, 521, 357, 23);
		p1.add(button_20);
		
		JButton button_21 = new JButton("title");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_21.setBounds(192, 579, 357, 23);
		p1.add(button_21);
		
		
		JButton button = new JButton("글쓰기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardInsert write = new BoardInsert();
				p2.add(write);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
			}
		});
		
		jtf[10] = new JTextField();
		jtf[10].setColumns(10);
		jtf[10].setBounds(599, 90, 139, 23);
		jtf[10].setEditable(false);
		jtf[10].setText(board3[0]);
		p1.add(jtf[10]);
		
		jtf[11] = new JTextField();
		jtf[11].setColumns(10);
		jtf[11].setBounds(599, 134, 139, 23);
		jtf[11].setEditable(false);
		jtf[11].setText(board3[1]);
		p1.add(jtf[11]);
		
		jtf[12] = new JTextField();
		jtf[12].setColumns(10);
		jtf[12].setBounds(599, 189, 139, 23);
		jtf[12].setEditable(false);
		jtf[12].setText(board3[2]);
		p1.add(jtf[12]);
		
		jtf[13] = new JTextField();
		jtf[13].setColumns(10);
		jtf[13].setBounds(599, 241, 139, 23);
		jtf[13].setEditable(false);
		p1.add(jtf[13]);
		
		jtf[14] = new JTextField();
		jtf[14].setColumns(10);
		jtf[14].setBounds(599, 294, 139, 23);
		jtf[14].setEditable(false);
		p1.add(jtf[14]);
		
		jtf[15] = new JTextField();
		jtf[15].setColumns(10);
		jtf[15].setBounds(599, 342, 139, 23);
		jtf[15].setEditable(false);
		p1.add(jtf[15]);
		
		jtf[16] = new JTextField();
		jtf[16].setColumns(10);
		jtf[16].setBounds(599, 397, 139, 23);
		jtf[16].setEditable(false);
		p1.add(jtf[16]);
		
		jtf[17] = new JTextField();
		jtf[17].setColumns(10);
		jtf[17].setBounds(599, 456, 139, 23);
		jtf[17].setEditable(false);
		p1.add(jtf[17]);
		
		jtf[18] = new JTextField();
		jtf[18].setColumns(10);
		jtf[18].setBounds(599, 521, 139, 23);
		jtf[18].setEditable(false);
		p1.add(jtf[18]);
		
		jtf[19] = new JTextField();
		jtf[19].setColumns(10);
		jtf[19].setBounds(599, 579, 139, 23);
		jtf[19].setEditable(false);
		p1.add(jtf[19]);
		
		
		
		jtf[20] = new JTextField();
		jtf[20].setColumns(10);
		jtf[20].setBounds(750, 90, 116, 23);
		jtf[20].setEditable(false);
		p1.add(jtf[20]);
		jtf[20].setText(board2[0]);
		
		jtf[21] = new JTextField();
		jtf[21].setColumns(10);
		jtf[21].setBounds(750, 134, 116, 23);
		jtf[21].setEditable(false);
		jtf[21].setText(board2[1]);
		p1.add(jtf[21]);
		
		jtf[22] = new JTextField();
		jtf[22].setColumns(10);
		jtf[22].setBounds(750, 189, 116, 23);
		jtf[22].setEditable(false);
		jtf[22].setText(board2[2]);
		p1.add(jtf[22]);
		
		jtf[23] = new JTextField();
		jtf[23].setColumns(10);
		jtf[23].setBounds(750, 241, 116, 23);
		jtf[23].setEditable(false);
		p1.add(jtf[23]);
		
		jtf[24] = new JTextField();
		jtf[24].setColumns(10);
		jtf[24].setBounds(750, 294, 116, 23);
		jtf[24].setEditable(false);
		p1.add(jtf[24]);
		
		jtf[25] = new JTextField();
		jtf[25].setColumns(10);
		jtf[25].setBounds(750, 342, 116, 23);
		jtf[25].setEditable(false);
		p1.add(jtf[25]);
		
		jtf[26] = new JTextField();
		jtf[26].setColumns(10);
		jtf[26].setBounds(750, 397, 116, 23);
		jtf[26].setEditable(false);
		p1.add(jtf[26]);
		
		jtf[27] = new JTextField();
		jtf[27].setColumns(10);
		jtf[27].setBounds(750, 456, 116, 23);
		jtf[27].setEditable(false);
		p1.add(jtf[27]);
		
		jtf[28] = new JTextField();
		jtf[28].setColumns(10);
		jtf[28].setBounds(750, 521, 116, 23);
		jtf[28].setEditable(false);
		p1.add(jtf[28]);
		
		jtf[29] = new JTextField();
		jtf[29].setColumns(10);
		jtf[29].setBounds(750, 579, 116, 23);
		jtf[29].setEditable(false);
		p1.add(jtf[29]);
		
		
		
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
