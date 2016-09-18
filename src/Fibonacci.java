import java.util.Scanner;


public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many Fibonacci numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 1;
		int deliver = sc.nextInt();
		for (int i = 0; i < deliver; ++i) {
			if (i < deliver - 1) {
				System.out.printf("%d, ", x);
				y = x + y;
				x = y - x;
			} else {
				System.out.printf("%d", x);
				y = x + y;
				x = y - x;
			}
		}	
	}
}