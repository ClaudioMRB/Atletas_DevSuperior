package atletas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner rc = new Scanner(System.in);
		Scanner rb = new Scanner(System.in);

		String nome1 = " ", nome2 = " ", nome3 = " ";
		Character sexo1 = ' ', sexo2 = ' ', sexo3 = ' ';
		;
		Double peso1 = 0.0, peso2 = 0.0, peso3 = 0.0, altura1 = 0.0, altura2 = 0.0, altura3 = 0.0, pesoMedio = 0.0,
				maisAlto, porcentagem, homem = 0.0;
		int cont = 1, quantAtletas, mulher;

		System.out.print("Qual a qunatidade de atletas?");
		quantAtletas = scan.nextInt();

		while (cont <= quantAtletas) {
			cont = cont + 1;
			System.out.println("Digite os dados do atleta: 1");
			System.out.print("Nome: ");
			nome1 = sc.nextLine();
			System.out.print("Sexo: ");
			sexo1 = scan.next().charAt(0);
			while (sexo1 != 'F' && sexo1 != 'M') {
				System.out.print("Valor inválido! Favor digitar F ou M ");
				sexo1 = scan.next().charAt(0);
			}
			if (sexo1 == 'M') {
				homem = homem + 1;

			}
			System.out.print("Altura: ");
			altura1 = scan.nextDouble();
			while (altura1 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				altura1 = scan.nextDouble();
			}

			System.out.print("Peso: ");
			peso1 = scan.nextDouble();
			while (peso1 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				peso1 = scan.nextDouble();
			}

			pesoMedio = pesoMedio + peso1;
			cont = cont + 1;

			System.out.println("Digite os dados do atleta: 2");
			System.out.print("Nome: ");
			nome2 = sc.nextLine();
			System.out.print("Sexo: ");
			sexo2 = scan.next().charAt(0);
			while (sexo2 != 'F' && sexo2 != 'M') {
				System.out.print("Valor inválido! Favor digitar F ou M ");
				sexo2 = scan.next().charAt(0);
			}
			if (sexo2 == 'M') {
				homem = homem + 1;

			}
			System.out.print("Altura: ");
			altura2 = rc.nextDouble();
			while (altura2 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				altura2 = scan.nextDouble();
			}

			System.out.print("Peso: ");
			peso2 = scan.nextDouble();
			while (peso2 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				peso2 = scan.nextDouble();
			}

			pesoMedio = pesoMedio + peso2;
			cont = cont + 1;

			System.out.println("Digite os dados do atleta: 3");
			System.out.print("Nome: ");
			nome3 = sc.nextLine();
			System.out.print("Sexo: ");
			sexo3 = scan.next().charAt(0);
			while (sexo3 != 'F' && sexo3 != 'M') {
				System.out.print("Valor inválido! Favor digitar F ou M ");
				sexo3 = scan.next().charAt(0);
			}
			if (sexo3 == 'M') {
				homem = homem + 1;

			}
			System.out.print("Altura: ");
			altura3 = scan.nextDouble();
			while (altura3 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				altura3 = scan.nextDouble();
			}

			System.out.print("Peso: ");
			peso3 = scan.nextDouble();
			while (peso3 <= 0) {
				System.out.print("Valor invalido: Digite um valor positivo ");
				peso3 = scan.nextDouble();
			}

			pesoMedio = pesoMedio + peso3;

		}
		System.out.println("RELATÓRIO ");
		System.out.printf("Peso médio dos atletas %.2f", pesoMedio / quantAtletas);

		if (altura1 > altura2 && altura1 > altura3) {
			System.out.print("\nMaior atleta é: " + nome1);
		} else if (altura2 > altura1 && altura2 > altura3) {
			System.out.print("\nMaior atleta é: " + nome2);
		} else if (altura3 > altura1 && altura3 > altura2) {
			System.out.println("\nMaior atleta é: " + nome3);
		}

		if (sexo1 == 'M' || sexo2 == 'M' || sexo3 == 'M') {
			homem = homem / quantAtletas * 100;
			System.out.printf("\nPorcentagens de Homens: %.1f", homem);
			System.out.println("%");
		}

	}

}
