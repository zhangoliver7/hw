import java.util.ArrayList;
public class StatTester {
	public static void main(String[] args) {
		
		ArrayList data = new ArrayList(20);
		for (int i = 0; i < 20; i++)
			data.add((int)(Math.random() * 10));
		StatPrinter foo = new StatPrinter(data);
		System.out.println(foo);
		System.out.println(data);
		System.out.println(foo.isLocalMode(5));
		System.out.println(foo.getLocalModes());
		foo.printHistogram(20);
	}
}
