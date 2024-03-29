import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/2;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 15;
	private static final int EYE_WIDTH = 15;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 20;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/2;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 2;
	//ears
	private static final int EAR_Y = HEAD_DIMENSION/10 * 3;
	private static final int EAR_X = HEAD_DIMENSION/10 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		
		// Draw the head
		g2.setColor(Color.gray);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		
		// Draw the Ears
		g2.setColor(Color.gray);
		g2.fillOval(x, y, EAR_X, EAR_Y);
		
		g2.setColor(Color.gray);
		g2.fillOval(x+HEAD_DIMENSION-30, y, EAR_X, EAR_Y);
		
		// Draw the eyes
		g2.setColor(Color.red);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		
		// Draw the pupils
		g2.setColor(Color.black);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x+3, y+2, EYE_WIDTH/2, EYE_HEIGHT/2);
		x += EYE_SEPARATION;
		g2.fillOval(x+5, y+2, EYE_WIDTH/2, EYE_HEIGHT/2);
		
		// Draw the mouth
		g2.setColor(Color.cyan);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		
		
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.setColor(Color.black);
		g2.drawString("Norweigen Cat: \"MJAU\"", catX, catY+HEAD_DIMENSION+25);	
	}
}
