package welcomeday;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vendas, a, b, c, bonus;
		
		System.out.println("Digite o número de vendas de um atendente na primeira semana");
		vendas = ler.nextInt();
		
		System.out.println("Agora, o número de vendas na segunda semana");
		a = ler.nextInt();
		
		System.out.println("Agora, Na terceira");
		b = ler.nextInt();
		
		System.out.println("E por último, na quarta");
		c = ler.nextInt();
		
		bonus = vendas + a + b + c;
		
		
		
		switch(bonus) {
		case 1:
			System.out.println("Sem bônus");
			break;
		case 2:
			System.out.println("Sem bônus");
			break;
		case 3:
			System.out.println("Sem bônus");
			break;
		case 4:
			System.out.println("Sem bônus");
			break;
		case 5:
			System.out.println("Sem bônus");
			break;
		case 6:
			System.out.println("Sem bônus");
			break;
		case 7:
			System.out.println("Sem bônus");
			break;
		case 8:
			System.out.println("Sem bônus");
			break;
		case 9:
			System.out.println("Sem bônus");
			break;
		case 10:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 11:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 12:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 13:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 14:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 15:
			System.out.println("Seu Bônus será de R$100,00");
			break;
		case 16:
			System.out.println("Seu Bônus será de R$300,00");
			break;
		case 17:
			System.out.println("Seu Bônus será de R$300,00");
			break;
		case 18:
			System.out.println("Seu Bônus será de R$300,00");
			break;
		case 19:
			System.out.println("Seu Bônus será de R$300,00");
			break;
		case 20:
			System.out.println("Seu Bônus será de R$300,00");
			break;
		default:
			System.out.println("Seu Bônus será de R$500,00");
		
		
		
		}

	}

}
