package Clase;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		
		int nota;
		int i=0;
		float notamed=0;
		Scanner teclado = new Scanner(System.in);
		
		
			do {
				System.out.println("¿Qué nota tiene?");	
				nota=teclado.nextInt();
				
				if (nota<0 | nota>10) {
					System.out.println("Esa nota no vale,¿Qué nota tiene??");
					nota=teclado.nextInt();
				}
				notamed=notamed+nota;
				i=i+1;
			}while (i<10);
			
		
			
		notamed=notamed/10;
		System.out.println("La nota media es " +notamed);

	}

}
