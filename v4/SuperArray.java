//Oliver Zhang
//pd 8
//2013-12-3
//HW 37

public class SuperArray implements ListObj {

    private Object[] _data;  //underlying container structure
    private int _lastPos; //marker for last meaningful value
    private int _size;    //number of meaingful values

    //default constructor
    //initializes 10-item array
    public SuperArray() { 
        _data = new Object[10];
        _lastPos = _data.length;
        _size = _data.length;        
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
        Object[] temp = new Object[ _data.length * 2 ];
        for( int i = 0; i < _data.length; i++ )
            temp[i] = _data[i];
        _data = temp;
	_size = _data.length;
    }

    //accessor method -- return value at specified index
    public Object get( int index ) {
        return _data[index];
    }

    //mutator method -- set index to newVal, return old value at index
    public Object set( int index, Object newVal ) {
        Object temp = _data[index];
        _data[index] = newVal;
        return temp;
    }


    //adds an item after the last item
    public boolean add( Object newVal ) { 
        Object[] temp = new Object[_size + 1];
	for( int i = 0; i < _size; i++) {
	    temp[i] = _data[i];
	}
	temp[_size] = newVal;
	_data = temp;
	_size = _data.length;
	return true;
    }


    //inserts an item at index    
    public void add( int index, Object newVal ) { 
        Object[] temp = new Object[_size + 1];
	
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
    public Object remove( int index ) { 
        Object[] temp = new Object[_size - 1];
	Object retObj = _data[index];
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

        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );

        for( int i = 0; i < curtis._data.length; i++ ) {
            curtis.set( i, "doo" );
        }

        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);

        for( int i = 0; i < 3; i++ ) {
            curtis.expand();
            System.out.println("Printing expanded SuperArray curtis...");
            System.out.println(curtis);
            System.out.println("new length of underlying array: " 
                               + curtis._data.length );
        }

        
        SuperArray mayfield = new SuperArray();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield);
	
        mayfield.add("herro");
	
        mayfield.add("whut");
        mayfield.add("yup");
        mayfield.add("yuck");
        mayfield.add("taylor");

        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield);
	
        mayfield.remove(10);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
	System.out.println(mayfield.size());
	
	
        mayfield.add(3,new Binary(19));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(2,new Rational(23, 5));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(1,new Hexdecimal(144));
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        
    }//end main()

}//end class SuperArray
