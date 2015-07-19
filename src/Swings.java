import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Swings implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton button;
	JButton button1;
	final int width = 100;
	final int height = 50;

	public static void main(String[] args) {
		Swings s = new Swings();
	}

	Swings() {
		window = new JFrame("Calculator");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(width, height);
		panel = new JPanel();
		button = new JButton("Add");
		button1 = new JButton("Subtract");
		panel.add(button);
		panel.add(button1);
		window.add(panel);
		button.addActionListener(this);
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String ha = JOptionPane
					.showInputDialog("What's your first number?");
			String la = JOptionPane
					.showInputDialog("What's your second number?");
			int a = Integer.parseInt(ha);
			int b = Integer.parseInt(la);
			int num = a + b;
			JOptionPane.showMessageDialog(null, "Your answer: "+num);
		}
		if (e.getSource() == button1) {
			String ha = JOptionPane
					.showInputDialog("What's your first number?");
			String la = JOptionPane
					.showInputDialog("What's your second number?");
			int a = Integer.parseInt(ha);
			int b = Integer.parseInt(la);
			int num = a - b;
			JOptionPane.showMessageDialog(null, "Your answer: "+num);
		}
	}
}
