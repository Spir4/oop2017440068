import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

	private JButton button[];//모든 메소드에서 접근할 수 있다.
	private JPanel panel;
	private JTextField tf;
	private JLabel output;  

	public Calculator(){

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setTitle("Calculator");

		output = new JLabel("0", JLabel.RIGHT); // 레이블의 초기 값은 0
		output.setBackground(Color.WHITE);
		output.setOpaque(true);
		add(output, BorderLayout.NORTH);

		 button = new JButton[14];

		for(int i=1; i<=9; i++) {
			button[i] = new JButton(String.valueOf(i));
		}
		button[13] = new JButton("C");
		button[12] = new JButton("+");
		button[11] = new JButton("=");
		button[10] = new JButton("0");
		
		panel = new JPanel();

		panel.add(button[13]);
		panel.add(button[12]);
		panel.add(button[11]);

		for(int i=7; i<=9 ; i++){
			panel.add(button[i]);
		}

		for(int i=4; i<=6 ; i++){
			panel.add(button[i]);
		}

		for(int i=1; i<=3 ; i++){
			panel.add(button[i]);
		}

		add(button[10]);

		panel.setLayout(new GridLayout(4,5,2,2));

		
		add(panel,BorderLayout.CENTER);
		add(button[10],BorderLayout.SOUTH);

		for(int i=1 ; i<button.length ; i++){
			button[i].addActionListener(this);
		}

		pack();
		
		setVisible(true);
	}
 
    private String NAME; 
    private String String; 
    private int i = 0; 
    private String j = ""; 
    private boolean torf = false; 
    private String air = ""; 
 
	@Override
	public void actionPerformed(ActionEvent e) { 
        
            NAME = e.getActionCommand(); 
            if (NAME.equals("C")) { 
                output.setText("0"); 
                return; 
            } 
            String = output.getText(); 
            if (String.equals("0")) 
                String = ""; 
 
            if ((NAME.equals("+") && !torf)) {                
                i = Integer.parseInt(String); 
                torf = true;           
                air = NAME;  
                output.setText(String + NAME); 
            } else if (NAME.equals("=") && torf && !j.equals("")) { 
                int temp = Integer.parseInt(j); 
                output.setText(Integer.toString(Calculate(i, temp, air))); 
                calculateInit(); 
            } 
            else if(NAME.equals("=") && (!torf || j.equals(""))) { 
                
            } 
            else { 
                output.setText(String + NAME); 
            } 
 
            if(torf ) {           
                j += NAME;               
            } 
        } 
      
    protected int Calculate(int a, int b, String s) {   
                return a+b;     
        } 
    
	protected void calculateInit() { 
        NAME = ""; 
        String = ""; 
        i = 0; 
        j = ""; 
        torf = false; 
        air = ""; 
   
    } 
	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}
}
