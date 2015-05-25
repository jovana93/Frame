
package hello;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;


public class SpacePanel extends JPanel {
    
     private Font mainFont;
     private final int PANEL_HEIGHT = 400;
     private final int PANEL_WIDTH = 600;
     private Paint obstacle;
    
     
     
    public SpacePanel() {
        mainFont = new Font("Ariel", Font.BOLD, 18);
        
        
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setLayout(null);
        setBackground(Color.WHITE);
        setFocusable(true);
        obstacle = new Paint((PANEL_WIDTH)/2 -70, PANEL_HEIGHT -40, 90);
    }
    
   
      
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2d = (Graphics2D)g;
        
       
        g2d.draw(obstacle.getLowerRectangle());
    }
    
}
