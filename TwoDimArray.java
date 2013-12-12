//Oliver Zhang
//pd 8
//2013-12-10
//HW 41

public class TwoDimArray {
    
    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) {
        String list = "";
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[i].length; c++) {
                
                list += a[i][c];
                list += ",";
                
            }
            list += "\n";
        }
        System.out.println(list);
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) { 
        String retStr = "";
        for (int[] e: a) {
            for (int c: e) {
                retStr += c;
                retStr += ",";
            }
            retStr += "\n";
        }
        System.out.println(retStr);
    }

    //postcond: returns sum of all items in 2D integer array a
    public static int sum1( int[][] a ) { 
        int retInt = 0;
        for (int[] e: a) {
            for (int c:e) {
                retInt += c;
            }
        }
        return retInt;
    }

    //postcond: returns sum of all items in 2D integer array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) { 
        int retInt = 0;
        for (int i = 0; i < m.length; i++) 
            retInt += sumRow(i, m);
        return retInt;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
        int retInt = 0;
        for (int i = 0; i < a[r].length; i++) 
            retInt += a[r][i];
        return retInt;
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){ 
        int retInt = 0;
        for (int i: m[r])
            retInt += i;
        return retInt;
    }


    public static void main(String [] args) {
        
        int [][] m1 = new int[4][2];
        int [][] m2 = { {2,4,6}, {3,5,7} };
        int [][] m3 = { {2}, {4,6}, {1,3,5} };
        print1(m1);
        print1(m2);
        print1(m3);

        print2(m1);
        print2(m2);
        print2(m3);

        System.out.print("testing sum1...\n");
        System.out.println("sum m1 : " + sum1(m1));
        System.out.println("sum m2 : " + sum1(m2));
        System.out.println("sum m3 : " + sum1(m3));
        System.out.print("testing sum2...\n");
        System.out.println("sum m1 : " + sum2(m1));
        System.out.println("sum m2 : " + sum2(m2));
        System.out.println("sum m3 : " + sum2(m3));
        /*
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray<<<<<<< HEAD
// skeleton file for 
// class TwoDimArray
// ...practice working with 2D arrays

=======
//Oliver Zhang
//pd 8
//2013-12-10
//HW 41
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455

public class TwoDimArray {
    
    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) {
	String list = "";
        for (int i = 0; i < a.length; i++) {
	    for (int c = 0; c < a[i].length; c++) {
		
		list += a[i][c];
		list += ",";
		
	    }
	    list += "\n";
	}
	System.out.println(list);
    }

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a ) { 
	String retStr = "";
<<<<<<< HEAD
        for (int i = 0: i < a.length) {
	    for (int c = 0; c < a[i].length) {
		retStr += a[i][c];
	    }
=======
        for (int[] e: a) {
	    for (int c: e) {
		retStr += c;
		retStr += ",";
	    }
	    retStr += "\n";
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
	}
	System.out.println(retStr);
    }

    //postcond: returns sum of all items in 2D integer array a
    public static int sum1( int[][] a ) { 
<<<<<<< HEAD
        return 1;// *** YOUR IMPLEMENTATION HERE ***
=======
        int retInt = 0;
	for (int[] e: a) {
	    for (int c:e) {
		retInt += c;
	    }
	}
	return retInt;
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
    }

    //postcond: returns sum of all items in 2D integer array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m ) { 
<<<<<<< HEAD
        return 1;// *** YOUR IMPLEMENTATION HERE ***
=======
	int retInt = 0;
	for (int i = 0; i < m.length; i++) 
	    retInt += sumRow(i, m);
        return retInt;
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) { 
<<<<<<< HEAD
        return 1;// *** YOUR IMPLEMENTATION HERE ***
=======
	int retInt = 0;
	for (int i = 0; i < a[r].length; i++) 
	    retInt += a[r][i];
        return retInt;
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
    }

    //postcond: returns sum of all items on row r of 2D integer array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m){ 
<<<<<<< HEAD
        return 1;// *** YOUR IMPLEMENTATION HERE ***
=======
	int retInt = 0;
	for (int i: m[r])
	    retInt += i;
        return retInt;
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
    }


    public static void main(String [] args) {
        
        int [][] m1 = new int[4][2];
        int [][] m2 = { {2,4,6}, {3,5,7} };
        int [][] m3 = { {2}, {4,6}, {1,3,5} };
        print1(m1);
        print1(m2);
        print1(m3);

        print2(m1);
        print2(m2);
        print2(m3);
<<<<<<< HEAD
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
=======

>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
        System.out.print("testing sum1...\n");
        System.out.println("sum m1 : " + sum1(m1));
        System.out.println("sum m2 : " + sum1(m2));
        System.out.println("sum m3 : " + sum1(m3));
        System.out.print("testing sum2...\n");
        System.out.println("sum m1 : " + sum2(m1));
        System.out.println("sum m2 : " + sum2(m2));
        System.out.println("sum m3 : " + sum2(m3));
<<<<<<< HEAD
=======
	/*
>>>>>>> c3dbb7988d5fc51e65e9c217f2323f88cc181455
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class TwoDimArray