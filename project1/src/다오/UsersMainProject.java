package 다오;

import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;




public class UsersMainProject {
	private static JTextField t1;
	private static JTextField t2;
	static UsersDTO dto;
	static ProjectDAOPw dao;
	static ProjectDAOId dao1;
	
	public static void main(String[] args) throws Exception {
		JFrame f = new JFrame();
		f.setTitle("Movie program login window");
		f.setSize(800,800);
		
		JLabel label = new JLabel("Movie program login window");
		label.setFont(new Font("굴림", Font.PLAIN, 54));
		
		JLabel label_1 = new JLabel("ID");
		label_1.setFont(new Font("굴림", Font.PLAIN, 65));
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 80));
		t1.setColumns(10);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("굴림", Font.PLAIN, 65));
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 80));
		t2.setColumns(10);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		f.getContentPane().add(label);
		f.getContentPane().add(label_1);
		f.getContentPane().add(t1);
		f.getContentPane().add(label_2);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("join membership");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원가입 SignUp = new 회원가입();
				
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Find ID");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				아이디찾기 Id = new 아이디찾기();
			
				
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("Find Password");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				비밀번호찾기 Pw = new 비밀번호찾기();
				
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(button_1);
		
		JButton btnNewButton_1 = new JButton("Termination");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 65));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Id = t1.getText();
				String Pw = t2.getText();
				dao1 = new ProjectDAOId();
				dto = dao1.selectLogin(Id,Pw);
				
				
				if(dto != null && dto != null) 
				{
					메인페이지 main = new 메인페이지();
					JOptionPane.showMessageDialog(btnNewButton, "로그인 되셨습니다 환영합니다~");
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "아이디나 비밀번호가 틀렷습니다 다시확인하세요");
				}
				
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 65));
		f.getContentPane().add(btnNewButton_2);
		
		
		
		
		

		
		f.setVisible(true);
	}
	
	

}



