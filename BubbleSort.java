import java.util.ArrayList;
public class BubbleSort {
    
    public static void sort(ArrayList<Comparable> a) {
	int x = 0;
	int swapcounter = 0;
	while (x < a.size() - 1) {
	    for (int i = 0; i < a.size() - 1; i++) {
		if (a.get(i).compareTo(a.get(i + 1)) > 0) {
		    Comparable holder = a.get(i);
		    a.set(i, a.get(i + 1));
		    a.set(i + 1, holder);
		    swapcounter++;
		}
	    }
	    x++;
	    if (swapcounter == 0) 
		break;
	}
    }
    
    public static ArrayList<Comparable> sortV(ArrayList<Comparable> a) {
	int x = 0;
	int swapcounter = 0;
	ArrayList<Comparable> retList = new ArrayList<Comparable>(a.size());
	
	for (int i = 0; i < a.size(); i++) {
	    retList.add(0);
	    retList.set(i,a.get(i));
	}
	System.out.println(retList);
	while (x < a.size() - 1) {
	    for (int i = 0; i < a.size() - 1; i++) {
		if (a.get(i).compareTo(a.get(i + 1)) > 0) {
		    Comparable holder = a.get(i);
		    retList.set(i, retList.get(i + 1));
		    retList.set(i + 1, holder);
		    swapcounter++;
		}
	    }
	    x++;
	    if (swapcounter == 0) 
		break;
	}
	return retList;
    }

    public static void main(String[] args) {
	ArrayList foo = new ArrayList(10);
	/*for (int i = 0; i < 10; i++) {
	    foo.add((int)(Math.random() * 100));
	}
	System.out.println(foo);
	sort(foo);
	System.out.println(foo);
	*/
	for (int i = 0; i < 10; i++) {
	    foo.add((int)(Math.random() * 100));
	}
	System.out.println(foo);
	sortV(foo);
	System.out.println(foo);
	   
	
    }

					    


}