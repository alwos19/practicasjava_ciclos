package algoritmos;
import java.util.Scanner;


public class invertir_numero {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese número que desea invertir");
		int n = leer.nextInt();
		int s = 0;
		
		if (n<32768) {
			
			while (n!=0) {
				s= s*10;
				s= s+(n%10);
				n= n/10;
			}
			System.out.println(s);
		}
		else {
			System.out.println("No es menor que 32768");
		}
		

	}

}
