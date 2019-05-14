package 다오;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원정보삭제 {
	private JTextField t1;
	private JTextField t2;
	static UsersDTO dto;
	static ProjectDAOPw dao;

	public 회원정보삭제() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 50));
		f.setTitle("Movie program Membership delete window");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblMovieProgramMembership = new JLabel("Movie program Membership delete window");
		lblMovieProgramMembership.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(lblMovieProgramMembership);
		
		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("굴림", Font.PLAIN, 69));
		f.getContentPane().add(lblId);
		
		t1 = new JTextField();
		t1.setColumns(20);
		t1.setFont(new Font("Consolas", Font.PLAIN, 60));
		f.getContentPane().add(t1);
		t1.setSize(200, 200);
		
		JLabel lblPw = new JLabel("Pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblPw);
		
		t2 = new JTextField();
		t2.setFont(new Font("Consolas", Font.PLAIN, 60));
		t2.setColumns(20);
		f.getContentPane().add(t2);
		
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
		f.getContentPane().add(btnNewButton);
		
	
		
		
		
		
		f.setVisible(true);
	}
	
	
	
}
