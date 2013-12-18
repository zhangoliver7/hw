import java.util.ArrayList;
public class Sort {
    
    public static void sort(ArrayList<Integer> a) {
	int x = 0;
	while (x < a.size()) {
	    for (int i = 0; i < a.size() - 1; i++) {
		if (a.get(i) > a.get(i + 1)) {
		    int holder = a.get(i);
		    a.set(i, a.get(i + 1));
		    a.set(i + 1, holder);
		}
	    }
	    x++;
	}
    }
    
    public static void main(String[] args) {
	ArrayList foo = new ArrayList(10);
	for (int i = 0; i < 10; i++) {
	    foo.add((int)(Math.random() * 16));
	}
	System.out.println(foo);
	sort(foo);
	System.out.println(foo);
	
    }

					    


}