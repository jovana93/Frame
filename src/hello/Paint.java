
package hello;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;


public class Paint {
    private Rectangle2D.Double lowerRectangle;
    
    
    private int x;
    private int y;
    private int z;
    
    private int maxHeight;
    
    public Paint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        lowerRectangle = new Rectangle2D.Double(x, y, z, 30);
    }
    public Rectangle2D.Double getLowerRectangle() {
        lowerRectangle.x = x;
        return lowerRectangle; 
    }
    
    
}

