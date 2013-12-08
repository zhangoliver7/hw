//Oliver Zhang
//pd. 8
//2013-12-8
//HW 39

public class SuperArray<T> implements List<T> {

    private T[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values


    //default constructor
    //initializes 10-item array
    public SuperArray() { 
        _data = (T[])new Object[10]; //typecast into array of T's
        _lastPos = 0;
        _size = 0;        
    }


    //output array in [a,b,c] format
    //eg, for int[] a = {1,2,3} ...
    //toString() -> "[1,2,3]"
    public String toString() { 
        String foo = "[";
        for( int i = 0; i < _size; i++ ) {
            foo += _data[i] + ",";
        }
	if ( foo.length() > 1 )
            //shave off trailing comma
            foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
        return foo;
    }

    //double capacity of this instance of SuperArray 
    private void expand() { 
        T[] temp = (T[])new Object[ _data.length * 2 ];
        for( int i = 0; i < _data.length; i++ )
            temp[i] = _data[i];
        _data = temp;
	_size = _data.length;
    }

    //accessor method -- return value at specified index
    public T get( int index ) {
        return _data[index];
    }

    //mutator method -- set index to newVal, return old value at index
    public T set( int index, T newVal ) {
        T temp = _data[index];
        _data[index] = newVal;
        return temp;
    }


    //adds an item after the last item
    public boolean add( T newVal ) { 
        T[] temp = (T[])new Object[_size + 1];
	for( int i = 0; i < _size; i++) {
	    temp[i] = _data[i];
	}
	temp[_size] = newVal;
	_data = temp;
	_size = _data.length;
	return true;
    }


    //inserts an item at index    
    public void add( int index, T newVal ) { 
        T[] temp = (T[])new Object[_size + 1];
	
	for( int i = 0; i < _size + 1; i ++) {
	    if (i == index)
		temp[i] = newVal;
	    else if (i > index) 
		temp[i] = _data[i - 1];
	    else if (i < index)
		temp[i] = _data[i];
	    
	    
	}
	_data = temp;
	_size = _data.length;
	 
    }

     private static void printArray( Object[] arr ) {
        String output = "[ "; 

        for( Object i : arr )
            output += i + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        System.out.println( output + "\n");
    }

    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public T remove( int index ) { 
        T[] temp = (T[])new Object[_size - 1];
	T retObj = _data[index];
	for( int i = 0; i < _size - 1; i ++) {
	    if (i >= index) 
		temp[i] = _data[i + 1];
	     if (i < index)
		temp[i] = _data[i];
	}
	_data = temp;
	_size = _data.length;
	return retObj;
    }


    //return number of meaningful items in _data
    public int size() {
        int ret = 0;
	
        return _size; //placeholder
    }


    public static void main( String[] args ) {
	/*
	SuperArray<Integer> curtis = new SuperArray<Integer>();
	int o = curtis._size;
	System.out.println(o);
        
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );
	
	int i = 0;
	
        while(i < o) {
            curtis.set( i, new Integer(i * 3) );
	    i++;
        }

        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
	
        for( int a = 0; a < 3; a++ ) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis);
            System.out.println("new length of underlying array: " 
                               + curtis._size );
        }

        SuperArray<Integer> mayfield = new SuperArray<Integer>();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield);

        mayfield.add(5);
        mayfield.add(4);
        mayfield.add(3);
        mayfield.add(2);
        mayfield.add(1);

        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield);

        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);

        mayfield.add(3,99);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(2,88);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(1,77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);*/


	SuperArray<Comparable> oliver = new SuperArray<Comparable>();
	oliver.expand();
	oliver.add(3,new Rational(5,7));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(oliver);
        oliver.add(2,new Binary (77));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(oliver);
        oliver.add(1,new Hexdecimal(444445555));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(oliver);
        /*===========================================
        ===========================================*/
    }//end main()

}//end class SuperArray
