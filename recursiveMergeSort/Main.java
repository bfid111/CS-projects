/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15yson
 */
public class Main {
    
    public static void main(String[] args) {

            String b[] =
                    
                {"KILO","BRAVO","ALPHA","CHARLIE","ECHO",
                "ALPHA","KILO","ZULU","BRAVO",
                "DELTA","ECHO","FOXTROT",
                "GOLF","DELTA","FOXTROT","KILO"
                }; // array of Names to mergeSort
            RecursiveSorts.mergeSort(b); // performs mergesort
        for (String b1 : b) {
            System.out.println(b1); // prints merge sorted list
        }
	}
}

