package 다오;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원정보삭제 extends JPanel{
	private JTextField t1;
	private JTextField t2;
	static UsersDTO dto;
	static ProjectDAOPw dao;

	public 회원정보삭제() {
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
		
		JLabel lblMovieProgramMembership = new JLabel("Movie program Membership delete window");
		lblMovieProgramMembership.setFont(new Font("굴림", Font.PLAIN, 38));
		p1.add(lblMovieProgramMembership);
		lblMovieProgramMembership.setBounds(0, 0, 700, 50);
		
		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblId);
		lblId.setBounds(23, 60, 200, 50);
		
		t1 = new JTextField();
		t1.setColumns(20);
		t1.setFont(new Font("Consolas", Font.PLAIN, 50));
		p1.add(t1);
		t1.setBounds(234, 60, 500, 50);
		
		
		JLabel lblPw = new JLabel("Pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblPw);
		lblPw.setBounds(12, 126, 200, 50);
		
		t2 = new JTextField();
		t2.setFont(new Font("Consolas", Font.PLAIN, 50));
		t2.setColumns(20);
		p1.add(t2);
		t2.setBounds(234, 126, 500, 50);
		
		JButton btnNewButton = new JButton("MemberShipDelete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Id = t1.getText();
				String Pw = t2.getText();
				
				dao = new ProjectDAOPw();
				dto = dao.selectPw(Pw);
				if(dto != null) {
				dao = new ProjectDAOPw();
				dto = dao.delete(Id);
				JOptionPane.showMessageDialog(btnNewButton, "계정이 삭제 되었습니다");
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "아이디와 비밀번호를 다시확인해주세요");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 40));
		p1.add(btnNewButton);
		btnNewButton.setBounds(12, 206, 800, 100);
		
		JButton btnMainPage = new JButton("Login page");
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsersMainProject ump = new UsersMainProject();
				p2.add(ump);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		btnMainPage.setFont(new Font("Consolas", Font.PLAIN, 40));
		btnMainPage.setBounds(12, 367, 800, 100);
		p1.add(btnMainPage);
		
	
		
		
		
		
	}
	
	
	
}
