//Oliver Zhang
//pd 8
//2013-12-2
//HW 36

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
        
	int[] b = new int[_size * 2];
	for (int i = 0; i < _size; i++) {
	    b[i] = this._data[i];
	}
	this._data = b;
	
    }


    //accessor method -- return value at specified index
    public int get( int index ) {
         
        return _data[index];
    }


    //mutator method -- set index to newVal, return old value at index
    public int set( int index, int newVal ) {
	int oldVal = _data[index];
        _data[index] = newVal;
        return oldVal; 
    }

    public static void grow(SuperArray a, int size) {
	int length = a._data.length + size;
	int[] b = new int[length];
	for (int i = 0; i < a._data.length; i++) {
	    b[i] = a._data[i];
	}
	a._data = b;
	System.out.println(a._data);
    }

    //main method for testing
    public static void main( String[] args ) {
	SuperArray arr = new SuperArray();
	arr.expand();
	
	System.out.println(arr);
	
       
        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );

        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, i * 2 );
            curtis._size++;
        }

        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
	 /*===========================================
        ===========================================*/

    }



}//end class SuperArray
