package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class BoardDelete extends JPanel{
	 BoardDAO dao = new BoardDAO();
	BoardDTO dto=null;
	BoardDAO dao1 = new BoardDAO();
	BoardDTO dto1=null;
	UsersMainProject ump = new UsersMainProject(); 
	static UsersDTO dto2;
	static ProjectDAOId dao2;

	private final JTextField textField = new JTextField();
	
	
	public BoardDelete() {
		dao2 = new ProjectDAOId();
		dto2 = dao2.selectName1(ump.getId());
		textField.setColumns(10);
		BoardDAO dao = new BoardDAO();
		ArrayList list = dao.selectOther();
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
				String Id = ump.getId();
				dao1 = new BoardDAO();
				dto1 = dao1.delete(Id);
				
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
		
		JLabel label = new JLabel("타이틀");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(254, 28, 252, 44);
		p1.add(label);
		
		
		
	}
}
