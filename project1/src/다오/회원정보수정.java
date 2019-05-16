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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class 회원정보수정 extends JPanel{
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	static UsersDTO dto1;
	static UsersDTO dto2;
	static UsersDTO dto;
	static ProjectDAOPw dao;
	static ProjectDAOId dao1;
	static ProjectDAOId dao2;
	UsersMainProject ump = new UsersMainProject(); 
	private JTextField t1;

	public 회원정보수정() {
		dao1 = new ProjectDAOId();
		dto1 = dao1.selectName(ump.getId());
		
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
	
	
		p1.setFont(new Font("굴림", Font.PLAIN, 50));
		
		p1.setSize(900,900);
		
		
		JLabel lblMovieProgramMembership = new JLabel("Movie program Membership update window");
		lblMovieProgramMembership.setFont(new Font("굴림", Font.PLAIN, 36));
		p1.add(lblMovieProgramMembership);
		lblMovieProgramMembership.setBounds(0,0, 800, 80);
		
		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblId);
		lblId.setBounds(90, 70, 200, 50);
		
		t1 = new JTextField();
		t1.setFont(new Font("Consolas", Font.PLAIN, 60));
		t1.setColumns(19);
		t1.setBounds(0, 0, 1, 1);
		p1.add(t1);
		
		JLabel lblPw = new JLabel("Pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblPw);
		lblPw.setBounds(90, 140, 200, 50);
		
		t2 = new JTextField();
		t2.setFont(new Font("Consolas", Font.PLAIN, 60));
		t2.setColumns(19);
		p1.add(t2);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblName);
		lblName.setBounds(90, 210, 200, 50);
		
		t4 = new JTextField();
		t4.setFont(new Font("Consolas", Font.PLAIN, 55));
		t4.setColumns(17);
		t4.setText(dto1.getName()); 
		t4.setEditable(false);
		p1.add(t4);
		
		JLabel lblNicname = new JLabel("NicName");
		lblNicname.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblNicname);
		lblNicname.setBounds(90, 280, 200, 50);
		
		t5 = new JTextField();
		t5.setFont(new Font("Consolas", Font.PLAIN, 55));
		t5.setColumns(17);
		p1.add(t5);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblMail);
		lblMail.setBounds(90, 350, 200, 50);
		
		t6 = new JTextField();
		t6.setFont(new Font("Consolas", Font.PLAIN, 60));
		t6.setColumns(20);
		p1.add(t6);
		
		JLabel lblHint = new JLabel("Hint");
		lblHint.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblHint);
		lblHint.setBounds(90, 420, 200, 50);
		
		t7 = new JTextField();
		t7.setFont(new Font("Consolas", Font.PLAIN, 60));
		t7.setColumns(20);
		p1.add(t7);
		
		JLabel lblPwhint = new JLabel("PwHint");
		lblPwhint.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblPwhint);
		lblPwhint.setBounds(90, 490, 200, 50);
		
		t8 = new JTextField();
		t8.setFont(new Font("Consolas", Font.PLAIN, 60));
		t8.setColumns(15);
		p1.add(t8);
		
		JButton btnNewButton = new JButton("MemberShipUpdate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText();
				dao1 = new ProjectDAOId();
				dto1 = dao1.selectName(ump.getId());
				
				String Id = t1.getText();
				String Pw = t2.getText();
				
				
				dao = new ProjectDAOPw();
				dto = dao.updatePw(Pw, ID);
				
				
				
				String Nicname = t5.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateNicname(Nicname, ID);
				
				
				String Mail = t6.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateMail(Mail, ID);
				
				String Hint = t7.getText();
				dao = new ProjectDAOPw();
				dto = dao.updateHint(Hint, ID);
				
				String Pwhint = t8.getText();
				dao = new ProjectDAOPw();
				dto = dao.updatePwhint(Pwhint, ID);
				
				
				
				JOptionPane.showMessageDialog(btnNewButton, "계정정보가 변경되었습니다");
				
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 40));
		p1.add(btnNewButton);
		
	
		
		
		
		
	}
	
	
	
}
