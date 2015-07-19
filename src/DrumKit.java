// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame frame = new JFrame("Drum Kit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		frame.add(panel);
		String drum = "Drum.jpg";
		drumLabelWithImage = createLabelImage(drum);
		panel.add(drumLabelWithImage);
		panel.setLayout(new GridLayout());
		frame.pack();
		drumLabelWithImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {

		JLabel drumClicked = (JLabel) e.getSource();
		if (e.getX() > 75 && e.getY() < 100 && e.getX() < 260 && e.getY() > 40) {
			playSound("Sound.wav");
		}
	}

	private JLabel createLabelImage(String fileName)
			throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
