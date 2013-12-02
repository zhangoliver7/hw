//Oliver Zhang
//pd 8
//2013-11-26
//HW 33
public class BinSearch {

    private static int _guessCtr;
    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( int[] a, int target ) {
	
	return binSearchIter( a, target, 0, a.length-1);
	//return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchRec( int[] a, int target, int lo, int hi ) {
        int guess = ((hi - lo) / 2 + lo);
	if (!isSorted(a)) {
	    System.out.println("The array is not sorted, BEGONE");
	    return -1;
	}
	else if (a[guess] == target) {
	    return guess;
	}
	else {
	    if (lo >= hi) 
		return -1;
	    else if (a[guess] > target) {
		hi = guess;
		return binSearchRec(a, target, lo, hi);
	    }
	    else  {
		lo = guess;
		return binSearchRec(a, target, lo, hi);
	    }
	    
	}

    }


    public static int binSearchIter( int[] a, int target, int lo, int hi ) {
        int guess = ((hi - lo) / 2) + lo;
	if (!isSorted(a)) {
	    System.out.println("The array is not sorted, BEGONE");
	}
	_guessCtr += 1;
	while (a[guess] != target) {
<<<<<<< HEAD
	    if (lo >= hi) {
=======
	    if (lo == hi || (hi - lo == 1)) {
>>>>>>> 35dc8597c9c6ffc99e2707c631a3a7179161f14f
		return -1;
	    }
	    
	    guess = ((hi - lo) / 2) + lo;
<<<<<<< HEAD
	    //System.out.println("My next guess is:\n" + hi + "\n" + lo + "\n" + guess);
=======
<<<<<<< HEAD
	    System.out.println("My next Gues;\n" + hi + "\n" + lo + "\n" + guess + "\n" + a[guess]);
=======
	    System.out.println("My next guess is:\n" + hi + "\n" + lo + "\n" + guess);
>>>>>>> 35dc8597c9c6ffc99e2707c631a3a7179161f14f
>>>>>>> bd47182f6283d36c7e1df3f5ce283273453887fa
	    if (a[guess] > target) 
		hi = guess;
	    else if (a[guess] < target)
		lo = guess;
	    _guessCtr += 1;

	    
	}
	System.out.println("It took " + _guessCtr + " guesses.");
        return guess; //placeholder
    }



    private static boolean isSorted( int[] arr ) {
        for ( int x = 1; x < arr.length; x++ ){
	    if (arr[x-1] > arr[x]){
		return false;
	    }
	}
        return true;
    }

    /*private static boolean isSorted (Comparable[] arr ) {
	for (int x = 1; x < arr.length; x++) {
	    if (arr[x-1].compareTo(arr[x]) > 0) 
		return false;
	}
	return true;
	}*/


    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( int[] arr ) {
        String output = "[ "; 

        for( int i : arr )
            output += i + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {

        

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing binSearch on int array...");
	int rand = (int)(Math.random() * 100000);
        //Declare and initialize array of ints
        int[] iArr = { 2, 4, 6, 8, 6, 42 };
        printArray( iArr );
        System.out.println( "sorted? -- " + isSorted(iArr) );

        int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
        printArray( iArr2 );
        System.out.println( "sorted? -- " + isSorted(iArr2) );

	int[] iArr3 = new int[100000];
	for (int x = 0; x < iArr3.length;x++) {
	    iArr3[x] = x+1;
	}
<<<<<<< HEAD
	System.out.println(isSorted(iArr3));
	//printArray(iArr3);
	System.out.println( binSearch(iArr3, rand));
	//System.out.println( binSearch(iArr2, 1));
=======
	/*System.out.println(isSorted(iArr3));
	printArray(iArr3);
<<<<<<< HEAD
	System.out.println( binSearch(iArr3, -1));
	


	
=======
	System.out.println( binSearch(iArr3, rand));*/
	System.out.println( binSearch(iArr2, 1));
>>>>>>> bd47182f6283d36c7e1df3f5ce283273453887fa
	/*==================================================
>>>>>>> 35dc8597c9c6ffc99e2707c631a3a7179161f14f
        //search for 6 in array 
        System.out.println( binSearch(iArr2,6) );

        //search for 43 in array 
	//System.out.println( binSearch(iArr2,43) );
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*==================================================
        ==================================================*/

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }//end main()

}//end class BinSearch
