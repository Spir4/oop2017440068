import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
	JButton button;//��� �޼ҵ忡�� ������ �� �ִ�.
	JButton btn;
	JTextField tf;
	public MyFrame(){
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("event frame");
		
		setLayout(new FlowLayout());
		
		this.button = new JButton("��ư");
		this.add(this.button);
		this.button.setActionCommand("button1");
		button.addActionListener(this);
		//MyListener listener = new MyListener();
		//button.addActionListener(this);//�̺�Ʈ ������ ��ü ���
		//button.addActionListener(listener);
		btn = new JButton("��ư 2");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);
		tf= new JTextField(15);
		this.add(tf);
		tf.setText("����� ��¥ ��ư�ϱ��?");
		//this.add(tf);
		setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷�����) �����´�.
		//JButton button = (JButton) e.getSource();
		if ((e.getActionCommand()).equals("button1"))
		    button.setText("����!");
		else 
			btn.setText("��!");
		this.add(tf);
		this.tf.setText("��ư �����ſ���?");
	//	System.out.println("��ư�� ���Ⱦ��!!!!");
	}

}
