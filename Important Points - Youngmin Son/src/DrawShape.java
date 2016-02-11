/*
 * DrawShape.java
 * 
 * This program is the driver for a stand-alone application which will draw
 * shapes generated from the mpeg7 shape files.
 * the original shape is drawn, then user inputs a number of points to remove.
 * the points are taken out of the list and the new shape is redrawn.  Removal 
 * of points is handled in the build shape class.
 * 
 * Inputs:
 * 	Apple.txt
 * 	Bone.txt
 * 	Butterfly.txt
 * 	Swirl.txt
 * 
 * Outputs:
 * 	A jframe generates a window with the shapes drawn.
 * 
 * Constants:
 * 	int width - determines the width of the jframe window
 * 	int height - determines the height of the jframe window
 * 
 * Instance Variables
 * 	none
 * 
 * Constructors:
 * 	DrawShape creates a jframe for the program
 * 
 * Methods:
 * 	main - sets up the jframe
 * 	paint - draws the shapes on the jframe
 * 
 *
 * If you are not familiar with Java Swing, here is a simple program 
 * that will demonstrate the basic functionality that you need: DrawShape.java
 *
 * Below is a list of 5 shapes from the MPEG7 Shape data set that you can 
 * use to test your program. The files consist of 100 lines with two numbers 
 * per line. The 100 lines represents 100 points, and the two numbers per line 
 * are the x and y coordinates of that point.
 * The files are:
 * Apple.txt
 * Bone.txt
 * Butterfly.txt
 * Octopus.txt
 * Swirl.txt
 * 
 */

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import static java.awt.SystemColor.menu;
import static java.lang.Thread.sleep;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
//class which inherits JFrame
public class DrawShape extends JFrame {
	public static int WIDTH = 800;
	public static int HEIGHT = 800;
    static DrawShape drawing = new DrawShape(); // new DrawShape 
    //   static Graphics g;
    static ControlFrame panel = new ControlFrame(); // new JPanel  (ContrlFrame) 
    static Driver driver  = new Driver(); // driver object 
    static int count;
	/*
	 * main method - creates JFrame
	 */
    public static void main(String[] args) {
    // panel settings 
    drawing.setVisible(true);
    panel.setVisible(true);
    Driver.CreateList();   
    drawing.setBackground(Color.BLACK);
    }
	/*
	 * constructor
	 */
	public DrawShape() {
		super("Graphing a MPEG7 Shape");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        }
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Container#paint(java.awt.Graphics) draws the shapes in the
	 * JFrame
	 */
        @Override
	public void paint(Graphics g) 
	{
		count  =0 ;
		getContentPane().setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
		g.clearRect(0, 0, getWidth(), getHeight()); // clear screen 
        g.setColor(Color.WHITE);  
        Driver.Temp = Driver.first;
        Node first = Driver.Temp; // store first Node 
        aloop: // loop 
        if(Driver.linkObject.size() > 0)
        {
            try { 
                 for (int a = 1; a < Driver.linkObject.size()-1; a++)
                 {
                  // plot lines 
                  g.drawLine(Driver.linkObject.get(a).x,  Driver.linkObject.get(a).y
                  , Driver.linkObject.get(a+1).x,  Driver.linkObject.get(a+1).y);
                  count++;
                  System.out.println("Count # : " + count + " Point Plotted at : "  + Driver.linkObject.get(a).getClass() + "," + Driver.linkObject.get(a).toString());
                  sleep(80);
                  }
                  g.drawLine(Driver.linkObject.get(Driver.linkObject.size()-1).x, Driver.linkObject.get(Driver.linkObject.size()-1).y,
                  Driver.linkObject.get(1).x, Driver.linkObject.get(1).y); // connects firs point and the last point
                  } catch (InterruptedException ex) {
                  Logger.getLogger(DrawShape.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  // connects the last point to the first point 
                  //g.drawLine(Driver.linkObject.get(Driver.linkObject.size()).x, Driver.linkObject.get(Driver.linkObject.size()).y
                  //, Driver.linkObject.get(1).x, Driver.linkObject.get(1).y);      
                  break aloop; // get out of loop after plotting final point
                  // if there is no break ; makes program to freeze //
                  // TODO: Handle loop 
                  // TODO: Clear JPanel when loading a new Picture 
		}
	}
}


