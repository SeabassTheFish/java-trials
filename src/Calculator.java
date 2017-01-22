import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		// get input
				Scanner scan = new Scanner(System.in);
				System.out.println("What is your first value?");
				double val1 = scan.nextDouble();
				System.out.println("What is your next value");
				double val2 = scan.nextDouble();
				System.out.println("What is your operator");
				String operator = scan.next();
				
				// get output
				double ans = 0;
				if (operator.equals("t") || operator.equals("+")) {
					ans = val1 + val2;
				}
				
				if (operator.equals("x") || operator.equals("*")) {
					ans = val1*val2;
				}
				
				if (operator.equals("-")) {
					ans = val1 - val2;
				}
				
				if (operator.equals("divide") || operator.equals("/")) {
					ans = val1/val2;
				}
				
				if (operator.equals("^")) {
					ans = val1;
					for(int i = 0; i < val2 - 1; ++i) {
						ans = ans*val1;
					}
				}
				// give output
				System.out.println(ans);
	}
}
