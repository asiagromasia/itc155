
public class writeNrstillNr {

	
	public static void main(String[] args) {
		
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
		writeNums(8);
		System.out.println();
		writeNums(1);
		System.out.println();
		writeNums(0);
		
	}

	public static void writeNums(int n) {
	
		if (n < 1) {
			throw new IllegalArgumentException();
		}
		 
			// base case
		else if (n == 1) {
			System.out.print(n);
			
		} else {
			//recursive case
			writeNums(n - 1);
			System.out.print(", " + n);

			}
		
	}

}
