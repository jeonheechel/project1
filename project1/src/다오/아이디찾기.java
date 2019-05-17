package 다오;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class 아이디찾기 extends JPanel{
	private JTextField T1;
	private JTextField T2;
	static UsersDTO dto;
	static ProjectDAOId dao;

	
	
	public 아이디찾기() {
		setLayout(null);
		setBounds(0, 0, 1000,1000);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,1000,1000);
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,1000,1000);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JLabel label = new JLabel("Name input");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label);
		label.setBounds(0, 0, 300, 50);
		
		T1 = new JTextField();
		T1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(T1);
		T1.setBounds(310, 0, 400, 50);
		T1.setColumns(10);
		
		JLabel label_1 = new JLabel("Mail input");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_1);
		label_1.setBounds(0, 70, 300, 50);
		
		T2 = new JTextField();
		T2.setFont(new Font("굴림", Font.PLAIN, 45));
		T2.setColumns(10);
		p1.add(T2);
		T2.setBounds(310, 70, 400, 50);
		
		JButton btnNewButton = new JButton("Find ID");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = T1.getText();
				String mail = T2.getText();
			     dao = new ProjectDAOId();
			     dto = dao.select(name, mail);
				JOptionPane.showMessageDialog(btnNewButton,"Your ID is" +"'"+ dto.getId() +"' It is");
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		p1.add(btnNewButton);
		btnNewButton.setBounds(0, 177, 800, 150);
		
		JButton button = new JButton("비밀번호찾기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				비밀번호찾기 pw = new 비밀번호찾기();
				p2.add(pw);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 30));
		button.setBounds(0, 379, 800, 150);
		p1.add(button);
		
		JButton button_1 = new JButton("login page");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsersMainProject ump = new UsersMainProject();
				p2.add(ump);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 30));
		button_1.setBounds(0, 559, 800, 150);
		p1.add(button_1);
		
		
		
		
		
		
		
		
		
		
	}
}
