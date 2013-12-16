//Oliver Zhang
//pd 8
//2013-9-13
//HW 41

import java.util.ArrayList;

public class StatPrinter {

    // instance variable for frequencies of each integer in input ArrayList
    private ArrayList <Integer> _frequency;


    //*************** QUESTION __ **************************
    //precond:  data.size() > 0, each entry b/t 0,100 inclusive
    //postcond: _frequency.size() set to max(data)+1
    //          _frequency.get(i) returns frequency of i in data
    //eg, for data [2,3,2,5,2,3]
    //  _frequency would be [0,0,3,2,0,1]
    public StatPrinter( ArrayList <Integer> data ) { 
	int max = max(data) + 1;
	ArrayList<Integer> temp = new ArrayList<Integer>(max + 1);
	for(int i = 0; i < data.size(); i++) {
		int freq = 0;
		for (int x: data) 
			if (i == x) 
				freq += 1;
		temp.add(i,freq);
	}
	_frequency = temp;
    }


    public String toString() {
	return _frequency.toString();
    }	

    //*************** QUESTION __ **************************
    //precond:  data.size() > 0
    //postcond: returns largest integer in data
    public Integer max( ArrayList <Integer> data ) { 
	int guess = data.get(0);
	for(int i = 0; i < data.size(); i++) {
		if (data.get(i) > guess) 
			guess = data.get(i);
	}	
	return guess;
    }


    //*************** QUESTION __ **************************
    //postcond: returns true if i>0 and i<_frequency.size()-1
    //          and _frequency.get(i-1) < _frequency.get(i)
    //          and _frequency.get(i+1) < _frequency.get(i)
    //          Otherwise, returns false
    //eg, for _frequency [1,2,1,5,5,8,2,4]
    //    2 and 8 are local modes, so
    //    isLocalMode(0) -> false
    //    isLocalMode(1) -> true
    //    isLocalMode(5) -> true
    public boolean isLocalMode( int i ) { 
	
	boolean size = i > 0 && i < (_frequency.size() - 1);
	if (!size)
		return false;
	boolean less = _frequency.get(i-1) < _frequency.get(i);
	boolean more = _frequency.get(i+1) < _frequency.get(i);
	return (less && more);
    }


    //*************** QUESTION __ **************************
    //postcond: returns list of modes in _frequency
    public ArrayList <Integer> getLocalModes() {
	ArrayList<Integer> ret = new ArrayList<Integer>();
	for (int x = 1; x < (_frequency.size() - 1); x++) {
		if (isLocalMode(_frequency.get(x)))
			ret.add(_frequency.get(x));
	}
	return ret;
    }


    //*************** QUESTION __ **************************
    //precond:  longestBar > 0
    public void printHistogram( int longestBar ) { 
	String retStr = "";
	int max = max(_frequency);
	for (int x = 0; x < _frequency.size(); x++) {
		String star = "";
		retStr += (x + ": ");
		
		
		
		for (int a = _frequency.get(x); a > 0; a--) {
			star += "*";
		}
		
		
		retStr += star + "\n";
	}
	System.out.println(retStr);
    }
 
}//end class StatPrinter
