import java.util.Scanner; 
 
public class Calculator { 
	public static void main(String[] args) { 
		 
		// get input 
		Scanner scan = new Scanner(System.in); 
		System.out.printf("What is your first value? : "); 
		double val1 = scan.nextDouble(); 
		System.out.printf("What is your next value : "); 
		double val2 = scan.nextDouble(); 
		System.out.printf("What is your operator : "); 
		String operator = scan.next(); 
		 
		// get output 
		double ans = 0; 
		if (operator.equals("t") || operator.equals("+")) { 
			ans = val1 + val2; 
		} else 
		 
		if (operator.equals("x") || operator.equals("*")) { 
			ans = val1*val2; 
		} else 
		 
		if (operator.equals("-")) { 
			ans = val1 - val2; 
		} else 
		 
		if (operator.equals("divide") || operator.equals("/")) { 
			ans = val1/val2; 
		} else 
		 
		if (operator.equals("^")) { 
			ans = Math.pow(val1,val2); 
		} 
		// give output 
		System.out.println(ans); 
	} 
} 
