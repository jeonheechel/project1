package 다오;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public abstract class test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JPanel p1 = new JPanel();
		JScrollPane sc  = new JScrollPane();
		
		f.setSize(800,800);
		f.setLayout(null);
		p1.setPreferredSize(new Dimension(382,800));
		p1.setBackground(Color.DARK_GRAY);
		
		sc.setSize(400,400);
		sc.setViewportView(p1);
		sc.setLocation(0, 0);
		f.add(sc);
		
		
		
		f.setVisible(true);
	}

}

