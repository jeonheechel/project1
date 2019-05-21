package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardUpdate extends JPanel{
	 BoardDAO dao = new BoardDAO();
	 BoardDTO dto=null;
	
	
	public BoardUpdate() {
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
		
		JButton btnNewButton = new JButton("글수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(95, 716, 308, 110);
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
		button.setBounds(485, 716, 308, 110);
		p1.add(button);
		
		
		
	}

}
