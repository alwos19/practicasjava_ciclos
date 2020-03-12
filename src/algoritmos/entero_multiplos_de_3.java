package algoritmos;
import java.util.Scanner;

public class entero_multiplos_de_3 {
	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		System.out.println("inserte número");
		int n = leer.nextInt();
		int i=1;
		
		while (i<=n) {
			 
			if (i%3==0) {
				System.out.println(i);
				}
			i++;
			
		
	
		}
		
		
		
	}
}
