package 다오;

import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;




public class UsersMainProject extends JPanel{
	private static JTextField t1;
	private static JTextField t2;
	static UsersDTO dto;
	static ProjectDAOId dao;
	static String id; 
	static String name = null; 
	
	
	public UsersMainProject() {
		
		setLayout(null);
		setBounds(0, 0, 900, 900);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,900,900);
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,900,900);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JLabel label = new JLabel("Movie program login window");
		label.setBounds(10, 0, 800, 100);
		p1.add(label);
		label.setFont(new Font("굴림", Font.PLAIN, 54));
		
		JLabel label_1 = new JLabel("ID");
		label_1.setBounds(10, 100, 100, 100);
		p1.add(label_1);
		label_1.setFont(new Font("굴림", Font.PLAIN, 65));
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 80));
		t1.setColumns(10);
		p1.add(t1);
		t1.setBounds(122, 110, 600, 100);
		
		JLabel label_2 = new JLabel("PW");
		label_2.setBounds(10,200,100,100);
		p1.add(label_2);
		label_2.setFont(new Font("굴림", Font.PLAIN, 65));
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 80));
		t2.setColumns(10);
		p1.add(t2);
		t2.setBounds(110,200,600,100);
		
		
		
		JButton b1 = new JButton("join membership");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원가입 SignUp = new 회원가입();
				p2.add(SignUp);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 35));
		p1.add(b1);
		b1.setBounds(10,350,350,100);
		
		
		JButton b2 = new JButton("Find ID");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				아이디찾기 Id = new 아이디찾기();
				//p2.add(Id);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 35));
		p1.add(b2);
		b2.setBounds(360,350,200,100);
		
		
		JButton b3 = new JButton("Find PW");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				비밀번호찾기 Pw = new 비밀번호찾기();
				p2.add(Pw);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 35));
		p1.add(b3);
		b3.setBounds(560,350,230,100);
		
		
		
		JButton b4 = new JButton("Termination");
		b4.setFont(new Font("굴림", Font.PLAIN, 65));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		p1.add(b4);
		b4.setBounds(310,500,480,200);
		
		
		
		JButton b5 = new JButton("Login");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id = t1.getText();
				id = Id;
				String Pw = t2.getText();
				dao = new ProjectDAOId();
				dto = dao.selectLogin(Id,Pw);

				
				
				
				
				
				if(dto != null && dto != null) 
				{
					메인페이지 main = new 메인페이지();
					p2.add(main);
					p2.setVisible(true);
					p1.setVisible(false);
					JOptionPane.showMessageDialog(b5, "로그인 되셨습니다 환영합니다~");
				}else {
					JOptionPane.showMessageDialog(b5, "아이디나 비밀번호가 틀렷습니다 다시확인하세요");
				}
				
				
			}

			

			
		});
		b5.setFont(new Font("굴림", Font.PLAIN, 65));
		p1.add(b5);
		b5.setBounds(10,500,300,200);
		
	}
		
	
	
	
		
		
		
		
		
		
	
	
	

	public static String getId() {
		return id;
	}

	
	

}



