//Oliver Zhang
//pd 8
//2013-12-18
//HW 45

import java.util.ArrayList;

public class BubbleSort {

    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>(size);
	
	
	for (int x = 0; x < size; x++) {
		int num = (int)(Math.random() * (hi - lo)) + lo;
		retAL.add(num);
		
	}
       
        return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
        int a = 3;
	int size = al.size();
	while ( a > 0) {
		for (int i = 0; i < size; i ++) {
			int rand = (int)(Math.random() * size);
			Object holder = new Object();
			Object holder2 = new Object(); 
			holder = al.get(rand);	
			holder2 = al.get(i);	
			al.set(i,holder);
			al.set(rand,holder2);	
		}
		a--;
	}

    }


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> a ) {

        int x = 0;
        int swapcounter = 0;
        while (x < a.size() - 1) {
            for (int i = 0; i < a.size() - 1; i++) {
                if (a.get(i).compareTo(a.get(i + 1)) > 0) {
                    Comparable holder = a.get(i);
                    a.set(i, a.get(i + 1));
                    a.set(i + 1, holder);
                    swapcounter++;
                }
            }
            x++;
            if (swapcounter == 0) 
                break;
        }

    }//end bubbleSortV -- O(?)


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> a ) {
        int x = 0;
        int swapcounter = 0;
        ArrayList<Comparable> retList = new ArrayList<Comparable>(a.size());
        
        for (int i = 0; i < a.size(); i++) {
            retList.add(a.get(i));
        }
        
        while (x < retList.size() - 1) {
            for (int i = 0; i < a.size() - 1; i++) {
                if (retList.get(i).compareTo(retList.get(i + 1)) > 0) {
                    Comparable holder = retList.get(i);
                    retList.set(i, retList.get(i + 1));
                    retList.set(i + 1, holder);
                    swapcounter++;
                }
            }
            x++;
	    
            if (swapcounter == 0) 
                break;
        }
	
	System.out.println(retList);
	System.out.println(a);
        return retList;
    }//end bubbleSort -- O(?)


    public static void main(String [] args){
	/*===============for VOID methods=============
        
        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        bubbleSort(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );
	
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        bubbleSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );
	
          ============================================*/

        /*==========for AL-returning methods==========
            ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        ArrayList glenSorted = bubbleSort( glen );
        System.out.println( "sorted version of ArrayList glen:\n" 
                            + glenSorted );
        System.out.println( "ArrayList glen after sorting:\n" + glen );
	============================================*/
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        ArrayList cocoSorted = bubbleSort( coco );
        System.out.println( "sorted version of ArrayList coco:\n" 
                            + cocoSorted );
        System.out.println( "ArrayList coco after sorting:\n" + coco );
	shuffle(coco);
        System.out.println( coco );
	
	
          

    }//end main

}//end class BubbleSort
