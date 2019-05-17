package 다오;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 비밀번호찾기 extends JPanel{
	private JTextField t1;
	private JTextField t2;
	private JTextField textField_2;
	private JTextField t4;
	static UsersDTO dto;
	static ProjectDAOPw dao;
	String[] hint = {"0  Choose","1 My hometown is", "2 My first pet is", "3 My Treasure No. 1", "4 My parents' name is", "5 My first nickname is"};
	JComboBox combo;
	
	public 비밀번호찾기() {
		setLayout(null);
		setBounds(0, 0, 800,800);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,800,800);
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,900,900);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		
		
		JLabel label_1 = new JLabel("아이디 입력");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_1);
		label_1.setBounds(0, 0, 300, 100);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(t1);
		t1.setBounds(310, 0, 400, 100);
		t1.setColumns(10);
		
		JLabel label_2 = new JLabel("이름 입력");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_2);
		label_2.setBounds(0, 150, 300, 100);
		
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		p1.add(t2);
		t2.setBounds(310, 150, 400, 100);
		
		
		JLabel label_3 = new JLabel("힌트입력");
		label_3.setFont(new Font("굴림", Font.PLAIN, 60));
		p1.add(label_3);
		label_3.setBounds(0, 300, 300, 100);
		
		
		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas",Font.BOLD,30));
		combo.setBackground(new Color(255,255,255));
		combo.setBounds(310, 300, 450, 100);
		p1.add(combo);
		
		
		JLabel label_4 = new JLabel("힌트 답 입력");
		label_4.setFont(new Font("굴림", Font.PLAIN, 48));
		label_4.setBounds(0, 500, 300, 100);
		
	
		
		JLabel label_5 = new JLabel("힌트답입력");
		label_5.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(label_5);
		label_5.setBounds(0, 500, 400, 100);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 50));
		t4.setColumns(10);
		p1.add(t4);
		t4.setBounds(300, 500, 400, 100);
		
		JButton b1 = new JButton("비밀번호찾기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				int hint = combo.getSelectedIndex();
				String pwhint = t4.getText();
				 dao = new ProjectDAOPw();
			     dto = dao.select(id, name, hint, pwhint);
			     JOptionPane.showMessageDialog(b1, "Your PW is" +"'"+ dto.getPw() +"' It is");
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 38));
		p1.add(b1);
		b1.setBounds(0, 610, 400, 180);
		
		JButton b2 = new JButton("login page");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsersMainProject ump = new UsersMainProject();
				p2.add(ump);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 38));
		b2.setBounds(400, 610, 400, 180);
		p1.add(b2);
		
		
		
		
		
		
		
		
	}
}
