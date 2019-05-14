package 다오;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class 아이디찾기 {
	private JTextField T1;
	private JTextField T2;
	static UsersDTO dto;
	static ProjectDAOId dao;

	
	
	public 아이디찾기() {
		JFrame f = new JFrame();
		f.setTitle("Find ID");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Name input");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label);
		
		T1 = new JTextField();
		T1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel label_1 = new JLabel("Mail input");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_1);
		
		T2 = new JTextField();
		T2.setFont(new Font("굴림", Font.PLAIN, 45));
		T2.setColumns(10);
		f.getContentPane().add(T2);
		
		JButton btnNewButton = new JButton("Find ID");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = T1.getText();
				String mail = T2.getText();
			     dao = new ProjectDAOId();
			     dto = dao.select(name, mail);
				JOptionPane.showMessageDialog(btnNewButton,"Your ID is" +"'"+ dto.getId() +"' It is");
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
