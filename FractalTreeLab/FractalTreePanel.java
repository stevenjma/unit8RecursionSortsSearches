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
    private final double SCALE = 0.8;
    
    private int red = 0;
    private int green = 0;
    private int blue = 255;
    
    private int xStart = 600;
    private int xEnd = 600;
    private int yStart = 975;
    private int yEnd = 775;
    
    private int currentOrder;
    private int leftAngle;
    private int rightAngle;
    private int initialAngle;
    private int change;

    /**
     * Default constructor for objects of class FractalTree
     */
    public FractalTreePanel()
    {
        // initialise instance variables
        setBackground(Color.BLACK   );
        setPreferredSize(new Dimension(1200, 1000));
        setOrder(12);
        setAngle(-15);
        setInitialAngle(-15);
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
        double deltaX3, deltaX4, deltaY3, deltaY4, length;
        int x3, y3, x4, y4;
        
        if (order <= 1) {page.drawLine(x1,y1,x2,y2);}
        else
        {
            length = SCALE * (Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2)));
            
            deltaX3 = length*(Math.sin(Math.toRadians(rightAngle)));
            deltaX4 = length*(Math.sin(Math.toRadians(leftAngle)));
            deltaY3 = length*(Math.cos(Math.toRadians(rightAngle)));
            deltaY4 = length*(Math.cos(Math.toRadians(leftAngle)));
            
            x3 = (int)(x2 - deltaX3);
            x4 = (int)(x2 - deltaX4);
            y3 = (int)(y2 - deltaY3);
            y4 = (int)(y2 - deltaY4);
            
            if (this.green >= 245)
            {
                this.green = 0;
            }
            if (this.red >= 235)
            {
                this.red = 0;
            }
            if (this.blue <= 15)
            {
                this.blue = 255;
            }
            page.setColor(new Color(red += 20, this.green += 10, blue -= 30));
            page.drawLine(x1, y1, x2 + change, y2);
        
            drawFractal(order-1, x2, y2, x3, y3, page, rightAngle - this.rightAngle, rightAngle + this.rightAngle);
            drawFractal(order-1, x2, y2, x4, y4, page, leftAngle - this.leftAngle, leftAngle + this.leftAngle);

        }
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        page.setColor(new Color(red, green, blue));
        drawFractal(currentOrder, xStart, yStart, xEnd, yEnd, page, initialAngle, -initialAngle);
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
        leftAngle = angle;
        rightAngle = angle;
    }
    
    public void setInitialAngle(int angle)
    {
        initialAngle = angle;
    }
    
    public void changeAwesome(int change)
    {
        this.change = change;
    }
}
