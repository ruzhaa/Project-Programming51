package project;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Mouse implements  MouseListener {
	private JButton myButton;
	
	public Mouse(JButton button){
		myButton = button;
	}
	public void mouseClicked(MouseEvent e) {
		HangmanMethods.processAnswer(myButton);
		myButton.setEnabled(false);
	}

	public void mouseEntered(MouseEvent e) {
		

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
