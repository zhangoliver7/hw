//Oliver Zhang
//2014-1-8
//pd 8
//HW 49
import java.util.ArrayList;
public class Matrix {

    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] _matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() {
	_matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE]; 
    } //O(n)


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	_matrix = new Object[a][a];
    } //O(n)


    //return size of this matrix, where size is 1 dimension
    private int size() {
	int retInt = 0;
	for (int i = 0; i < _matrix.length; i++) {
		for (int j = 0; j < _matrix[i].length; j++) {
			retInt++;
		}
	}
	return retInt;
    } //O(n^2)


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
	Object foo = _matrix[r][c];
	return foo;
	
    }


    //return true if this location is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
	if (_matrix[r][c] == null)
		return true;
	else 
		return false;
    } //O(1)


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object too = new Object();
	too = _matrix[r][c];
	_matrix[r][c] = newVal;
	return too;
    } //O(1)


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
	String retStr = "";
	for (int i = 0; i < _matrix.length; i++) {
		retStr += "[";
		for (int j = 0; j < _matrix[i].length; j++) {
			retStr += _matrix[i][j];
			retStr += ", ";
		}
		retStr += "]\n";
	}
	
	return retStr;
    } //O(n^2)


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	if (!(rightSide instanceof Matrix)) 
		return false;
	else 
		if (((Matrix)rightSide).size() != this.size())
			return false;
		else {
			for (int i = 0; i < _matrix.length; i++) {
				
				for (int j = 0; j < _matrix[i].length; j++) {	
					if (!this.get(i,j).equals(((Matrix)rightSide).get(i,j)))
						return false;
					
				}
			}
			return true;
		}
	
    } //O(n^2)


    //return true if target is in this matrix; false otherwise
    public boolean isFound( Object target ) {
	for (int i = 0; i < _matrix.length; i++) {
		for (int j = 0; j < _matrix[i].length; j++) {
			if (_matrix[i][j].equals(target))
				return true;	
		}
	}
	return false;
	
    } //O(n^2)


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) {
	ArrayList uno = new ArrayList(this.size());
	
	for (int i = 0; i < _matrix.length; i++) {
		uno.add(this.get(i,c1));
		//dos.add(this.get(i,c2));
		this.set(i,c1,(this.get(i,c2)));
		this.set(i,c2,uno.get(i));
	}
	
	System.out.println(uno);
	
    } //O(n)


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	ArrayList uno = new ArrayList(this.size());
	
	for (int i = 0; i < _matrix.length; i++) {
		uno.add(this.get(r1,i));
		//dos.add(this.get(i,c2));
		this.set(r1,i,(this.get(r2,i)));
		this.set(r2,i,uno.get(i));
	}
	
	

    } //O(n)


    //main method for testing
    public static void main( String[] args ) {
	Matrix oliver = new Matrix(5);
	//System.out.println(oliver.isEmpty(1,1));
	for (int i = 0; i < oliver._matrix.length; i++) {
		for (int j = 0; j < oliver._matrix[i].length; j++) 
			oliver._matrix[i][j] = (int)(Math.random() * 100);		

	}
	/*System.out.println(oliver);
	System.out.println(oliver.size());
	System.out.println(oliver.get(1,1));
	System.out.println(oliver.isEmpty(1,1));
	System.out.println(oliver.set(1,1,89));
	System.out.println(oliver);*/
	Matrix coo = new Matrix(5);
	
	for (int i = 0; i < coo._matrix.length; i++) {
		for (int j = 0; j < coo._matrix[i].length; j++) 
			coo._matrix[i][j] = oliver._matrix[i][j];	
	}
	//System.out.println(oliver.equals(coo));	
	//System.out.println(oliver);
	//System.out.println(oliver.get(1,3));
	//oliver.swapColumns(1,2);
	/*System.out.println(oliver);
	oliver.swapRows(1,2);
	System.out.println(oliver);*/
	System.out.println(oliver.isFound(1));
	System.out.println(oliver.isFound(oliver.get(1,1)));
    }

}//end class Matrix


