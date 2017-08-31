package jeux;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Jeux");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(540, 370);
		frame.add(new GamePanel());
		frame.setVisible(true);
	}
}
