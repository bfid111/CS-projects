import java.util.Scanner;
public class fibonacci 
{       
    /*
    array declaration and time variables
    */
    static long[] array = new long[100+1]; //array declaration set maximum size to 100;
	public static void main(String[] args) 
	{
        int i = 0;
        while ( i == 0){     
		Scanner sc = new Scanner(System.in);
		int n;   //long type variable used and can only go to 20, 21 produces an error
        long n2;// long type variable used for original fibonacci recursive implementation
        System.out.println("NOTE! THE 30 th SEQUENCE VALUE IS ALREADY INSIDE THE ARRAY FOR COMPARING RUN TIME");
		System.out.println("Which fibonacci term: " );
		n = sc.nextInt();
		n2 = n; // set n2 to n to calculate same n th sequence;
        array[30] =  832040; // set the 30th sequence just to compare the time consumption two methods 
        long a1 =  System.currentTimeMillis();  // get time 
        long c1 = System.nanoTime();
		System.out.println(n + "  Answer: " + RecursiveFibonacci(n2)); // original recursive
        long a2 =  System.currentTimeMillis()- a1;
        long c2 = System.nanoTime() - c1;
        System.out.println("Time Took in Milliseconds: " + a2 );
        System.out.println("Time Took in Nanoseconds: " + c2 );
		System.out.println("\n========================================\n");
        long b1 =  System.currentTimeMillis(); 
        long d1 = System.nanoTime();
		System.out.println(n + "  Answer: " + RecursiveFibonacciUsingArray(n));
        long b2 =  System.currentTimeMillis() - b1; 
        long d2 = System.nanoTime()-d1;
        System.out.println("Time Took in Milliseconds: " + b2 );
        System.out.println("Time Took in Nanoseconds: " + d2 );
       }
	}  
        /*
        EXPLANATION OF MY TIMINGS
        Basically, the recursive fibonacci method using arrays to keep track of the values that alrady have been computed is much faster than normal recursive fibonacci sequence
        For example, I set the 30 th sequence value in the array to compare how it takes for the two different recursive methods. The recursive method that uses array 
        took 215509 nanoseconds or 1 milliseconds when the normal recursive method took 9 milliseconds or 9368208 nanoseconds. 
        The recrusive fibonacci method using array is much faster for computing numbers that has been already computed since it just returns the value of n th sequence
        from the array right away , not by doing the calculations all over again. I could not compute sequences that are higher than 100 because it took forever to run. 
        */
	public static long RecursiveFibonacciUsingArray(int n) // changed variable parameter to Integer since arrays are being used 
	{
        long temp; // temporary long variable 
		//base case
		if( n <= 2)
			return 1;
                else if(array[n]!=0) // if the value is already in the array
                    return array[n]; // just return the value stored in array 
		else
		temp =  RecursiveFibonacci(n -1) + RecursiveFibonacci( n - 2); // recursive 
        array[n] = temp; // stores it in the array 
        return temp; // return the nth sequence value 
		
	}
        public static long RecursiveFibonacci(long n)
	{
		//base case
		if( n <= 2)
        {
			return 1;
        }
		else
		{
			return RecursiveFibonacci(n -1) + RecursiveFibonacci( n - 2);
		}
	}
	public static long fibonacci(long n)
	{
		long f1 = 1;
		long f2 = 1;
		long f3 = -999;
		for( int i = 3; i <= n; i++)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
}
