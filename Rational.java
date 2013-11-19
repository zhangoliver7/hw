public class Rational {
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

	public long floatValue() {
		return (double)(numerator/denominator);
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
			int diff = num - den;
			
			while (num % den > 0) {
			    
			    num = den;
			    den = diff;
			    diff = num - den;
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
		int diff = a - b;
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

	public int compareTo(Rational n) {
		n.reduce();
		this.reduce();
		if (n.denominator == denominator) return numerator - n.numerator;
		
		
		else {
			int spotHoldD = denominator;
			
			
			numerator = numerator * n.denominator;
			
			
			n.numerator = n.numerator * denominator;
			System.out.println(n);
			System.out.println(this);
			return numerator - n.numerator;
		}
	}
	
	public static void main(String[] args) {
		Rational n = new Rational();
		Rational s = new Rational(7,9);
		Rational t = new Rational(7,10);
		Rational u = new Rational(14,4);
		
		/*System.out.println(s);
		System.out.println(s.EuclidGCD());
		System.out.println(t.EuclidGCD());
		System.out.println(u.EuclidGCD());
		u.reduce();
		s.reduce();
		t.reduce();
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);*/
		System.out.println(t.compareTo(u));
		/*System.out.println(n);
		System.out.println(s);
		System.out.println(t);

		n.multiply(s);

		System.out.println(n);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		n.divide(s);
		s.multiply(t);
		System.out.println(n);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		t.divide(s);
		t.multiply(u);
		System.out.println(n);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);*/
		

	}

}
