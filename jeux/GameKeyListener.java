package jeux;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		int k = e.getKeyCode();

		if (k == KeyEvent.VK_RIGHT) {
			GamePanel.getMainPanel.addx = 1;
		}
		if (k == KeyEvent.VK_LEFT) {
			GamePanel.getMainPanel.addx = -1;
		}
		if (k == KeyEvent.VK_DOWN) {
			GamePanel.getMainPanel.addy = 1;
		}
		if (k == KeyEvent.VK_UP) {
			GamePanel.getMainPanel.addy = -1;
		}
		if (k == KeyEvent.VK_D) {
			GamePanel.getMainPanel.addxj = -1;
		}
		if (k == KeyEvent.VK_Q) {
			GamePanel.getMainPanel.addxj = 1;
		}
		if (k == KeyEvent.VK_S) {
			GamePanel.getMainPanel.addyj = -1;
		}
		if (k == KeyEvent.VK_Z) {
			GamePanel.getMainPanel.addyj = 1;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int k = e.getKeyCode();

		if (k == KeyEvent.VK_RIGHT) {
			GamePanel.getMainPanel.addx = 0;
		}
		if (k == KeyEvent.VK_LEFT) {
			GamePanel.getMainPanel.addx = 0;
		}
		if (k == KeyEvent.VK_DOWN) {
			GamePanel.getMainPanel.addy = 0;
		}
		if (k == KeyEvent.VK_UP) {
			GamePanel.getMainPanel.addy = 0;
		}
		if (k == KeyEvent.VK_D) {
			GamePanel.getMainPanel.addxj = 0;
		}
		if (k == KeyEvent.VK_Q) {
			GamePanel.getMainPanel.addxj = 0;
		}
		if (k == KeyEvent.VK_S) {
			GamePanel.getMainPanel.addyj = 0;
		}
		if (k == KeyEvent.VK_Z) {
			GamePanel.getMainPanel.addyj = 0;
		}
	}
}
