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
	_data = new ArrayList(20);
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
        ArrayList<Comparable> temp = new ArrayList(_data.size() - 1);
	Comparable retComp = _data.get(index);
	for( int i = 0; i < _data.size() - 1; i ++) {
	    if (i >= index) 
		temp.set(i, _data.get(i + 1));
	    if (i < index)
		temp.set(i, _data.get(i));
	}
	_data = temp;
	
	return retComp;// *** YOUR IMPLEMENTATION HERE ***
        
	
    }


    public int size() { 
        return _data.size(); 
    }

    
    public Comparable get( int index ) { 
        
        return _data.get(index); //placeholder  
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear(Comparable newVal) { 
        int i = 0;
	int size1 = _data.size();
	ArrayList<Comparable> temp = new ArrayList(size1 + 1);
	temp.addAll(_data);
	int size = temp.size();
	if (_data.isEmpty()) 
            temp.add(newVal);
	    
	else if (_data.get(0).compareTo(newVal) >= 0) 
	    temp.add(0,newVal);
	    
	    
	else if (_data.get(size - 1).compareTo(newVal) <= 0) 
	    temp.add(size,newVal);
	    
	    
	else {
		while (i < size) {
		    if (_data.get(i + 1).compareTo(newVal) >= 0 && _data.get(i).compareTo(newVal) <= 0) {
		    	temp.add(i+1,newVal);
			
			break; }
		    i++;
		    
		    
	     }
	}
	
	_data = temp;
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary(Comparable newVal) { 
        int i = 0;
	int size1 = _data.size();
	ArrayList<Comparable> temp = new ArrayList(size1 + 1);
	temp.addAll(_data);
	int size = temp.size();
	
	if (_data.isEmpty()) 
            temp.add(newVal);
	    
	else if (_data.get(0).compareTo(newVal) >= 0) 
	    temp.add(0,newVal);
	    
	else if (_data.get(size - 1).compareTo(newVal) <= 0) 
	    temp.add(size,newVal);

	else {
	    boolean found = false;
	    
	    int lo = 0;
	    int hi = temp.size() - 1;
	    i = (lo + hi) / 2;
	    while (!found) {
		if (temp.get(i + 1).compareTo(newVal) >= 0 && temp.get(i).compareTo(newVal) <= 0) {
		    	temp.add(i+1,newVal);
			
			found = true; }
		else if (temp.get(i + 1).compareTo(newVal) < 0)
			lo = i + 1;
		else if (temp.get(i).compareTo(newVal) > 0)
			hi = i - 1;
		i = (lo + hi) / 2;
	   	
	    }
	}
	_data = temp;
    }        


    // main method solely for testing purposes
    public static void main( String[] args ) {

        
        OrderedArrayList Franz = new OrderedArrayList();
	/*ArrayList foo = new ArrayList();
	System.out.println( foo );
	for( int i = 0; i < 10; i++ ) 
	    foo.add(i);
	System.out.println( foo );*/
	
        // testing linear search
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for( int i = 0; i < 15; i++ ) {
	    int addition = (int)( 50 * Math.random() );
            Franz.addLinear( addition );
	    
            System.out.println( Franz + " new addition: " + addition);}
	
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
        // testing binary search
        Franz = new OrderedArrayList();
        for( int i = 0; i < 15; i++ ) 
            Franz.addBinary( (int)( 50 * Math.random() ) );
        System.out.println( Franz );
           
    }

}//end class OrderedArrayList
