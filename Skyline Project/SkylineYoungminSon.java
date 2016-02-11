
import javax.swing.JFrame; //import frame
public class SkylineYoungminSon
{
   //-----------------------------------------------------------------
   //  Creates the main frame of the program.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Skyline"); //new frame
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); //clicking on 'X' closes program

      Building panel = new Building(); //using panel as an object to draw random skyine
           
      frame.getContentPane().add(panel); //uses the method to actually display images
      
       
      frame.pack();
      
      frame.setVisible(true);
   }
}