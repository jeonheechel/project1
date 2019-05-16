package 다오;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartFrame {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(900, 900);
		f.setTitle("start frame");
		f.getContentPane().setLayout(null);
		UsersMainProject ump = new UsersMainProject();
		f.add(ump);

		
		f.setVisible(true);
	}

}
