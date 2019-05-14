package 다오;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class 회원정보수정 {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	static UsersDTO dto;
	static ProjectDAOPw dao;

	public 회원정보수정() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 50));
		f.setTitle("Movie program Membership update window");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblMovieProgramMembership = new JLabel("Movie program Membership update window");
		lblMovieProgramMembership.setFont(new Font("굴림", Font.PLAIN, 36));
		f.getContentPane().add(lblMovieProgramMembership);
		
		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblId);
		
		t1 = new JTextField();
		t1.setColumns(20);
		t1.setFont(new Font("Consolas", Font.PLAIN, 60));
		t1.setEditable(false);
		f.getContentPane().add(t1);
		t1.setSize(200, 200);
		
		JLabel lblPw = new JLabel("Pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblPw);
		
		t2 = new JTextField();
		t2.setFont(new Font("Consolas", Font.PLAIN, 60));
		t2.setColumns(19);
		f.getContentPane().add(t2);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblName);
		
		t4 = new JTextField();
		t4.setFont(new Font("Consolas", Font.PLAIN, 55));
		t4.setColumns(17);
		t4.setEditable(false);
		f.getContentPane().add(t4);
		
		JLabel lblNicname = new JLabel("NicName");
		lblNicname.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblNicname);
		
		t5 = new JTextField();
		t5.setFont(new Font("Consolas", Font.PLAIN, 55));
		t5.setColumns(17);
		f.getContentPane().add(t5);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblMail);
		
		t6 = new JTextField();
		t6.setFont(new Font("Consolas", Font.PLAIN, 60));
		t6.setColumns(20);
		f.getContentPane().add(t6);
		
		JLabel lblHint = new JLabel("Hint");
		lblHint.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblHint);
		
		t7 = new JTextField();
		t7.setFont(new Font("Consolas", Font.PLAIN, 60));
		t7.setColumns(20);
		f.getContentPane().add(t7);
		
		JLabel lblPwhint = new JLabel("PwHint");
		lblPwhint.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblPwhint);
		
		t8 = new JTextField();
		t8.setFont(new Font("Consolas", Font.PLAIN, 60));
		t8.setColumns(15);
		f.getContentPane().add(t8);
		
		JButton btnNewButton = new JButton("MemberShipUpdate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new ProjectDAOPw();
				ArrayList list = dao.selectAll();
				String Id = (String)list.get(1);
				String Pw = t2.getText();
				
				
				dao = new ProjectDAOPw();
				dto = dao.updatePw(Pw, Id);
				
				
				
				String Nicname = t5.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateNicname(Nicname, Id);
				
				
				String Mail = t6.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateMail(Mail, Id);
				
				String Hint = t7.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateHint(Hint, Id);
				
				String Pwhint = t8.getText();
				dao = new ProjectDAOPw();
				dto = dao.updatePwhint(Pwhint, Id);
				
				
				
				JOptionPane.showMessageDialog(btnNewButton, "계정정보가 변경되었습니다");
				
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton);
		
	
		
		
		
		
		f.setVisible(true);
	}
	
	
	
}
