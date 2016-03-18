import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class FractalTreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FractalTreeViewer
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 1200;
    private final int HEIGHT = 1000;

    private FractalTreePanel drawing;
    private JPanel panel, tools;
    private JFrame frame;


    /**
     * Default constructor for objects of class FractalTreeViewer
     */
    public FractalTreeViewer()
    {/*
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.yellow);
        tools.setOpaque (true);

        titleLabel = new JLabel ("Fractal Tree");
        titleLabel.setForeground (Color.black);

        increase = new JButton (new ImageIcon ("increase.gif"));
        increase.setPressedIcon (new ImageIcon ("increasePressed.gif"));
        increase.setMargin (new Insets (0, 0, 0, 0));
        increase.addActionListener (this);
        decrease = new JButton (new ImageIcon ("decrease.gif"));
        decrease.setPressedIcon (new ImageIcon ("decreasePressed.gif"));
        decrease.setMargin (new Insets (0, 0, 0, 0));
        decrease.addActionListener (this);

        orderLabel = new JLabel ("Order: 1");
        orderLabel.setForeground (Color.black);

        tools.add (titleLabel);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (decrease);
        tools.add (increase);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (orderLabel);
*/
        drawing = new FractalTreePanel ();

        panel = new JPanel();
        //panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
 
    public static void main(String [] args) throws InterruptedException
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
        for (int j = 0; j < 1000; j++){
            for (int i = 0; i < 40; i++){
                viewer.drawing.setAngle(i);
                //viewer.drawing.setRightAngle(75 - i);
                viewer.drawing.repaint();
                Thread.sleep(50);
            }
            for (int i = 40; i > 0; i--){
                viewer.drawing.setAngle(i);
                //viewer.drawing.setRightAngle(75 - i);
                viewer.drawing.repaint();
                Thread.sleep(50);
            }
        }
        for (int i = 0; i < 20; i++){
            viewer.drawing.setAngle(i);
            //viewer.drawing.setRightAngle(75 - i);
            viewer.drawing.repaint();
            Thread.sleep(50);
        }
    }

}
