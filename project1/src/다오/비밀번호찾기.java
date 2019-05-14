package 다오;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 비밀번호찾기 {
	private JTextField t1;
	private JTextField t2;
	private JTextField textField_2;
	private JTextField t4;
	static UsersDTO dto;
	static ProjectDAOPw dao;
	String[] hint = {"0  Choose","1 My hometown is", "2 My first pet is", "3 My Treasure No. 1", "4 My parents' name is", "5 My first nickname is"};
	JComboBox combo;
	
	public 비밀번호찾기() {
		JFrame f = new JFrame();
		f.setTitle("비밀번호 찾기");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("");
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("아이디 입력");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label_2 = new JLabel("이름 입력");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		JLabel label_3 = new JLabel("힌트입력");
		label_3.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(label_3);
		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas",Font.BOLD,30));
		combo.setBackground(new Color(255,255,255));
		combo.setBounds(235, 480, 235, 36);
		f.getContentPane().add(combo);
		
		
		JLabel label_4 = new JLabel("힌트 답 입력");
		label_4.setFont(new Font("굴림", Font.PLAIN, 48));
		
		
	
		
		JLabel label_5 = new JLabel("힌트답입력");
		label_5.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(label_5);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 55));
		t4.setColumns(10);
		f.getContentPane().add(t4);
		
		JButton button = new JButton("비밀번호찾기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String name = t2.getText();
				int hint = combo.getSelectedIndex();
				String pwhint = t4.getText();
				 dao = new ProjectDAOPw();
			     dto = dao.select(id, name, hint, pwhint);
			     JOptionPane.showMessageDialog(button, "Your PW is" +"'"+ dto.getPw() +"' It is");
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(button);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

	
}
