import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Write a description of class LogSpiralFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LogSpiralFrame extends JFrame
{
    
    public LogSpiralFrame()
    {
        setLayout(new BorderLayout());
        setSize(600, 600);
        setTitle("Fibonnaci Spiral");
        LogSpiralPanel panel = new LogSpiralPanel();
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String [] args)
    {
        LogSpiralFrame frame = new LogSpiralFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
