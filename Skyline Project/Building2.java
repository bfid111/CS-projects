package nightskyline;




import java.util.Random; //imports Random util
public class Building2 {
private int number; // current value showing
public Building2 ()
{
number = 1; //instantiates number with value of 1
}


public int a () //new method with number gen from 38 to 87
{
Random generator = new Random();
number = generator.nextInt(50) + 38;  
return number;

}
public int b () //new method with number gen from 200 to 274
{
Random generator = new Random();
number = generator.nextInt(75) + 200;  
return number;

}
public int c () //new method with number gen from 1 to 500
{
Random generator = new Random();
number = generator.nextInt(500) + 1; 
return number;

}
public int d () //new method with number gen from 25 to 74
{
Random generator = new Random();
number = generator.nextInt(50) + 25;  
return number;

}
public int e () //new method with number gen from 1 to 37
{
Random generator = new Random();
number = generator.nextInt(37) + 1; 
return number;

}
public int f () //new method with number gen from 1 to 100
{
Random generator = new Random();
number = generator.nextInt(100) + 1;  
return number;

}

public String toString() //outputing gen values to a string to be printed
{
String result = Integer.toString(number);
return result; }
}