//Oliver Zhang
//pd 8
//2013-11-29
//HW 35
/*In most cases when the int is inside the array, the BinSearch is faster by an interval of  0.003 - 0.008 seconds, if it's not in the array, the BinSearch is faster by and average 0.009.*/


public class SearchTrials {
	public static int binSearch ( int[] a, int target ) {
	
	return binSearchIter( a, target, 0, a.length-1);
	// return binSearchRec( a, target, 0, a.length-1 );
    	}

	public static int binSearchIter( int[] a, int target, int lo, int hi ) {
        int guess = ((hi - lo) / 2) + lo;
	if (!isSorted(a)) {
	    System.out.println("The array is not sorted, BEGONE");
	}
	
	while (a[guess] != target) {
	    if (lo == hi || (hi - lo == 1)) {
		return -1;
	    }
	    guess = ((hi - lo) / 2) + lo;
	    //System.out.println("My next guess is:\n" + hi + "\n" + lo + "\n" + guess);
	    if (a[guess] > target) 
		hi = guess;
	    else if (a[guess] < target)
		lo = guess;
	 
	    
	}
	
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

	public static int linSearch( int[] a, int target ) {

        int tPos = -1;
        int i = 0;

        while ( i < a.length ) {

            if ( a[i] == target ) {
                tPos = i;
                break;
            }
            i++;
        }

        return tPos;
    }

	public static void main(String[] args) {
		long BinSearchtim = 0;
		long LinSearchtim = 0;
		int[] iArr3 = new int[20000000];
		int rand = (int)(Math.random() * 20000000);
		for (int x = 0; x < iArr3.length;x++) {
		    iArr3[x] = x+1;
		}
		long start = System.currentTimeMillis();
		binSearch(iArr3, rand);
		BinSearchtim = System.nanoTime() - start;
		
		

		start = System.currentTimeMillis();
		linSearch(iArr3, rand);
		LinSearchtim = System.nanoTime() - start;	
		
		

		System.out.println("\nThe BinSearch is faster by " + (LinSearchtim - BinSearchtim) + " nanoseconds.\n");

		start = System.currentTimeMillis();
		binSearch(iArr3, -1);
		BinSearchtim = System.nanoTime() - start;
		
				
		
		start = System.currentTimeMillis();
		linSearch(iArr3, -1);
		LinSearchtim = System.nanoTime() - start;
		
		

		System.out.println("\nThe BinSearch is faster by " + (LinSearchtim - BinSearchtim) + " nanoseconds.\n");
	}
}
