package welcomeday;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("Digite alguns números para serem verificados se são pares, caso deseje terminar, digite 0");
		do {
			num = ler.nextInt();
			
			if(num %2 == 0) {
				numeros.add(num);
				
				
			}
		}while (num != 0);
		System.out.println("Os números pares digitados são: " + numeros);

		ler.close();	
	}
}