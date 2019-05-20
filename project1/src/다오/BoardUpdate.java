package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;

public class BoardUpdate extends JPanel{
	
	
	public BoardUpdate() {
		setLayout(null);
		setBounds(0, 0, 900,900);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,913,900);
		add(p1);
		p1.setLayout(null);
		
		JButton btnNewButton = new JButton("글수정");
		btnNewButton.setBounds(95, 716, 308, 110);
		p1.add(btnNewButton);
		
		JButton button = new JButton("게시판 메인페이지");
		button.setBounds(485, 716, 308, 110);
		p1.add(button);
		JPanel p2 = new JPanel();
		p2.setBounds(0,0,900,900);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		
	}

}
