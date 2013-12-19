//Oliver Zhang
//pd 8
//2013-12-19
//HW 46

import java.util.ArrayList;

public class SelectionSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while( size > 0 ) {
            //     offset + rand int on interval [lo,hi]
            retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
            size--;
        }
        return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
        int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) {
	int smallInd = 0;
	Comparable tiny = data.get(smallInd);
	int x = 0;
	while (x < data.size() - 1) {
	    for (int i = smallInd; i < data.size(); i++) {
		if (data.get(i).compareTo(tiny) < 0) { 
		    tiny = data.get(i);
		    data.set(i,data.get(smallInd));
		    data.set(smallInd, tiny);	
		}
	    }
	    x++;
	    smallInd++;
	    tiny = data.get(smallInd);
	
	}
    }//end selectionSortV -- O(n)


    // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	for (int i = 0; i < input.size(); i++) {
	    foo.add(input.get(i));
	}
	selectionSortV(foo);
	return foo;
    }//end selectionSort, O(n)


    public static void main( String [] args ) {

        /*===============for VOID methods=============
        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        selectionSortV(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );
	
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        selectionSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );
	
          ============================================*/

        
            ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        ArrayList glenSorted = selectionSort( glen );
        System.out.println( "sorted version of ArrayList glen:\n" 
                            + glenSorted );
        System.out.println( "ArrayList glen after sorting:\n" + glen );

              ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        ArrayList cocoSorted = selectionSort( coco );
        System.out.println( "sorted version of ArrayList coco:\n" 
                            + cocoSorted );
        System.out.println( "ArrayList coco after sorting:\n" + coco );
        System.out.println( coco );
	/*==========for AL-returning methods==========
          ============================================*/

    }//end main

}//end class SelectionSort