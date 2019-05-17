package 다오;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

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
	static UsersDTO dto3;
	static UsersDTO dto;
	static ProjectDAOPw dao;
	static ProjectDAOId dao1;
	static ProjectDAOId dao2;
	UsersMainProject ump = new UsersMainProject(); 
	private JTextField t1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	static int overlapNicname;
	static int overlapMail;
	String[] hint = { "0  Choose", "My hometown is", "My first pet is", "My Treasure No. 1", "My parents' name is",
	"My first nickname is" };
	JComboBox combo;

	public 회원정보수정() {
		dao1 = new ProjectDAOId();
		dto1 = dao1.selectName(ump.getId());
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
		lblId.setBounds(0, 70, 200, 50);
		
		t1 = new JTextField();
		t1.setFont(new Font("Consolas", Font.PLAIN, 60));
		t1.setColumns(19);
		p1.add(t1);
		t1.setText(dto1.getId()); 
		t1.setEditable(false);
		t1.setBounds(210, 70, 400, 50);
		
		JLabel lblPw = new JLabel("Pw");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblPw);
		lblPw.setBounds(0, 139, 200, 50);
		
		t2 = new JTextField();
		t2.setFont(new Font("Consolas", Font.PLAIN, 60));
		t2.setColumns(19);
		p1.add(t2);
		t2.setBounds(210, 140, 400, 50);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblName);
		lblName.setBounds(0, 208, 200, 50);
		
		t4 = new JTextField();
		t4.setFont(new Font("Consolas", Font.PLAIN, 55));
		t4.setColumns(17);
		t4.setText(dto1.getName()); 
		t4.setEditable(false);
		p1.add(t4);
		t4.setBounds(210, 210, 400, 50);
		
		JLabel lblNicname = new JLabel("NicName");
		lblNicname.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(lblNicname);
		lblNicname.setBounds(0, 280, 200, 50);
		
		t5 = new JTextField();
		t5.setFont(new Font("Consolas", Font.PLAIN, 55));
		t5.setColumns(17);
		p1.add(t5);
		t5.setBounds(210, 280, 400, 50);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblMail);
		lblMail.setBounds(0, 350, 200, 50);
		
		t6 = new JTextField();
		t6.setFont(new Font("Consolas", Font.PLAIN, 60));
		t6.setColumns(20);
		p1.add(t6);
		t6.setBounds(210, 350, 400, 50);
		
		JLabel lblHint = new JLabel("Hint");
		lblHint.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblHint);
		lblHint.setBounds(0, 420, 200, 50);
		
		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas", Font.BOLD, 30));
		combo.setBackground(new Color(255, 255, 255));
		//combo.setBounds(235, 480, 235, 36);
		p1.add(combo);
		combo.setBounds(210, 420, 400, 50);
		
		JLabel lblPwhint = new JLabel("PwHint");
		lblPwhint.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(lblPwhint);
		lblPwhint.setBounds(0, 490, 200, 50);
		
		t8 = new JTextField();
		t8.setFont(new Font("Consolas", Font.PLAIN, 60));
		t8.setColumns(15);
		p1.add(t8);
		t8.setBounds(210, 490, 400, 50);
		
		JButton btnNewButton = new JButton("MemberShipUpdate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID = t1.getText();
				dao1 = new ProjectDAOId();
				dto1 = dao1.selectName(ump.getId());
				
				String Id = t1.getText();
				String Pw = t2.getText();
				
				
				if(overlapMail == 1 && overlapNicname == 1) {
					dao = new ProjectDAOPw();
					dto = dao.updatePw(Pw, ID);
					
					
					
					String Nicname = t5.getText();
					dao = new ProjectDAOPw();
					dto = dao.updateNicname(Nicname, ID);
					
					
					String Mail = t6.getText();
					dao = new ProjectDAOPw();
					dto = dao.updateMail(Mail, ID);
					
					//String Hint = t7.getText();
					int Hint = combo.getSelectedIndex();
					dao = new ProjectDAOPw();
					dto = dao.updateHint(Hint, ID);
					
					String Pwhint = t8.getText();
					dao = new ProjectDAOPw();
					dto = dao.updatePwhint(Pwhint, ID);
				
				
				
				JOptionPane.showMessageDialog(btnNewButton, "계정정보가 변경되었습니다");
				}else if(overlapMail == 0 && overlapNicname == 0) {
					System.out.println("중복확인을 하세요!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.PLAIN, 40));
		p1.add(btnNewButton);
		btnNewButton.setBounds(0, 546, 800, 50);
		
		JButton btnMain = new JButton("main page");
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				메인페이지 main = new 메인페이지(); 
				p2.add(main);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		btnMain.setFont(new Font("Consolas", Font.PLAIN, 40));
		btnMain.setBounds(0, 627, 800, 50);
		p1.add(btnMain);
		

		
		JButton button = new JButton("중복체크");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nicname = t5.getText();
				dao1 = new ProjectDAOId();
				dto2 = dao1.selectId(Nicname);

				if (dto2 == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 있습니다");
					overlapNicname = 1;
				} else if (dto2 != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 없습니다");
					overlapNicname = 0;
				}
				
				
			}
		});
		button.setBounds(673, 280, 124, 50);
		p1.add(button);
		
		JButton button_1 = new JButton("중복체크");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Mail = t6.getText();
				dao1 = new ProjectDAOId();
				dto3 = dao1.selectMail(Mail);

				if (dto3 == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 있습니다");
					overlapMail = 1;
				} else if (dto3 != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 없습니다");
					overlapMail = 0;
				}
				
				
			}
		});
		button_1.setBounds(673, 350, 124, 50);
		p1.add(button_1);
		
		
	
		
		
		
		
	}
}
