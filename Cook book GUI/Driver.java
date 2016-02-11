package cookbook;
import cookbook.Book;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author Youngmin
 */
public class Driver {
     Path filepath = Paths.get(files);
     public static String extension = "";
     public static Boolean writeFile(String oFileName, String data,Boolean Success) 
     {     
          if(Book.jRadioButton1.isSelected() ||Book.jRadioButton2.isSelected() || Book.jRadioButton3.isSelected() || Book.jRadioButton4.isSelected() || Book.jRadioButton5.isSelected() || Book.jRadioButton6.isSelected() || Book.jRadioButton7.isSelected() || Book.jRadioButton8.isSelected() || Book.jRadioButton9.isSelected() || Book.jRadioButton10.isSelected() )
          { // if any of the menu is selected, 
              try 
             { 
                 File file = new File(oFileName + extension); // file name format ex) salad + extension 
              //  BufferedWriter out = new BufferedWriter(new FileWriter(oFileName + ".doc")); 
                 if (!file.exists()) { // if there is no file with the same name in the directory 
				file.createNewFile();      
			}
                 FileWriter fstream = new FileWriter(file.getAbsoluteFile()); // create file
                 BufferedWriter out = new BufferedWriter(fstream);
             //   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           //     Date date = new Date();   // date format not needed in this project 
            //    out.write(dateFormat.format(date) ); // inputs the date and time when the encrypted text goes in to the txt file
           //     out.newLine();              
                out.write(data);                     
                out.close(); 
                Success = true; // returns success value to see if the program succesfully saved the recipe 
             } catch (IOException e) { 
                 Success = false; // if error occurs return FALSE 
             }  
          }
          else  // if the user does not select a category. you cannot save since you dont know what kind of food it is therefore, sends error mesage
          {
              JOptionPane.showMessageDialog(null, "Please Select a Category"); 
              Success = false; // returns failed to save sign     
          }
                 return Success;        
             }
     public static String returnText()
     {
         String recipe = Book.jTextArea1.getText(); // return the text that is in the jTextarea 
         return recipe;
     }
     public static String returnFileName()
     {
         String fileName = Book.jTextField1.getText(); // get the file name from the text field box 
         return fileName;
     }
 //    public void ListFiles()
  //   {
    //    File a1 = new File("Desktop");
  //      String[] list = a1.list();
        
//     }
     public static void ReadFiles() // experiment purpose method, is not used in the acutal program
     {
         Book b = new Book();
         DefaultListModel listmodel = new DefaultListModel();
         
         String files;
         
         File folder = new File("C:\\");
         File[] list = folder.listFiles();
         
         for(int a =0; a < list.length; a++)
         {
             if(list[a].isFile())
             {
                 files=list[a].getName();
                 listmodel.addElement(list[a].getName());
                // System.out.println(files);        
                 }        
            //     listmodel.addElement(list[a]);
               //  JList list1 = new JList(listmodel);
              //   b.jScrollPane3.add(list1);
             }
         }
       public String ReadFile(String oFileName, String a) 
     {
         String data = ""; 
         try
         {
             BufferedReader in = new BufferedReader( new FileReader(oFileName));
             String line = null;
             while ((line = in.readLine()) != null)  // read text from file 
             {
                data += line;     
             }
             in.close(); 

             } catch (IOException e) {} 
            a = data;
             return a; // return the text 
     }
    public static DefaultListModel listmodel1 = new DefaultListModel();
    String aa = new String();
    // Button Selection 
    Book c = new Book();
    public static String files;
          
    public static void LoadList()
{
        // String location = "C:\\Users\\Youngmin\\Documents\\NetBeansProjects\\CookBook";
         Book.jList2.clearSelection();
         if(Book.jRadioButton1.isSelected()||Book.jRadioButton2.isSelected()||Book.jRadioButton3.isSelected()||Book.jRadioButton4.isSelected()||Book.jRadioButton5.isSelected()||Book.jRadioButton6.isSelected()||Book.jRadioButton7.isSelected()||Book.jRadioButton8.isSelected()||Book.jRadioButton9.isSelected()||Book.jRadioButton10.isSelected())
         {
             // if any of the categories is clicked
         listmodel1.clear(); // first clears the list to loda the list
         File folder = new File("."); // set the directory to where the JAR file is located  
         File[] list = folder.listFiles(); // FIle array list 
         for(int a =0; a < list.length; a++) // scans all the files in the folder or directory 
         {
             if(list[a].isFile() && list[a].getName().contains(extension)) // if it is a file and has the extension name
             {
                files =list[a].getName(); // path 
                listmodel1.addElement(list[a].getName()); // adds the name to the Jlist1  
                // System.out.println(files);
                 }    
             }
         }   
}    
    public static void ClearList()
    {
        listmodel1.clear(); //clears list 
        Book.buttonGroup1.clearSelection(); // clear buttongroup slectoin 
        LoadList();
    }
    public static void RefreshList() // experiment purpose method, is not used in the acutal program
    {
        listmodel1.clear();

    }
    public static void LoadFile() throws IOException 
    {
     String data = "";
         try
         {
             BufferedReader in = new BufferedReader( new FileReader(Book.jList2.getSelectedValue().toString())); // selected recipe  name -> string 
             String line = null;
             while ((line = in.readLine()) != null)  // read text from file 
             {
                data += line+"\n";   
             }
             in.close();   
             } catch (IOException e) {} 
            
             System.out.println(data);
             Book.jTextArea1.setText(""); // clears the text area
             Book.jTextArea1.append(data); // add the recipe to text area
    }

}
   

    
    
    
    
    

    
