import java.util.Scanner;


public class Fibonacci2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Which Ficonacci number: ");
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 1;
		int deliver = sc.nextInt();
		for (int i = 0; i < deliver - 1; ++i) {
			y = x + y;
			x = y - x;
		}
		System.out.println(x);
	}

}
