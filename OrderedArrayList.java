//Oliver Zhang
//pd 8
//2013-9-13
//HW 40
/*============================================
   class OrderedArrayList
   Wrapper class for ArrayList.
   Imposes the restriction that stored items 
   must remain sorted in ascending order
   ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList(10);
    }


    public String toString() { 
        String foo = "[";
	int _size = _data.size();
        for( int i = 0; i < _size; i++ ) {
            foo += _data.get(i) + ",";
        }
	if ( foo.length() > 1 )
            //shave off trailing comma
            foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
        return foo;
        
    }


    public Comparable remove( int index ) { 
        ArrayList<Comparable> temp = new ArrayList[_data.size() - 1];
	Comparable retComp = _data.get(index);
	for( int i = 0; i < _data.size() - 1; i ++) {
	    if (i >= index) 
		temp[i] = _data.get(i + 1);
	    if (i < index)
		temp[i] = _data.get(i);
	}
	_data = temp;
	
	return retComp;// *** YOUR IMPLEMENTATION HERE ***
        
	
    }


    public int size() { 
        return _data.size(); 
    }

    
    public Comparable get( int index ) { 
        // *** YOUR IMPLEMENTATION HERE ***
        return 0; //placeholder  
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear(Comparable newVal) { 
        // *** YOUR IMPLEMENTATION HERE ***
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary(Comparable newVal) { 
        // *** YOUR IMPLEMENTATION HERE ***
    }        


    // main method solely for testing purposes
    public static void main( String[] args ) {

        /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        OrderedArrayList Franz = new OrderedArrayList();

        // testing linear search
        for( int i = 0; i < 15; i++ )
            Franz.addLinear( (int)( 50 * Math.random() ) );
        System.out.println( Franz );

        // testing binary search
        Franz = new OrderedArrayList();
        for( int i = 0; i < 15; i++ ) 
            Franz.addBinary( (int)( 50 * Math.random() ) );
        System.out.println( Franz );
           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList