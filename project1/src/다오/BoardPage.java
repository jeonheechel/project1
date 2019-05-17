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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	BoardDAO dao=null;
	BoardDTO dto=null;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	
	
	public BoardPage() {
		BoardDAO dao = new BoardDAO();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {//전체 출력하기
			BoardDTO dto = (BoardDTO)list.get(i);
			System.out.println(dto.getNumber());
			System.out.println(dto.getId());
			System.out.println(dto.getName());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
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
		
		textField = new JTextField();
		textField.setBounds(12, 90, 139, 23);
		p1.add(textField);
		textField.setEditable(false);
		
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 134, 139, 23);
		textField_1.setEditable(false);
		
		p1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 189, 139, 23);
		textField_2.setEditable(false);
		
		p1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 241, 139, 23);
		textField_3.setEditable(false);
		
		p1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 294, 139, 23);
		textField_4.setEditable(false);
		
		p1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 342, 139, 23);
		textField_5.setEditable(false);
		
		p1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(12, 397, 139, 23);
		textField_6.setEditable(false);
		
		p1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 456, 139, 23);
		textField_7.setEditable(false);
		
		p1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(12, 521, 139, 23);
		textField_8.setEditable(false);
		
		p1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(12, 579, 139, 23);
		textField_9.setEditable(false);
		
		p1.add(textField_9);
		
		JButton btnNewButton = new JButton("title");
		btnNewButton.setBounds(192, 90, 357, 23);
		p1.add(btnNewButton);
		
		JButton button_13 = new JButton("title");
		button_13.setBounds(192, 134, 357, 23);
		p1.add(button_13);
		
		JButton button_14 = new JButton("title");
		button_14.setBounds(192, 189, 357, 23);
		p1.add(button_14);
		
		JButton button_15 = new JButton("title");
		button_15.setBounds(192, 241, 357, 23);
		p1.add(button_15);
		
		JButton button_16 = new JButton("title");
		button_16.setBounds(192, 294, 357, 23);
		p1.add(button_16);
		
		JButton button_17 = new JButton("title");
		button_17.setBounds(192, 342, 357, 23);
		p1.add(button_17);
		
		JButton button_18 = new JButton("title");
		button_18.setBounds(192, 397, 357, 23);
		p1.add(button_18);
		
		JButton button_19 = new JButton("title");
		button_19.setBounds(192, 456, 357, 23);
		p1.add(button_19);
		
		JButton button_20 = new JButton("title");
		button_20.setBounds(192, 521, 357, 23);
		p1.add(button_20);
		
		JButton button_21 = new JButton("title");
		button_21.setBounds(192, 579, 357, 23);
		p1.add(button_21);
		
		
		JButton button = new JButton("글쓰기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				p2.add(main);
//				p2.setVisible(true);
//				p1.setVisible(false);
				
				
			}
		});
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(599, 90, 139, 23);
		textField_10.setEditable(false);
		p1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(599, 134, 139, 23);
		textField_11.setEditable(false);
		
		p1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(599, 189, 139, 23);
		textField_12.setEditable(false);
		
		p1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(599, 241, 139, 23);
		textField_13.setEditable(false);
		
		p1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(599, 294, 139, 23);
		textField_14.setEditable(false);
		
		p1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(599, 342, 139, 23);
		textField_15.setEditable(false);
		
		p1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(599, 397, 139, 23);
		textField_16.setEditable(false);
		
		p1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(599, 456, 139, 23);
		textField_17.setEditable(false);
		
		p1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(599, 521, 139, 23);
		textField_18.setEditable(false);
		p1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(599, 579, 139, 23);
		textField_19.setEditable(false);
		p1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(750, 90, 116, 23);
		textField_20.setEditable(false);
		p1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(750, 134, 116, 23);
		textField_21.setEditable(false);
		p1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(750, 189, 116, 23);
		textField_22.setEditable(false);
		p1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(750, 241, 116, 23);
		textField_23.setEditable(false);
		p1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(750, 294, 116, 23);
		textField_24.setEditable(false);
		p1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(750, 342, 116, 23);
		textField_25.setEditable(false);
		p1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(750, 397, 116, 23);
		textField_26.setEditable(false);
		p1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(750, 456, 116, 23);
		textField_27.setEditable(false);
		p1.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(750, 521, 116, 23);
		textField_28.setEditable(false);
		p1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(750, 579, 116, 23);
		textField_29.setEditable(false);
		p1.add(textField_29);
		
		
		
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setBounds(12, 731, 260, 60);
		p1.add(button);
		
		JButton button_1 = new JButton("글수정");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				p2.add(main);
//				p2.setVisible(true);
//				p1.setVisible(false);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 20));
		button_1.setBounds(309, 731, 260, 60);
		p1.add(button_1);
		
		JButton button_2 = new JButton("글삭제");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				p2.add(main);
//				p2.setVisible(true);
//				p1.setVisible(false);
				
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
