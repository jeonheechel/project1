package 다오;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입 {
	private JTextField t1;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t8;
	static UsersDTO dto;
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
		JFrame f = new JFrame();
		f.setTitle("회원가입창");
		f.setSize(800, 800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("아이디");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				dao = new ProjectDAOId();
				dto = dao.selectId(id);
				if (dto == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이아이디는 사용하실수 있습니다");
					overlapId = 1;
				} else if (dto != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이아이디는 사용하실수 없습니다");
					overlapId = 0;
				}

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(btnNewButton);

		JLabel label_7 = new JLabel("이름");
		label_7.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_7);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		t2.setColumns(10);
		f.getContentPane().add(t2);

		JLabel label_1 = new JLabel("비밀번호");
		label_1.setFont(new Font("굴림", Font.PLAIN, 65));
		f.getContentPane().add(label_1);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 45));
		t3.setColumns(10);
		f.getContentPane().add(t3);

		JLabel label_2 = new JLabel("비밀번호 확인");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_2);

		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 45));
		t4.setColumns(10);
		f.getContentPane().add(t4);

		JLabel label_3 = new JLabel("닉네임");
		label_3.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_3);

		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 45));
		t5.setColumns(10);
		f.getContentPane().add(t5);

		JButton button = new JButton("중복확인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nicname = t5.getText();
				dao = new ProjectDAOId();
				dto = dao.selectId(Nicname);

				if (dto == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 있습니다");
					overlapNicname = 1;
				} else if (dto != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이닉네임는 사용하실수 없습니다");
					overlapNicname = 0;
				}

			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(button);

		JLabel label_4 = new JLabel("이메일");
		label_4.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_4);

		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.PLAIN, 45));
		t6.setColumns(10);
		f.getContentPane().add(t6);

		JButton button_1 = new JButton("중복확인");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Mail = t6.getText();
				dao = new ProjectDAOId();
				dto = dao.selectMail(Mail);

				if (dto == null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 있습니다");
					overlapMail = 1;
				} else if (dto != null) {
					JOptionPane.showMessageDialog(btnNewButton, "이이메일는 사용하실수 없습니다");
					overlapMail = 0;
				}

			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(button_1);

		JLabel label_5 = new JLabel("비밀번호 힌트고르기");
		label_5.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(label_5);

		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas", Font.BOLD, 30));
		combo.setBackground(new Color(255, 255, 255));
		combo.setBounds(235, 480, 235, 36);
		f.getContentPane().add(combo);

		JLabel label_6 = new JLabel("비밀번호 힌트 정답");
		label_6.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_6);

		t8 = new JTextField();
		t8.setFont(new Font("굴림", Font.PLAIN, 45));
		t8.setColumns(10);
		f.getContentPane().add(t8);

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
						if(dto != null && dto != null && dto != null) {
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
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 80));
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}

}
