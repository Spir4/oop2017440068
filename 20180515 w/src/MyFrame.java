import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("��������");
		JTextField tf = new JTextField(20);
		JButton button = new JButton("��ư");
		
		button.setText("adsf");
		
		setLayout(new FlowLayout());
		
		panel.add(label);
		panel.add(button);
		panel.add(tf);
		this.add(panel);
//		pack();
		setVisible(true);
	}

}
