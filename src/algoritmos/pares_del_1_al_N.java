package algoritmos;
import java.util.Scanner;
public class pares_del_1_al_N {
	private static Scanner leer;
	
	public static void main(String[] args) {
		leer = new Scanner(System.in);
		System.out.println("npares");
		int N = leer.nextInt();
		
		int i=1;
		while (i<N) {
			if (i%2==0) {
				System.out.println(i);
				
				}
			i=i+1;
			
		}
		leer.close();
		}
		
	
	}


