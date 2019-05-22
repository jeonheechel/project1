package 다오;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class BoardUpdate extends JPanel{
	
	BoardDAO dao = new BoardDAO();
	BoardDTO dto=null;
	BoardDAO dao1 = new BoardDAO();
	BoardDTO dto1=null;
	UsersMainProject ump = new UsersMainProject(); 
	static UsersDTO dto2;
	static ProjectDAOId dao2;
	private JTextField t1;
	private JTextField t2;
	
	
	public BoardUpdate() {
		dao2 = new ProjectDAOId();
		dto2 = dao2.selectName1(ump.getId());
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
		
		JButton btnNewButton = new JButton("글수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Title = t1.getText();
				String Content = t2.getText();
				String Id = ump.getId();
				dao1 = new BoardDAO();
				dto1 = dao1.updateTitle(Title, Id);
				dao1 = new BoardDAO();
				dto1 = dao1.updateContent(Content, Id);
				
				
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
		
		JLabel label = new JLabel("타이틀");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(266, 10, 352, 38);
		p1.add(label);
		
		t1 = new JTextField();
		t1.setBounds(95, 73, 698, 21);
		p1.add(t1);
		t1.setColumns(10);
		
		JLabel label_1 = new JLabel("내용");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(266, 151, 352, 38);
		p1.add(label_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(95, 182, 698, 325);
		p1.add(t2);
		
		
		
	}

}
