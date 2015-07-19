import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Password_and_Username implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField UserName = new JTextField(10);
	JPasswordField Password = new JPasswordField(10);
	JLabel label = new JLabel("Username:");
	JLabel label1 = new JLabel("Password:");
	JButton button = new JButton("Submit");
	JButton button1 = new JButton("Submit");

	public static void main(String[] args) {
		Password_and_Username a = new Password_and_Username();
	}

	Password_and_Username() {
		frame.pack();
		frame.setSize(350, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		panel.add(UserName);
		panel.add(button);
		panel.add(label1);
		panel.add(Password);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent lq) {
		// TODO Auto-generated method stub
		if (lq.getSource() == button) {
			String hulpa = UserName.getText();
			System.out.println(hulpa);
		}
		if (lq.getSource() == button1) {
			String fushi = new String(Password.getPassword());
			System.out.println(fushi);
		}
	}
}
