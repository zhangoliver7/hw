//Oliver Zhang
//pd 8
//2013-12-8
//HW 39


public interface List<T> {

    // Return number of meaningful elements in the list
    int size();

    // Append an element of type T to the end
    boolean add( T obj ); 

    // Insert an Object of type T at index
    void add( int index, T obj ); 

    // Retrieve the element at index
    T get( int index );

    // Overwrite the element at index
    T set( int index, T obj );

    // Remove the element at index,
    // shifting any elements after it to the left
    T remove( int index );

}//end interface
