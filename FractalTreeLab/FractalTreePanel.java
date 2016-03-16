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
    private final double SCALE = 0.8;
    
    private int currentOrder;
    private int angle = 0;

    /**
     * Default constructor for objects of class FractalTree
     */
    public FractalTreePanel()
    {
        // initialise instance variables
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500, 500));
        setOrder(6);
        setAngle(15);
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
    public void drawFractal (int order, int x1, int y1, int x2, int y2, Graphics page, int leftAngle, int rightAngle)
    {
        // put your code here
        double deltaX, deltaY, length;
        int x3, y, x4;
        
        if (order <= 1) {page.drawLine(x1,y1,x2,y2);}
        else
        {
            length = SCALE * (Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2)));
            
            deltaX = length*(Math.sin(Math.toRadians(leftAngle)));
            deltaY = length*(Math.cos(Math.toRadians(rightAngle)));
            
            x3 = (int)(x2 - deltaX);
            x4 = (int)(x2 + deltaX);
            y = (int)(y2 + deltaY);
            
            page.drawLine(x1, x2, y1, y2);
        
            drawFractal(order-1, x2, y2, x3, y, page, leftAngle - (int)(SCALE*ANGLE), rightAngle + (int)(SCALE*ANGLE));
            drawFractal(order-1, x2, y2, x4, y, page, leftAngle - (int)(SCALE*ANGLE), rightAngle + (int)(SCALE*ANGLE));

        }
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        page.setColor(Color.GREEN);
        drawFractal(currentOrder, XSTART, YSTART, XEND, YEND, page, -angle, angle);
        setAngle(0);
    }
    
    public int getOrder()
    {
        return currentOrder;
    }
    
    public void setOrder(int order)
    {
        currentOrder = order;
    }

    public void setAngle(int angle)
    {
        this.angle = angle;
    }
}
