/*==================================================
  class SuperArray
  Wrapper class for array. Facilitates resizing, 
  getting and setting element values.
  ==================================================*/

public class SuperArray {

    private int[] _data;
    private int _lastPos;
    private int _size;


    //default constructor
    //initializes 10-item array
    public SuperArray() { 
        _data = new int[10];
	_size = _data.length;
	_lastPos = _data[_size - 1]; 
    }


    //output array in [a,b,c] format
    //eg, for int[] a = {1,2,3} ...
    //toString() -> "[1,2,3]"
    public String toString() { 
        String output = "[ "; 

        for( int o : _data )
            output += o + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        
        
        return output; //placeholder
    }


    //double capacity of this instance of SuperArray 
    private void expand() { 
        // *** YOUR IMPLEMENTATION HERE *** 
    }


    //accessor method -- return value at specified index
    public int get( int index ) {
        // *** YOUR IMPLEMENTATION HERE *** 
        return _data[index];
    }


    //mutator method -- set index to newVal, return old value at index
    public int set( int index, int newVal ) {
        // *** YOUR IMPLEMENTATION HERE *** 
        return -1; 
    }

    public static void grow(int[] a, int size) {
	int length = a.length + size;
	int[] b = new int[length];
	for (int i = 0; i < a.length; i++) {
	    b[i] = a[i];
	}
	a = b;
    }

    //main method for testing
    public static void main( String[] args ) {
	int[] x = {1,2,3,4,5,6};
	grow(x,8);
	System.out.println(x);
        /*===========================================
        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );

        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, i * 2 );
            curtis._size++;
        }

        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
        ===========================================*/

    }



}//end class SuperArray