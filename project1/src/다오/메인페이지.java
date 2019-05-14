package 다오;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메인페이지 {
	
	public 메인페이지() {
		JFrame f = new JFrame();
		f.setTitle("Movie program main window");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("회원정보수정");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원정보수정 update = new 회원정보수정(); 
				
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 55));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("회원정보삭제");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				회원정보삭제 delete = new 회원정보삭제();
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 55));
		f.getContentPane().add(button_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
	
	

}
