package 다오;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메인페이지 extends JPanel{
	
	
	public 메인페이지() {
		
		
		
		setLayout(null);
		setBounds(0, 0, 900,900);
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
		
		
		
		
		
		JButton button = new JButton("회원정보수정");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원정보수정 update = new 회원정보수정(); 
				p2.add(update);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 55));
		p1.add(button);
		button.setBounds(0, 100, 500, 100);
		
		JButton button_1 = new JButton("회원정보삭제");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원정보삭제 delete = new 회원정보삭제();
				//p2.add(delete);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 55));
		p1.add(button_1);
		button_1.setBounds(200, 300, 500, 100);
		
		JButton button_2 = new JButton("내정보확인");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				p2.add(update);
//				p2.setVisible(true);
//				p1.setVisible(false);
				
				
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 55));
		p1.add(button_2);
		button_2.setBounds(400, 500, 500, 100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
