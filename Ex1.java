package welcomeday;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("Digite números para serem somados, caso deseje terminar, digite 0");
		do {
		
		num = ler.nextInt();
		numeros.add(num);
		soma += num;
		
		}while (num != 0);
		System.out.println("A soma dos números é: "+ soma);
		
		ler.close();	
	}

}
