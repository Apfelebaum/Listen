package animationgame;

import javax.swing.*;
public class FirstPanel extends JPanel {
	
	@Override public void paintComponent(java.awt.Graphics g){
		g.fillRect(30, 50, 45, 30);
		g.fillOval(60, 20, 40, 100);
		
		 int[] xPoints = {(int)pos.x, (int)pos.x+20, (int)pos.x+30, (int)pos.x+40, (int)pos.x+60, (int)pos.x+40, (int)pos.x+30, (int)pos.x+20};
		    int[] yPoints = {(int)pos.y, (int)pos.y-10, (int)pos.y-30, (int)pos.y-10, (int)pos.y, (int)pos.y+10, (int)pos.y+30, (int)pos.y+10};
		    int nPoints = xPoints.length;
	}

	public static void main(String[] args) {
	JFrame f=new JFrame();
	f.add(new FirstPanel());
	f.setVisible(true);

	}

}


