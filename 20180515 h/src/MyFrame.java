import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
	JButton button;//모든 메소드에서 접근할 수 있다.
	JButton btn;
	JTextField tf;
	public MyFrame(){
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("event frame");
		
		setLayout(new FlowLayout());
		
		this.button = new JButton("버튼");
		this.add(this.button);
		this.button.setActionCommand("button1");
		button.addActionListener(this);
		//MyListener listener = new MyListener();
		//button.addActionListener(this);//이벤트 리스너 객체 등록
		//button.addActionListener(listener);
		btn = new JButton("버튼 2");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);
		tf= new JTextField(15);
		this.add(tf);
		tf.setText("어느게 진짜 버튼일까요?");
		//this.add(tf);
		setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스값) 가져온다.
		//JButton button = (JButton) e.getSource();
		if ((e.getActionCommand()).equals("button1"))
		    button.setText("정답!");
		else 
			btn.setText("땡!");
		this.add(tf);
		this.tf.setText("버튼 누를거에요?");
	//	System.out.println("버튼이 눌렸어요!!!!");
	}

}
