package algoritmos;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese nota");
		double nota = leer.nextDouble();
		double prom;
		int i = 1;
		boolean flag = true;

		double suma = 0;
		while (flag) {
			suma = nota + suma;
			System.out.println("Presione e para salir, de lo contrario presione otra tecla.");
			char fin = leer.next().charAt(0);
			if (fin == 'e') {
				flag = false;
			}else {
				System.out.println("Ingrese nota");
				nota = leer.nextDouble();
				
				
				i++;
			}
		}

		prom = suma / i;

		System.out.println("el promedio es:" + prom);
		// prom = suma / notas;

		// System.out.println("promedio de las notas:"+prom);

		leer.close();
	}

}
