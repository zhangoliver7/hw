//Oliver Zhang
//pd 8
//2013-11-25
//HW 32


import cs1.Keyboard; /* must have cs1 dir in same dir as this file 
                        for this to work */

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;



    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
            _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) {
        _lo = a;
	_hi = b;
	_target = (int)(a + Math.random() * b);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
                        Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() {
	System.out.println("Guess a # from" + _lo + "-" + _hi + ":");
        int ans = Keyboard.readInt();
	if (ans == _target) {
		_guessCtr += 1;
		System.out.println("Correct! It took " + _guessCtr + " times.");
	}
	else { 
		_guessCtr += 1;
		if (ans > _target) {
			_hi = ans - 1;
			System.out.println("too high.");
			this.playRec();
		}
		else if (ans < _target) {
			_lo = ans + 1;
			System.out.println("too low.");
			this.playRec();
			
		}
	}
	
	
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
                         Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() {
	System.out.println("Guess a # from" + _lo + "-" + _hi + ":");
        int ans = Keyboard.readInt();
	while (ans != _target) {
	    if (ans > _target) {
		_hi = ans -1;
		System.out.println("Too high.");
	    }
	    else if (ans < _target) {
		_lo = ans + 1;
		System.out.println("Too low.");
	    }
	    _guessCtr += 1;
	    System.out.println("Guess a # from" + _lo + "-" + _hi + ":");
	    ans = Keyboard.readInt();
	}
	_guessCtr += 1;
	System.out.println("Correct! It took " + _guessCtr + " times.");

    }


    //wrapper for playRec/playIter to simplify calling
    public void play() { 
        //use one or the other below:
        playRec();
        //playIter();
    }


    //main method to run it all
    public static void main( String[] args ) {

        //instantiate a new game
        GuessNumber g = new GuessNumber(1,100);

        //start the game
        g.play();
    }


    /*==================================================
      _ _(_) -- 
      pre:  
      post: 
      ==================================================*/
}//end class
