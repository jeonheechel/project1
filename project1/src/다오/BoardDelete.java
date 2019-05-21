package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardDelete extends JPanel{
	 BoardDAO dao = new BoardDAO();
	BoardDTO dto=null;
	
	
	public BoardDelete() {
		setLayout(null);
		setBounds(0, 0, 900,900);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,913,900);
		add(p1);
		p1.setLayout(null);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,900,900);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JButton btnNewButton = new JButton("글 삭제");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(110, 736, 278, 111);
		p1.add(btnNewButton);
		
		JButton button = new JButton("게시판 메인페이지");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoardPage bp = new BoardPage();
				p2.add(bp);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		button.setBounds(508, 736, 278, 111);
		p1.add(button);
		
		
		
	}
	

}
