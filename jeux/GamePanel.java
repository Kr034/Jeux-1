package jeux;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private Image img;
	private Image imgj;
	public int x;
	public int y;
	public int xj;
	public int yj;
	public int addx;
	public int addy;
	public int addxj;
	public int addyj;
	public static GamePanel getMainPanel;

	public GamePanel() {

		addKeyListener(new GameKeyListener());
		setFocusable(true);
		requestFocus();
		ImageIcon i = new ImageIcon(getClass().getResource("/res/map.png"));
		ImageIcon ij = new ImageIcon(getClass().getResource("/res/joueur.jpg"));
		img = i.getImage();
		imgj = ij.getImage();
		x = 0;
		y = 0;
		xj = 440;
		yj = 150;
		addx = 0;
		addy = 0;
		addxj = 0;
		addyj = 0;
		getMainPanel = this;
		Thread t = new Thread(new GameLoop());
		t.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, x, y, null);
		g2.drawImage(imgj, xj, yj, null);
	}

	public void updatePosition() {
		x = x - addx;
		y = y - addy;
		xj = xj - addxj;
		yj = yj - addyj;
	}
}
