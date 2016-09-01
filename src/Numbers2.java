import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> ints = new ArrayList<Integer>(); // storage of factors found
			System.out.print("What's your favorite number: ");
			try {
				// read input
				int i = sc.nextInt();
				if (i == 0) {
					break;
				}
				
				// calculate factors
				for (int j = 2; j <= i; ) {
					if (i%j == 0) {
						ints.add(j);
						i = i/j;
					} else {
						++j;
					}
				}
				
				// print results
				for (int k = 0; k < ints.size(); ++k) {
					if (k < ints.size() - 1) {
						System.out.printf("%d x ", ints.get(k));
					} else {
						System.out.printf("%d\n", ints.get(k)); // end print
					}
				}
			} catch (InputMismatchException e) {
				
			}
		}
	}
}
