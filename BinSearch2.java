//Oliver Zhang
//pd 8
//2013-11-29
//HW 34
public class BinSearch2 {

    private static int _guessCtr;
    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( Comparable[] a, Comparable target ) {
	
	return binSearchIter( a, target, 0, a.length-1);
	// return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchIter( Comparable[] a, Comparable target, int lo, int hi ) {
        int guess = ((hi - lo) / 2) + lo;
	if (!isSorted(a)) {
	    System.out.println("The array is not sorted, BEGONE");
	}
	_guessCtr += 1;
	while (!a[guess].equals(target)) {
	    if (lo == hi || (hi - lo == 1)) {
		return -1;
	    }
	    guess = ((hi - lo) / 2) + lo;
	    //System.out.println("My next guess is:\n" + hi + "\n" + lo + "\n" + guess);
	    if (a[guess].compareTo(target) > 0) 
		hi = guess;
	    else if (a[guess].compareTo(target) < 0)
		lo = guess;
	    _guessCtr += 1;

	    
	}
	System.out.println("It took " + _guessCtr + " guesses.");
        return guess; //placeholder
    }



    private static boolean isSorted( Comparable[] arr ) {
        for ( int x = 0; x < arr.length - 1; x++ ){
	    if ( arr[x].compareTo( arr[x + 1]) > 0){
		return false;
	    }
	}
        return true;
    }

    

    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( Object[] arr ) {
        String output = "[ "; 

        for( Object o : arr )
            output += o + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {
	Binary[] bArr = new Binary[10];
	Hexdecimal[] hArr = new Hexdecimal[10];
	Rational[] rArr	= new Rational[10];
	String[] sArr = {"apple", "banana", "orange", "peach", "zucchini"};

        for( int i = 0; i < bArr.length; i++ ) {
            bArr[i] = new Binary( i );
        }
	
	for( int i = 0; i < hArr.length; i++ ) {
            hArr[i] = new Hexdecimal( i );
        }

	for( int i = 0; i < rArr.length; i++ ) {
            rArr[i] = new Rational( i+1, i+2 );
        }
	Binary tree = new Binary(3);
	Hexdecimal phor = new Hexdecimal(4);
	Rational foo = new Rational(4,5);
	printArray(hArr);
	printArray(rArr);
	
	System.out.println(binSearch(bArr,tree));
	System.out.println(binSearch(hArr, phor));
	System.out.println(binSearch(rArr, foo));
	System.out.println(binSearch(sArr, "banana"));
    }//end main()

}//end class BinSearch
