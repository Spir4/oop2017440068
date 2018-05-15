import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ぞしぞし");
		JTextField tf = new JTextField(20);
		this.add(tf);
		setLayout(new FlowLayout());
		JButton button = new JButton("獄動");
		button.setMaximumSize(300,200);
		panel.add(label);
		panel.add(button);
		this.add(panel);
		
	
		setVisible(true);
	}

}
