package Clase;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int i=0;
		int m=0;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		
		n1=teclado.nextInt();
		
		do {
			System.out.println("Dime un número entero");
			n2=teclado.nextInt();
			i=i+1;
			
			if (n1<n2) {
				System.out.println(n2);
				m=m+1;
			}
		}while(i<8);
		
		System.out.println(+m+ " números son mayores que " +n1);

	}

}
