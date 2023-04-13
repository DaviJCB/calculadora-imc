package view;

import java.util.Scanner;

import control.Calculadora;

public class Principal extends Calculadora {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual sua idade?");
		while (!sc.hasNextInt()) {
			System.out.println("Idade inválida, por favor insira um número inteiro:");
			sc.next();
		}
		int idade = sc.nextInt();
		if (idade < 20) {
			System.out.println("Desculpe, não calculamos IMC para crianças");
		} else if (idade > 19 && idade < 66) {
			System.out.println("Qual é seu sexo? \n [1]Homem\n [2]Mulher");
			int sexo;
			float peso, altura;

			while (!sc.hasNextInt()) {
				System.out.println("Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
				sc.next();
			}
			sexo = sc.nextInt();
			if (sexo != 1 && sexo != 2) {
				do {
					System.out.println("Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
					while (!sc.hasNextInt()) {
						System.out.println(
								"Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
						sc.next();
					}
					sexo = sc.nextInt();
				} while (sexo != 1 && sexo != 2);

			}
			System.out.println("Qual é seu peso?");
			while (!sc.hasNextFloat()) {
				System.out.println("Peso inválido, por favor insira um número válido:");
				sc.next();
			}
			peso = sc.nextFloat();
			System.out.println("Qual é sua altura?");
			while (!sc.hasNextFloat()) {
				System.out.println("Peso inválido, por favor insira um número válido:");
				sc.next();
			}
			altura = sc.nextFloat();
			System.out.println(calc.CalculaImcAdulto(peso, altura));
		} else if (idade > 65) {
			int sexo;
			float peso, altura;

			System.out.println("Qual é seu sexo? \n [1]Homem\n [2]Mulher");
			while (!sc.hasNextInt()) {
				System.out.println("Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
				sc.next();
			}
			sexo = sc.nextInt();
			if (sexo != 1 && sexo != 2) {
				do {
					System.out.println("Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
					while (!sc.hasNextInt()) {
						System.out.println(
								"Opção inválida, por favor escolha uma das opções a seguir: [1]Homem [2]Mulher");
						sc.next();
					}
					sexo = sc.nextInt();
				} while (sexo != 1 && sexo != 2);
			}
			switch (sexo) {

			case 1:
				System.out.println("Qual é seu peso?");
				while (!sc.hasNextFloat()) {
					System.out.println("Peso inválido, por favor insira um número válido:");
					sc.next();
				}
				peso = sc.nextFloat();
				System.out.println("Qual é sua altura?");
				while (!sc.hasNextFloat()) {
					System.out.println("Peso inválido, por favor insira um número válido:");
					sc.next();
				}
				altura = sc.nextFloat();
				System.out.println(calc.CalculaImcIdoso(peso, altura));
				break;

			case 2:
				System.out.println("Qual é seu peso?");
				while (!sc.hasNextFloat()) {
					System.out.println("Peso inválido, por favor insira um número válido:");
					sc.next();
				}
				peso = sc.nextFloat();
				System.out.println("Qual é sua altura?");
				while (!sc.hasNextFloat()) {
					System.out.println("Peso inválido, por favor insira um número válido:");
					sc.next();
				}
				altura = sc.nextFloat();
				System.out.println(calc.CalculaImcIdosa(peso, altura));
				break;

			}
		}
		sc.close();
	}
}
