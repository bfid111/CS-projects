
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
public class Driver extends DrawShape
{
         static ArrayList<Point> pointList = new ArrayList<>();
         private static Node nodeList = new Node();
         static Node first;
         static Node Temp;
         static LinkedList linkObject = new LinkedList();
         static int pass = 0;
         /**
          * 
         * Method for Creating a File List on ControlFrame Panel 
         */
         @SuppressWarnings("unchecked")
           public static void CreateList()
        {
         File folder = new File("."); 
         File[] list = folder.listFiles(); // FIle array 
           for (File list1 : list) // scans all the files in  the project folder that has .txt extension 
           {
               if (list1.isFile() && list1.getName().contains(".txt")) {
                   ControlFrame.fileList.addElement(list1.getName()); // adds the file name to the JList on the ControlFrame Panel 
               }
           }
           
         }
                /**
                 * 
                Loads the file and then stores the points to pointList Point Array.List Uses BufferedReader  and File Reader for reading files 
                * @throws java.io.IOException
                */
         public static void LoadFile() throws IOException 
    {  
         pointList.clear(); // clears list 
         try
         {       
             //     while(in.readLine()!=null) // if there is another line
             try (BufferedReader in = new BufferedReader( new FileReader(ControlFrame.jList1.getSelectedValue().toString())) // buffered reader
             ) {
                 //     while(in.readLine()!=null) // if there is another line
                 while(in.readLine() !=null)
                 {
                     int tempA,tempB; // temporary variables
                     String temp = in.readLine(); // Stores the line in to String
                     tempA= Integer.parseInt(temp.split(" ")[0]); // stores X value
                     tempB = Integer.parseInt(temp.split(" ")[1]);// Stores Y Value
                     Point tempPoint = new Point(tempA,tempB); // stores it as a Point
                     pointList.add(tempPoint); // add to arrayList   
                 }   
                        System.out.println("LOG: " + ControlFrame.jList1.getSelectedValue().toString() + " was printed " );
             }
             
       
             } catch (IOException e) {
                 //Throw Error Message
                 // TODO : create  a method that makes errorLog.txt in the future. 
                 System.out.println("ERROR! -- AT READING FILE NAME " + (ControlFrame.jList1.getSelectedValue().toString()) + e.getMessage());
             }     
             // convert pointList to NodeList
             convertNode(pointList); // convert arralist of points to node 
            Node Temp = first;
            LinkedList tempLink = new LinkedList(); // empty linked listed used for clearing data 
            // add nodes to LinkedList 
            linkObject = tempLink; // clear linked list  before loading new set of Point nodes 
          //   Point pTemp = new Point(Temp.getX(), Temp.getY());
            Point pTemp = new Point(pointList.get(0).x,pointList.get(0).y);
                linkObject.insertFront(pTemp);
            for(int a =1; a < pointList.size(); a++)
            {
              pTemp = new Point(pointList.get(a).x,pointList.get(a).y);
                linkObject.insertFront(pTemp);
            }
             pTemp = new Point(pointList.get(pointList.size()-1).x,pointList.get(pointList.size()-1).y);
            linkObject.insertBack(pTemp);
            pTemp = new Point(pointList.get(pointList.size()-2).x,pointList.get(pointList.size()-2).y);
            linkObject.insertBack(pTemp);
            /*
             while (Temp != null )
             {
                 Point pTemp = new Point(Temp.getX(), Temp.getY());
                 linkObject.insertFront(pTemp); // add Nodes to Linked List  
                 Temp = Temp.getNext();
             }
            */
             for( int a =0; a < linkObject.size(); a++)
             {
               System.out.println(a + " " + linkObject.get(a)); // print to the console to prove that all points have been passsed to LinkedList
             }
             DrawShape.drawing.repaint();   // repaint Panel          
    }
         /**
          * Converts ArrayList of Points to Nodes 
          * @param a 
          */
         public static void convertNode(ArrayList<Point> a)
         {
        //        System.out.println("Converting ArrayList of Points to NodeList ");
               first = new Node(a.get(0));
               Temp = first;
                for ( int b  =1; b  < a.size(); b++)
                {
                    Temp.setNext(new Node(a.get(b)));
                    Temp = Temp.getNext();
                }
              //  System.out.println("Convertion Complete");
         }
         /**
          * Prints All List of Nodes 
          * 
          */
         public static void printNode()
         {
             Node Temp = first;
             while (Temp != null )
             {
                   System.out.println(Temp.getData());
                   Temp = Temp.getNext();
             }
         }

         public static void removeP(int n)
         {
             pass = 0;
             double l1,l2,l3;
             ArrayList<Double> sigvalues = new ArrayList<>();
             sigvalues.add(999999.999); // first point never gets removed
            /*
             Calculate Importance Values
             */
             for(int a = 1; a < pointList.size()-1; a+=2) // leave first and last point alone
             {
                 
                     l1 =  Math.sqrt((pointList.get(a-1).x - pointList.get(a).x)*(pointList.get(a-1).x - pointList.get(a).x) +
                             (pointList.get(a-1).y - pointList.get(a).y)*(pointList.get(a-1).y - pointList.get(a).y) );
                     l2 = Math.sqrt((pointList.get(a).x - pointList.get(a+1).x)*(pointList.get(a).x - pointList.get(a+1).x) +
                            (pointList.get(a).y - pointList.get(a+1).y)*(pointList.get(a).y - pointList.get(a+1).y) );
                     l3 = Math.sqrt((pointList.get(a+1).x - pointList.get(a+2).x)*(pointList.get(a+1).x - pointList.get(a+2).x) +
                             (pointList.get(a+1).y - pointList.get(a+2).y)*(pointList.get(a+1).y - pointList.get(a+2).y) );
                     double sigval = l1+l2-l3;
                     sigvalues.add(sigval);
                     
             }
             sigvalues.add(999999.999);// last point never gets removed 
                for(int b =0; b < sigvalues.size(); b++)
                {
                    System.out.println("Sig Value Count #  " + b + " " + sigvalues.get(b)); // Debug Purposes 
                }
             while(linkObject.size() > n)
             {
                 for( int a = 1;  a < linkObject.size()-2;a+=2)
                 {
                   //  if(sigvalues.get(a-1).doubleValue() > sigvalues.get(a) && sigvalues.get(a) < sigvalues.get(a+1))
                     {
                         linkObject.remove(a);
                     }
                 }
             }
             System.out.println("Size : " +  linkObject.size());
            
                    pass =1;
            DrawShape.drawing.repaint(); // repaint panel 
                    
         }
}   
    

