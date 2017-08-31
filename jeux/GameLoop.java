package jeux;

public class GameLoop implements Runnable {

	@Override
	public void run() {
		
		int attente = 6;
		
		while(true) {
			
			double start = System.nanoTime();
			
			GamePanel.getMainPanel.updatePosition();
			GamePanel.getMainPanel.repaint();
			
			double timepassed = System.nanoTime() - start;
			
			int wait = (int) (attente - timepassed/1000000);
			System.out.println(wait);
			
			try {
				Thread.sleep(wait);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
