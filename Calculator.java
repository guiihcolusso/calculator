import java.util.Scanner;

public class Calculator {
	
	static float valor1, valor2, total, tc, limpaconsole;

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		java.util.Scanner scn = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------");
		System.out.println("Olá, Bem vindo a Calculadora");
		System.out.println("Soma(1), Subtração(2), Vezes(3), Divisao(4)");
		System.out.println("Entao Vamos lá :)");
		System.out.println("--------------------------------------------------");
		
		System.out.print("Digite o Tipo da Conta : ");
		tc = scn.nextFloat();
		
//CONTA DE MAIS		
		if (tc == 1) {
			for (limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
				System.out.println();
			}
			
			System.out.println("-------------------------[SOMA]-------------------------");
			System.out.print("Ok, Digite o Primeiro Valor: ");
			valor1 = scn.nextFloat();
			System.out.print("Ok, Digite o Segundo Valor : ");
			valor2 = scn.nextFloat();
			
			total = valor1 + valor2;
			
			System.out.println();
			System.out.println("Resultado : " + total);
			
		}else if (tc == 2) {
			for (limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
				System.out.println();
			}
				
			System.out.println("-------------------------[Subtração]-------------------------");
			System.out.print("Ok, Digite o Primeiro Valor: ");
			valor1 = scn.nextFloat();
			System.out.print("Ok, Digite o Segundo Valor : ");
			valor2 = scn.nextFloat();
			
			total = valor1 - valor2;
			
			System.out.println();
			System.out.println("Resultado : " + total);
		
		}else if (tc == 3) {
			for (limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
				System.out.println();
			}
			System.out.println("-------------------------[VEZES]-------------------------");
			System.out.print("Ok, Digite o Primeiro Valor: ");
			valor1 = scn.nextFloat();
			System.out.print("Ok, Digite o Segundo Valor : ");
			valor2 = scn.nextFloat();
			
			total = valor1 * valor2;
			
			System.out.println();
			System.out.println("Resultado : " + total);
		
		}else if (tc == 4) {
			for (limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
				System.out.println();
			}
				
			System.out.println("-------------------------[DIVISÂO]-------------------------");
			System.out.print("Ok, Digite o Primeiro Valor: ");
			valor1 = scn.nextFloat();
			System.out.print("Ok, Digite o Segundo Valor : ");
			valor2 = scn.nextFloat();
			
			total = valor1 / valor2;
			
			System.out.println();
			System.out.println("Resultado : " + total);
		
		}else{
			for (limpaconsole = 0; limpaconsole < 50; ++limpaconsole) {
				System.out.println();
			}
			System.out.println();
			System.out.println("Atenção  - Opção Invalida");
		}
		
		scn.close();
		System.out.println();
		System.out.println("Obriado pela Escolha de nosso Software :)");
		
	}
	
		
}



