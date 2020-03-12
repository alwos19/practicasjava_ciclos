package algoritmos;
import java.util.Scanner;
public class escribir_nveces {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		System.out.println("nveces");
		int n = leer.nextInt();
		int i=1;
		
		while(i<=n) {
			System.out.println("Hola mundo");
			i=i+1;
			
		}
		
		leer.close();

	}

}
