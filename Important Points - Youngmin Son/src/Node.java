
import java.awt.Point;

  /**
   * Node Class modified for using Point Class ArrayLists 
   * Structure is same as regular Node Class 
   * @author Youngmin
   */
    public class Node
   {
      private Point data; // Point data (x,y)
      private Node next;
    
       public Node ( ) 
      {
         data = null;
         next = null;
      }
       
       public Node(Point newData, Node newNext) // point node
       {
           this.data = newData;
           this.next = newNext;
       }
       public Node(Point data)
       {
           this.data = data;
           this.next = null;
       }
   
       public Object getData( )
      {
         return data;
      }
       // return X coordinate
       public int getX()
       {
           return data.x;
       }
       // return Y Coordinate
       public int getY()
       {
           return data.y;
       }
    
       public Node getNext( )
      {
         return next;
      }
    
       public void setData(Point newData) 
      {
         data = newData;
      }
    
       public void setNext( Node newNext )
      {
         next = newNext;
      }
   } // end class Node
    

