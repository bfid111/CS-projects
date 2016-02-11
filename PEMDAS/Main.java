
import java.io.*;

public class Main
{
   /**
    *  Reads and evaluates multiple postfix expressions.
     * @param args
     * @throws java.io.IOException
    */
   public static void main (String[] args) throws IOException
   {
          String expression, again;
           int result;
            BufferedReader in = new 
            BufferedReader( new InputStreamReader(System.in));
            Driver evaluator = new Driver();
            System.out.println ("Enter a valid postfix expression: ");
            expression = in.readLine();
            result = evaluator.evaluate (expression);
            System.out.println();
            System.out.println ("Result: " + result);
            System.out.println(); 
   }
}
   

