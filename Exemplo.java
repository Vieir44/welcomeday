package welcomeday;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
	 
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("Digite um número: ");
		b = leia.nextInt();
		c = a/ b;
		System.out.println("Valor de C: " + c);
		try {
			c = a/ b;
			System.out.println("Valor de C: " + c);
		} catch (ArithmeticException erro) {
			System.out.println("Não existe divisão por 0");
		}
		

	}
        
}
