//Oliver Zhang
//pd 8
//2013-11-19
//HW 28

public class Rational implements Comparable {
	public int numerator;
	public int denominator;
	
	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public Rational( int n, int d ) {
		numerator = n;
		denominator = d;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public boolean equals(Object obj) {
		return this.compareTo((Rational)obj) == 0;
	}

	public double floatValue() {
		return (double)((numerator + 0.0)/(denominator + 0.0));
	}

	public void multiply(Rational n) {
		numerator = numerator * n.numerator;
		denominator = denominator * n.denominator;
	}

	public void divide(Rational n) {
		numerator = (numerator * n.denominator);
		denominator = (denominator * n.numerator);
	}

	public void add(Rational n) {
		int spotHold = denominator;
		denominator = denominator * n.denominator;
		numerator = numerator * n.denominator + spotHold * n.numerator;
	}

	public void subtract(Rational n) {
		int spotHold = denominator;
		denominator = denominator * n.denominator;
		numerator = numerator * n.denominator + (0 - spotHold * n.numerator);
	}

	public int EuclidGCD () {
	
		int num = numerator;
		int den = denominator;
	
		if (num > den) {
			int diff = num % den;
			
			while (num % den > 0) {
			    
			    num = den;
			    den = diff;
			    diff = num % den;
			    if (diff < 0) diff *=-1;
			}
			
			return den;
		}
		else {
			Rational x = new Rational(den, num);
			
			return x.EuclidGCD();
		}
	
    	}

	public void reduce() {
		int GCD = this.EuclidGCD();
		if (GCD != 1) {
			
			denominator = denominator / GCD;
			numerator = numerator / GCD;
		}
	}

	public static int gcder (int a, int b) {
		int diff = a % b;
		if (a > b) {
			if (a % b == 0) {
			    return b;
			}
			else {
			    return gcder(diff, b);
			}
		}
		else {
			return gcder (b, a);
		}
        }

	public int compareTo(Object n) {
		((Rational)n).reduce();
		this.reduce();
		return numerator * ((Rational)n).denominator - ((Rational)n).numerator * denominator;
		
	}
	
	

	public static void main(String[] args) {
		Rational n = new Rational();
		Rational s = new Rational(7,9);
		Rational a = new Rational(7,9);
		Rational t = new Rational(7,10);
		Rational u = new Rational(14,4);
		Rational v = new Rational(28,8);
				


		
		
		System.out.println(v);
		System.out.println(a.compareTo(s));
		System.out.println(v.compareTo(u));
		System.out.println(u.compareTo(v));
		System.out.println(s.equals(a));
		System.out.println(v.equals(u));
		System.out.println(u.equals(v));
		

	}

}
