// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		int score = 100;
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		String website = "http://i.imgur.com/kwnDc.png";
		String website1 = "http://fc09.deviantart.net/fs71/f/2012/350/a/a/minecraft_zombie_by_inuyasha0560-d5o8ic0.jpg";
		Component image;
		image = createImage(website1);
		quizWindow.add(image);
		quizWindow.pack();
		String ask = JOptionPane
				.showInputDialog("What is the creature on the left?");
		if (ask.equalsIgnoreCase("zombie")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		while (!ask.equalsIgnoreCase("zombie")) {
			ask = JOptionPane.showInputDialog(null, "Incorrect!");
			score -= 5;
			if (ask.equalsIgnoreCase("zombie")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
		}
		quizWindow.remove(image);
		Component image1;
		image1 = createImage(website);
		quizWindow.add(image1);
		quizWindow.pack();
		String ask1 = JOptionPane.showInputDialog("What is this creature?");
		if (ask1.equalsIgnoreCase("villager")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		while (!ask1.equalsIgnoreCase("villager")) {
			ask1 = JOptionPane.showInputDialog("Incorrect!");
			score -= 5;
			if (ask1.equalsIgnoreCase("villager")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score++;
			}
		}
		quizWindow.remove(image1);
		quizWindow.pack();
		JOptionPane.showMessageDialog(null, "Your score is " + score + "!");
	}

	private static Component createImage(String imageUrl)
			throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}
