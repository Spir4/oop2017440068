import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("chois frame");
		frame.setSize(1080,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		JButton button = new JButton("¹öÆ°");
		frame.add(button);
		frame.setVisible(true);

	}

}
