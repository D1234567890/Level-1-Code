import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Buttons implements ActionListener {
	final int w = 500;
	final int h = 500;
	int b = 5;
	String c = Integer.toString(b);
	JPanel panel;
	JFrame window;
	JButton button;
	JButton button1;
	JLabel label;
	Font font;

	public static void main(String[] args) {
		new Buttons();
	}

	Buttons() {
		button = new JButton("B1");
		window = new JFrame("Buttons");
		panel = new JPanel();
		button1 = new JButton("B2");
		label = new JLabel(c);
		font = new Font("arial",Font.BOLD | font.ITALIC,20);
		label.setForeground(Color.BLUE);
		panel.setBackground(Color.GREEN);
		window.pack();
		window.setSize(w, h);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		panel.add(label);
		label.setFont(font);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			b--;
			String c = Integer.toString(b);
			label.setText(c);
		}
		if (e.getSource() == button1) {
			b++;
			String c = Integer.toString(b);
			label.setText(c);
		}
	}
}
