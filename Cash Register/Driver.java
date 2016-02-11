
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 15yson
 */
public class Driver implements ActionListener
{
    public static int amount = 0;
    @Override
    /**
     * Action Listener for objects on JFrame 
     */
     public  void actionPerformed(ActionEvent e) {
         int check = 0;
        {
        if(e.getSource() == Frame.jButton14) // if Candy Button was Clicked 
        {
        double candyprice = 0.50;
        Frame.total = Frame.total-Frame.candycount*candyprice; 
        try{
        Frame.candycount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity")); // inputs quantity 
          }catch(NumberFormatException a){ // catch error 
         System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
        }
        
        Frame.total += (candyprice * Frame.candycount); // add total 
        Frame.jTextArea1.append("\n" + "Candy -- " + " Price : $ " + candyprice*Frame.candycount + "\n" + "Total Quantity of Candies : " + Frame.candycount + "\n"); // updates log with price
        }
        }
        {
        if (e.getSource() == Frame.jButton15) // if Chip Button was Clicked 
        {
        double chipprices = 1.00;
        Frame.total = Frame.total - Frame.chipcount*chipprices;
        try{
        Frame.chipcount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity"));
           }catch(NumberFormatException a){ // catch error 
         System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
           }
        Frame.total += (chipprices*Frame.chipcount);
        Frame.jTextArea1.append("\n" + "Chips -- " + " Price : $ " + chipprices*Frame.chipcount + "\n" + "Total Quantity of Chips: " + Frame.chipcount + "\n"); // updates log with price
        }
        if(e.getSource()==Frame.jButton28) // if soda button was clicked 
        {
        double sodaprice = 0.50;
        Frame.total = Frame.total-Frame.sodacount*sodaprice;
        try{
        Frame.sodacount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity"));
           }catch(NumberFormatException a){ // catch error 
          System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
           }
        Frame.total += (sodaprice*Frame.sodacount);
        Frame.jTextArea1.append("\n" + "Soda -- " + " Price : $ " + sodaprice*Frame.sodacount + "\n" + "Total Quantity of Sodas : " + Frame.sodacount+ "\n" ); // updates log with price// TODO check price 
        }
        if(e.getSource() == Frame.jButton16) // if hotdog button was clicked 
        {
        double hotdogprice = 1.50;
        Frame.total = Frame.total-Frame.hotdogcount*hotdogprice;
        try{
        Frame.hotdogcount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity"));
           }catch(NumberFormatException a){ // catch error 
          System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
           }
        Frame.total += (hotdogprice*Frame.hotdogcount);
        Frame.jTextArea1.append("\n" + "Hotdog -- " + " Price : $ " + hotdogprice*Frame.hotdogcount + "\n" + "Total Quantity of Hotdogs : " + Frame.hotdogcount+ "\n" ); // updates log with price
        }
        if(e.getSource() == Frame.jButton12) // if fires button was clicked 
        {
        double fryprice = 1.50;
        Frame.total = Frame.total- Frame.friescount*fryprice;
        try
        {
        Frame.friescount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity"));
           }catch(NumberFormatException a){ // catch error 
         System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
           }
        Frame.total += (fryprice* Frame.friescount);
        Frame.jTextArea1.append("\n" + "French Fry -- " + " Price : $ " + fryprice*Frame.friescount + "\n" + "Total Quantity of French Fries: " + Frame.friescount+ "\n"); // updates log with price 
        }
        if(e.getSource() == Frame.jButton13)
        {
        double burgerprice  = 2.00;// 
        Frame.total = Frame.total-Frame.burgercount*burgerprice;
        try
        {
        Frame.burgercount += Integer.parseInt(JOptionPane.showInputDialog(null, "Quantity"));
          }catch(NumberFormatException a){ // catch error 
         System.out.println("ERROR : -- Quantity cannot be NULL!   :" + a +  "-----");
          }
        Frame.total += (burgerprice*Frame.burgercount);
        Frame.jTextArea1.append("\n" + "Burger -- " + " Price : $ " + burgerprice*Frame.burgercount + "\n" + "Total Qunatity of Burgers : " + Frame.burgercount + "\n" ); // updates log with price   
        }
        
        }
        /**
        Action Handler for Price Buttons 
        */
        if(e.getSource() == Frame.jButton17) // if $0.25 was clicked 
        {
          if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());       // set jTextfield 1 to 0.25 
        }
        Frame.temp+=0.25;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));               
        }
        if(e.getSource() == Frame.jButton19)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=0.50;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
          if(e.getSource() == Frame.jButton10)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=1.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
          if(e.getSource() == Frame.jButton20)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=5.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
          if(e.getSource() == Frame.jButton21)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=10.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
           if(e.getSource() == Frame.jButton29)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=20.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
           if(e.getSource() == Frame.jButton22)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=30.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
           if(e.getSource() == Frame.jButton23)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=50.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
             if(e.getSource() == Frame.jButton24)
        {
            if("".equals(Frame.jTextField1.toString()) == true) // if textfield is not empty 
        {
            Frame.temp = Double.parseDouble(Frame.jTextField1.getText());      
        }
        Frame.temp+=100.00;
        Frame.jTextField1.setText(String.valueOf(Frame.temp));     
        }
             /**
             Clears Data 
             */
             if(e.getSource()==Frame.jButton26)
             {
                 clearData(); //clears data 
             }
             /**
             PRINTS TOTAL PRICE AND CASH TENDERED 
             */
             if(e.getSource()==Frame.jButton25)
             {
                  if("".equals(Frame.jTextField1.getText() ))
        {
            if(Frame.tenderedcash == 0)
            {
           JOptionPane.showMessageDialog(null, "ENTER AMOUNT OF CASH TENDERED!");
            }
        }
        else
        {
            int a = 0;
            Frame.jTextArea1.append("\n"+ "-------------------------------------------------" + "\n" + "Total Price : $ " + Frame.total);
            Frame.tenderedcash = Double.parseDouble(Frame.jTextField1.getText()); // gets amount of cash recieved from text area 
            if(Frame.tenderedcash < Frame.total)
            {
                Frame.jTextArea1.append("\n" + "ALERT! AMOUNT OF CASH RECEIV" + "\n"+ "ED IS LESS THAN GRAND TOTAL !");
            }
            else
            {
            Frame.changecash = Frame.tenderedcash - Frame.total;
            Frame.jTextArea1.append("\n" + "Cash Received : $ " + Frame.tenderedcash + "\n" + "Changes : $ " + Frame.changecash );
             
            Frame.jTextArea1.append("\n" + "-----------------------------------------");
            /**
            Prints # of coins and bills to return 
            */
           amount = (int)((Frame.changecash)*100);
           Frame.jTextArea1.append("\n" + "# of 100 dollar bills to return : " + computeCoin(10000) ); 
           Frame.jTextArea1.append("\n" + "# of 50 dollar bills to return : " + computeCoin(5000) ); 
           Frame.jTextArea1.append("\n" + "# of 20 dollar bills to return : " + computeCoin(2000) ); 
           Frame.jTextArea1.append("\n" + "# of 10 dollar bills to return : " + computeCoin(1000) ); 
           Frame.jTextArea1.append("\n" + "# of 5 dollar bills to return : " + computeCoin(500) ); 
           Frame.jTextArea1.append("\n" + "# of 1 dollar bills to return : " + computeCoin(100) ); 
           Frame.jTextArea1.append("\n" + "# of Quarters  to return : " + computeCoin(25) ); 
           Frame.jTextArea1.append("\n" + "# of Dimes to return : " + computeCoin(10) ); 
           Frame.jTextArea1.append("\n" + "# of Nickles return : " + computeCoin(5) ); 
           Frame.jTextArea1.append("\n" + "# of Pennies to return : " + computeCoin(1) ); 
           Frame.jPanel1.setFocusable(true);  
            }
              
        }
        clearOnlyNum();
             }
             if(e.getSource() == Frame.jButton1)
             {
                 Frame.jTextArea1.append("\n"+ "-------------------------------------------------" + "\n" + "Total Price : $ " + Frame.total + "\n");
                 Frame.jTextArea1.append("\n"+ "ENTER AMOUNT OF MONEY TENDERED : (USING KEYBOARD " + "\n");
             }
        } 
     /**
     * Clears the value of all variables 
     */
      public void clearOnlyNum()
   {
        Frame.total = 0;
        Frame.friescount =0;
        Frame.burgercount =0;
        Frame.sodacount=0;
        Frame.tenderedcash =0;
        Frame.changecash =0;
        Frame.hotdogcount=0;
        Frame.chipcount=0;
        Frame.candycount=0;
        //jTextArea1.setText("");
        Frame.temp = 0;
        Frame.a = "";
        Frame.jTextField1.setText(null);
   }
    /**
     * Clears the value of all variables including textarea
     */
      private void clearData()
    {
        Frame.a = "";
        Frame.total = 0;
        Frame.friescount =0;
        Frame.burgercount =0;
        Frame.sodacount=0;
        Frame.tenderedcash =0;
        Frame.changecash =0;
        Frame.hotdogcount=0;
        Frame.chipcount=0;
        Frame.candycount=0;
        Frame.jTextArea1.setText("");
        Frame.temp = 0;
        Frame.jTextField1.setText(null);
        
    }
       /**
      returns # if coins or bills needed  for chage 
      */
       public static int computeCoin(int cointValue) {
         
        int val = amount / cointValue;
        amount -= val * cointValue;
        return val;
    }
}

    

        
