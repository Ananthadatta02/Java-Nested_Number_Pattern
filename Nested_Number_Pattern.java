package number_patterns;

import java.util.Scanner;

/*
55555
54445
54345
54445
55555
	 */
public class Nested_Number_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) { // Row loop
            for (int j = 0; j < n; j++) { // Column loop
                
                // Determine the value to print based on conditions
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print(n); // Print 5 at the outer layer
                } 
                else if (i == 1 || j == 1 || i == n - 2 || j == n - 2) {
                    System.out.print(n - 1); // Print 4 at the second layer
                } 
                else {
                    System.out.print(n - 2); // Print 3 at the center
                }
            }
            System.out.println();
        }
	}
}
