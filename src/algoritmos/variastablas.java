package algoritmos;
import java.util.Scanner;
public class variastablas {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		int r;
		
		while (i<=10) {
			j=1;
			System.out.println("La tabla del "+i);
			while (j<=10) {
				r=i*j;
				System.out.println(i+"*"+j+"="+r);
				j++;
			}
			i++;
		
		
		}

		
	}

}
