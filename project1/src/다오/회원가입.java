package 다오;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입 extends JPanel{
	private JTextField t1;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t8;
	static UsersDTO dto;
	static UsersDTO dto1;
	static UsersDTO dto2;
	static UsersDTO dto3;
	static ProjectDAOId dao;
	static ProjectDAOPw dao1;
	static int overlapId;
	static int overlapNicname;
	static int overlapMail;

	String[] hint = { "0  Choose", "My hometown is", "My first pet is", "My Treasure No. 1", "My parents' name is",
			"My first nickname is" };
	JComboBox combo;
	private JTextField t2;

	public 회원가입() {
		
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
		

		JLabel label = new JLabel("ID");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label);
		label.setBounds(0,0,50,80);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(t1);
		t1.setBounds(60,0,450,80);
		t1.setColumns(10);

		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				dao = new ProjectDAOId();
				dto1 = dao.selectId(id);
				if (dto1 == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이아이디는 사용하실수 있습니다");
					overlapId = 1;
				} else if (dto1 != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이아이디는 사용하실수 없습니다");
					overlapId = 0;
				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(btnNewButton);
		btnNewButton.setBounds(510,0,290,80);
		

		JLabel label_7 = new JLabel("이름");
		label_7.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_7);
		label_7.setBounds(0,90,100,80);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		t2.setColumns(10);
		p1.add(t2);
		t2.setBounds(110,90,500,80);

		JLabel label_1 = new JLabel("비밀번호");
		label_1.setFont(new Font("굴림", Font.PLAIN, 65));
		p1.add(label_1);
		label_1.setBounds(0,180,300,80);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 45));
		t3.setColumns(10);
		p1.add(t3);
		t3.setBounds(300,180,450,80);

		JLabel label_2 = new JLabel("비밀번호 확인");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_2);
		label_2.setBounds(0, 280, 300, 80);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 45));
		t4.setColumns(10);
		p1.add(t4);
		t4.setBounds(310, 280, 450, 80);

		JLabel label_3 = new JLabel("닉네임");
		label_3.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_3);
		label_3.setBounds(0, 380, 150, 80);

		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 45));
		t5.setColumns(10);
		p1.add(t5);
		t5.setBounds(150,380,400,80);

		JButton button = new JButton("중복확인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nicname = t5.getText();
				dao = new ProjectDAOId();
				dto2 = dao.selectId(Nicname);

				if (dto2 == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 있습니다");
					overlapNicname = 1;
				} else if (dto2 != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 없습니다");
					overlapNicname = 0;
				}

			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(button);
		button.setBounds(550, 380, 250, 80);
		

		JLabel label_4 = new JLabel("이메일");
		label_4.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_4);
		label_4.setBounds(0, 480, 150, 80);

		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.PLAIN, 45));
		t6.setColumns(10);
		p1.add(t6);
		t6.setBounds(130, 480, 400, 80);

		JButton button_1 = new JButton("중복확인");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Mail = t6.getText();
				dao = new ProjectDAOId();
				dto3 = dao.selectMail(Mail);

				if (dto3 == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 있습니다");
					overlapMail = 1;
				} else if (dto3 != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 없습니다");
					overlapMail = 0;
				}

			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(button_1);
		button_1.setBounds(530, 480, 250, 80);

		JLabel label_5 = new JLabel("비밀번호 힌트고르기");
		label_5.setFont(new Font("굴림", Font.PLAIN, 40));
		p1.add(label_5);
		label_5.setBounds(0, 570, 400, 80);
		

		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas", Font.BOLD, 30));
		combo.setBackground(new Color(255, 255, 255));
		//combo.setBounds(235, 480, 235, 36);
		p1.add(combo);
		combo.setBounds(410, 570, 400, 80);

		JLabel label_6 = new JLabel("비밀번호 힌트 정답");
		label_6.setFont(new Font("굴림", Font.PLAIN, 45));
		p1.add(label_6);
		label_6.setBounds(0, 660, 400, 80);

		t8 = new JTextField();
		t8.setFont(new Font("굴림", Font.PLAIN, 45));
		t8.setColumns(10);
		p1.add(t8);
		t8.setBounds(400, 660, 400, 80);

		JButton btnNewButton_1 = new JButton("회원가입!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id = t1.getText();
				String Name = t2.getText();
				String Pw = t4.getText();
				String Nicname = t5.getText();
				String Mail = t6.getText();
				int Hint = combo.getSelectedIndex();
				String Pwhint = t8.getText();
				int Grade = 0;

				if (overlapMail == 1 && overlapId == 1 && overlapNicname == 1) {
						if(dto1 == null && dto2 == null && dto3 == null) {
							dao1 = new ProjectDAOPw();
							dto = dao1.insert(Id, Name, Pw, Nicname, Mail, Hint, Pwhint, Grade);
						JOptionPane.showMessageDialog(btnNewButton, "회원가입이 되셧습니다 축하드립니다");
						}else {
							JOptionPane.showMessageDialog(btnNewButton, "다시중복확인을 하세요");
						}
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "중복확인을 하세요");
				}

			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(btnNewButton_1);
		btnNewButton_1.setBounds(0, 750, 350, 100);
		
		JButton button_2 = new JButton("login page");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsersMainProject ump = new UsersMainProject();
				p2.add(ump);
				p2.setVisible(true);
			    p1.setVisible(false);
				
				
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 50));
		p1.add(button_2);
		button_2.setBounds(410, 750, 450, 100);

	}

}
