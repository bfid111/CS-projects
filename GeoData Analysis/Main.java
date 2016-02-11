
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
public class Main {
    public static void main(String[] args)
    {
        Path path = Paths.get( "test.txt" );  // Path for Mac OS X.
try {
    List<GeoReading> list = new ArrayList<>();
    Stream<String> lines = Files.lines( path );
    lines.forEach( line -> list.add( new GeoReading( line ) ) );
    // Take those 14 lines and multiply to simulate large text file. 14 * 3,000 = 42,000.
    int count = 1;
    List<GeoReading> bigList = new ArrayList<>( list.size() * count ); // Initialze capacite to expected number of elements.
    for ( int i = 0 ; i < count ; i++ ) {
        bigList.addAll( list );
    }
    long start = System.nanoTime();
    Collections.sort( bigList , new GeoReadingAscendingComparator() );
    long elapsed = ( System.nanoTime() - start );
    System.out.println( "Done sorting the list. Sorting " + bigList.size() + " took: " + TimeUnit.MILLISECONDS.convert( elapsed , TimeUnit.NANOSECONDS ) + " ms ( " + elapsed + " nanos )." );

    System.out.println( "Dump��" );

    for(int b =0; b < bigList.size();b++)
    {
        System.out.println(b +  " : " +  bigList.get(b) );
    }
   
         binarySearch(bigList,0, bigList.size(), 34.2);
         LinearSearch(bigList,34.2);
} catch ( IOException ex ) {
    System.out.println( "ERROR - ex: " + ex );
}
    }
   public static void binarySearch(List<GeoReading> array, int lowerbound, int upperbound, Double key)
   {
       int position;
       int comparisonCount = 1;    // counting the number of comparisons (optional)

     // To start, find the subscript of the middle position.
     position = ( lowerbound + upperbound) / 2;
     long start = System.nanoTime();
     while((Double.parseDouble(array.get(position).latitude.toString()) != key && (lowerbound <= upperbound)))
     {
         comparisonCount++;
         if (Double.parseDouble(array.get(position).latitude.toString()) > key)       // If the number is > key, ..
         {                                              // decrease position by one. 
              upperbound = position - 1;   
         }                                                             
              else                                                   
        {                                                        
              lowerbound = position + 1;    // Else, increase position by one. 
        }
       position = (lowerbound + upperbound) / 2;
     }
     if (lowerbound <= upperbound)
     {
           long elapsed = ( System.nanoTime() - start );
           System.out.println("The number was found in array subscript : " + position);
           System.out.println("The binary search found the number after " + comparisonCount +
                 "comparisons.");
            System.out.println( "Done searching  the list by Binary Search. Sorting "  + " took: " + TimeUnit.MILLISECONDS.convert( elapsed , TimeUnit.NANOSECONDS ) + " ms ( " + elapsed + " nanos )." );
           // printing the number of comparisons is optional
     }
     else
          System.out.println("Sorry, the number is not in this array.  The binary search made "
                 +comparisonCount  + " comparisons.");
  }
   public static void LinearSearch(List<GeoReading> array, Double key){
        long start = System.nanoTime();
       for ( int a =0; a < array.size(); a++)
       {
           if((Double.parseDouble(array.get(a).latitude.toString())) ==  key)
           {
                long elapsed = ( System.nanoTime() - start );
                  System.out.println("The number was found in array subscript : " + a);
                   System.out.println("The Linear search found the number after " + a +
                 " comparisons.");
                       System.out.println( "Done searching  the list by Linear Search. Sorting "  + " took: " + TimeUnit.MILLISECONDS.convert( elapsed , TimeUnit.NANOSECONDS ) + " ms ( " + elapsed + " nanos )." );
           // printing the number of comparisons is optional
           }
       }
   }

}

       

