package cnh;

import java.util.Scanner;

public class cnh {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo dados as variaveis
		int psico, legis, direc;
		// printando na tela o texto em paratenses
		System.out.println("Digite 1 para sim\n2 para não!");
		System.out.println("Voce foi aprovado no Exame Psicotécnico?\n1.sim\n2.não");
		// atribuindo um valor que o usuario digitou
		psico = batman.nextInt();
		System.out.println("Voce foi aprovado no Exame de Legislação?\n1.sim\n2.não");
		legis = batman.nextInt();
		System.out.println("Voce foi aprovado no Exame de Direção?\n1.sim\n2.não");
		direc = batman.nextInt();
		// encerando o scanner
		batman.close();
		// criando condição
		if (psico == 1 && legis == 1 && direc == 1) {
			System.out.println("Parabéns voce pode Solicitar sua Carteira Nacional de Habilitação!");
		} else {
			System.out.println("Voce infelizmente não pode Solicitar sua Carteira Nacional de Habilitação");
		}
	}

}
