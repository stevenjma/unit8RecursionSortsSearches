import java.awt.*;
import javax.swing.JPanel;

/**
 * Write a description of class FractalTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreePanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int XSTART = 250;
    private final int YSTART = 450;
    private final int XEND = 250;
    private final int YEND = 400;
    private final int ANGLE = 15;
    
    private int currentOrder;

    /**
     * Default constructor for objects of class FractalTree
     */
    public FractalTreePanel()
    {
        // initialise instance variables
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500, 500));
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void drawFractal (int order, int x1, int y1, int x4, int y4, Graphics page)
    {
        // put your code here
        double deltaX, deltaY;
        int x2, y2, x3, y3;
        
        if (order == 1) {page.drawLine(x1,y1,x4,y4);}
        else
        {
            deltaX = (x1 - x4)*(Math.cos(Math.toRadians(ANGLE)));
            deltaY = (x1 - x4)*(Math.sin(Math.toRadians(ANGLE)));
            
            x2 = (int)(x1 + deltaX);
            y2 = (int)(y1 + deltaY);
            
            x3 = (int)(x1 - deltaX);
            y3 = (int)(y1 - deltaY);
            
            drawFractal(order-1, x1, y1, x2, y2, page);
            drawFractal(order-1, x2, y2, x3, y3, page);
            drawFractal(order-1, x3, y3, x4, y4, page);
        }
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        page.setColor(Color.GREEN);
        drawFractal(currentOrder, XSTART, YSTART, XEND, YEND, page);
    }
    
    public int getOrder()
    {
        return currentOrder;
    }
    
    public void setOrder(int order)
    {
        currentOrder = order;
    }

}
