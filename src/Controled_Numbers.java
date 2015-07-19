import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Controled_Numbers implements ActionListener{
	JFrame frame = new JFrame("Control");
	JPanel panel = new JPanel();
	JButton button = new JButton("Higher");
	JButton button1 = new JButton("Lower");
	JButton button2 = new JButton("Bigger");
	JButton button3 = new JButton("Smaller");
	JLabel label = new JLabel("he");
	Font font = new Font("arial",Font.BOLD,20);
public static void main(String[] args) {
	Controled_Numbers c = new Controled_Numbers();
}
Controled_Numbers() {
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	panel.add(label);
	}
@Override
public void actionPerformed(ActionEvent nu) {
	// TODO Auto-generated method stub
	
}
}