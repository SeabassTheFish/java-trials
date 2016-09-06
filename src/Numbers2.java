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
			ArrayList<Integer> ints = new ArrayList<Integer>();
			int i;
			try {
				// get input
				System.out.print("What's your favorite number: ");
				i = sc.nextInt();
				if (i == 0) {
					System.out.println("Connection Terminated");
					break;
				}
				if (i < 0) {
					System.out.println("Don't be so negative!");
					continue;
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
				if (ints.size() == 0) {
					assert(i == 1);
					ints.add(1);
				}
				
				// print results
				System.out.print("This is the prime factorization: ");
				int power = 1;
				for (int k = 0; k < ints.size(); ++k) {
					boolean lastItem = k + 1 == ints.size();
					boolean sameFactor = !lastItem && ints.get(k) == ints.get(k + 1);
					if (sameFactor) {
						++power;
					} else {
						System.out.printf("%d%s", ints.get(k), (power == 1) ? "" : "^" + power);
						power = 1;
					}
					if (!lastItem && !sameFactor) {
						System.out.print(" x ");
					}
				}
				System.out.print("\n");
			} catch (InputMismatchException e) {
				System.out.println("That ain't a number.");
			}
		}
	}
}
