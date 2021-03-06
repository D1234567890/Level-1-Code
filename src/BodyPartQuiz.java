import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/Guest/Desktop/Level-1-Code-/src/G.jpg";
	String secondImage = "/Users/Guest/Desktop/Level-1-Code-/src/A.jpg";
	String thirdImage = "/Users/Guest/Desktop/Level-1-Code-/src/O.jpg";

	Frame window = new Frame("Famous Person");

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(300, 300);
		window.setVisible(true);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String user = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		if (user.equalsIgnoreCase("George Washington")) {
			score+=3;
			JOptionPane.showMessageDialog(null, "Correct!!");
		}
		// Otherwise:
		// -- Tell them they are wrong
		else {
			JOptionPane.showMessageDialog(null, "Wrong!!");
			score--;
		}
		showNextImage();
		user = JOptionPane.showInputDialog("Who is this person?");
		if (user.equalsIgnoreCase("Abraham Lincoln")) {
			score+=3;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!!");
			score--;
		}
		showNextImage();
		user = JOptionPane.showInputDialog("Who is this person?");
		if (user.equalsIgnoreCase("Barack Obama")) {
			score+=3;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!!");
			score--;
		}
		JOptionPane.showMessageDialog(null, "Your score was "+score+" points!");
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
