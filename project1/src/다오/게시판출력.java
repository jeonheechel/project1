package 다오;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 게시판출력 extends JPanel{
	private JTextField t1;
	private JTextField t2;
	BoardDAO dao = new BoardDAO();
	BoardDAO dao1 = new BoardDAO();
	BoardDAO dao2 = new BoardDAO();
	UsersMainProject ump = new UsersMainProject(); 
	BoardDTO dto = null;
	String title = null;
	int board1 = 0;
	String board2 = null;
	String board3 = null;
	String board4 = null;
	String board5 = null;
	
	
	public 게시판출력( String title ) {
	String a = title;
	System.out.println(a);
	BoardDAO dao = new BoardDAO();
	ArrayList list = dao.selectTitle(a);
	for (int i = 0; i < list.size(); i++) {//전체 출력하기
		BoardDTO dto = (BoardDTO)list.get(i);
		
		System.out.println(dto.getNumber());
		board1 = dto.getNumber();
		
		System.out.println(dto.getId());
		board2 = dto.getId();
		
		System.out.println(dto.getName());
		board3 = dto.getName();
		
		System.out.println(dto.getTitle());
		board4 = dto.getTitle();
		
		System.out.println(dto.getContent());
		board5 = dto.getContent();
		
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
	
	JTextArea t3 = new JTextArea();
	t3.setBounds(56, 106, 649, 70);
	t3.setText(board4);
	p1.add(t3);
	
	JLabel lblNumber = new JLabel("number");
	lblNumber.setBounds(56, 0, 116, 25);
	p1.add(lblNumber);
	
	t1 = new JTextField();
	t1.setBounds(40, 25, 116, 31);
	p1.add(t1);
	t1.setText(""+board1);
	t1.setEditable(false);
	t1.setColumns(10);
	
	JLabel lblName = new JLabel("name");
	lblName.setBounds(331, 0, 116, 25);
	p1.add(lblName);
	
	t2 = new JTextField();
	t2.setColumns(10);
	t2.setBounds(303, 25, 116, 31);
	t2.setEditable(false);
	t2.setText(board3);
	p1.add(t2);
	
	JLabel lblTitle = new JLabel("title");
	lblTitle.setBounds(331, 81, 116, 25);
	p1.add(lblTitle);
	
	JLabel lblContent = new JLabel("content");
	lblContent.setBounds(331, 244, 116, 25);
	p1.add(lblContent);
	
	JTextArea t4 = new JTextArea();
	t4.setBounds(56, 279, 649, 465);
	t4.setText(board5);
	p1.add(t4);
	
	JButton btnNewButton =new JButton("게시글수정");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String Number = t1.getText();
			String Content = t4.getText();
			String Title = t3.getText();
			
			dao1 = new BoardDAO();
			dto = dao1.updateTitle(Content, Number);
			dao1 = new BoardDAO();
			dto = dao1.updateContent(Title, Number);
			
		}
	});
	btnNewButton.setBounds(56, 769, 326, 36);
	p1.add(btnNewButton);
	
	JButton button = new JButton("게시글 삭제");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dao2 = new BoardDAO(); 
			dto = dao2.delete(a);
			
			
			
		}
	});
	button.setBounds(377, 769, 326, 36);
	p1.add(button);
	
	JButton button_1 = new JButton("게시글 메인페이지로");
	button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			BoardPage bp = new BoardPage();
			p2.add(bp);
			p2.setVisible(true);
			p1.setVisible(false);
			
		}
	});
	button_1.setBounds(56, 802, 649, 36);
	p1.add(button_1);
	
	
	
	
	
	
	
	
	
	
	
	}
}
