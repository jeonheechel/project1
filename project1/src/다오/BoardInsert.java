package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;

public class BoardInsert extends JPanel{
	BoardDAO dao = new BoardDAO();
	BoardDAO dao1 = new BoardDAO();
	BoardDTO dto = new BoardDTO();
	BoardDTO dto1 = new BoardDTO();
	static UsersDTO dto2;
	static ProjectDAOId dao2;
	private JTextField t2;
	private JTextField t3;
	UsersMainProject ump = new UsersMainProject(); 
	회원정보수정  up = new 회원정보수정();
	int[] board1;
	String[] board2;
	String[] board3;
	String[] board4;
	String[] board5;
	private JTextField t1;
	
	public BoardInsert() {
		dao2 = new ProjectDAOId();
		dto2 = dao2.selectName1(ump.getId());
		BoardDAO dao = new BoardDAO();
		ArrayList list = dao.selectOther();
		board1 = new int[list.size()];
		board2 = new String[list.size()];
		board3 = new String[list.size()];
		board4 = new String[list.size()];
		board5 = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
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
		}
		for (int i = 0; i < board1.length; i++) {
			System.out.println(board1[i]);
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
		
		JLabel label_1 = new JLabel("아이디");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(351, 10, 179, 26);
		p1.add(label_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(330, 34, 116, 54);
		t2.setEditable(false);
		t2.setText(ump.getId());
		p1.add(t2);
		
		JLabel label_3 = new JLabel("이름");
		label_3.setFont(new Font("굴림", Font.PLAIN, 20));
		label_3.setBounds(639, 10, 179, 26);
		p1.add(label_3);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(611, 32, 116, 57);
		t3.setEditable(false);
		t3.setText(up.getName());
		p1.add(t3);
		
		JTextArea t4 = new JTextArea();
		t4.setBounds(36, 142, 691, 51);
		p1.add(t4);
		
		JTextArea t5 = new JTextArea();
		t5.setBounds(36, 283, 691, 417);
		p1.add(t5);
		
		JButton btnNewButton = new JButton("글입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number = (board1[0]+1);
				System.out.println(Number);
				String Id = t2.getText();
				System.out.println(Id);
				String Name = t3.getText();
				String Title = t4.getText();
				String Content = t5.getText();
				dao1 = new BoardDAO();
				dto1 = dao1.insert(Number ,Id, Name, Title, Content );
				JOptionPane.showMessageDialog(btnNewButton, "게시글 등록이 되었습니다");
				
				
			}
		});
		btnNewButton.setBounds(62, 744, 341, 89);
		p1.add(btnNewButton);
		
		JButton button = new JButton("게시판 메인페이지");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardPage bp = new BoardPage();
				p2.add(bp);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button.setBounds(517, 744, 341, 89);
		p1.add(button);
		
		JLabel label_2 = new JLabel("타이틀");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(330, 106, 179, 26);
		p1.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("글내용");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(369, 227, 130, 41);
		p1.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setText(""+board1[0]);
		t1.setEditable(false);
		t1.setColumns(10);
		t1.setBounds(36, 34, 116, 54);
		p1.add(t1);
		
		JLabel label = new JLabel("넘버");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(59, 10, 179, 26);
		p1.add(label);
		
		
		
		
		
		
	}
}
