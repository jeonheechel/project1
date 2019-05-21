package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class BoardInsert extends JPanel{
	private JTextField t1;
	private JTextField t2;
	 BoardDAO dao = new BoardDAO();
	BoardDTO dto=null;
	
	
	public BoardInsert() {
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
		
		JButton btnNewButton = new JButton("글입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
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
		
		t1 = new JTextField();
		t1.setBounds(29, 56, 766, 75);
		p1.add(t1);
		t1.setColumns(10);
		
		JLabel label_2 = new JLabel("타이틀");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(357, 20, 179, 26);
		p1.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("글내용");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(357, 186, 130, 41);
		p1.add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBounds(29, 250, 766, 398);
		p1.add(t2);
		t2.setColumns(10);
		
		
		
	}
}
