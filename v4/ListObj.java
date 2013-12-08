/*==================================================
  interface ListInt
  Declares methods that will be implemented by any 
  class wishing to adhere to this specification.
  This interface specifies behaviors of a list of ints.
  ==================================================*/

public interface ListObj {

    // Return number of meaningful elements in the list
    int size();

    // Append an int to the end. Return true.
    boolean add( Object obj ); 

    // Insert an int at index
    void add( int index, Object obj ); 

    // Retrieve the int at index
    Object get( int index );

    // Overwrite the int at index
    Object set( int index, Object num );

    // Remove the int at index,
    // shifting any elements after it to the left.
    // Return removed value.
    Object remove( int index );

}//end interface ListInt
