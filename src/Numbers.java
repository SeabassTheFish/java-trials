import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Numbers {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("I got %d arguments.\n", args.length);
		System.out.println("I got " + args.length + " arguments.");
		
		for (int k = 0; k < args.length; ++k) {
			System.out.printf("Argument %d is %s \n", k, args[k]);
		}
		while (true) {
			System.out.print("\nWhat's your favorite number: ");
			int i;
			try {
				i = sc.nextInt();
				if (i == 0) {
					break;
				}
				for(int j = 1; j <= i; ++j) {
					if (i%j == 0) {
						System.out.printf("%d x %d = %d\n", j, i/j, i);
					}
				}	
			} catch(InputMismatchException e) {
				String l = sc.nextLine();
				if (l.equals("e")) {
					System.out.println("Yeah, e is pretty cool.");
				} else if (l.equals("pi")) {
					System.out.println("Yeah, pi is pretty cool.");
				} else {
					System.out.printf("\"%s\" is not a number.\n", l);
				}
			}
		}
		System.out.println("Connection Terminated\n");
	}
}