package cnh;

import java.util.Scanner;

public class cnh {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo dados as variaveis
		int psico, legis, direc;
		// printando na tela o texto em paratenses
		System.out.println("Digite 1 para sim\n2 para n�o!");
		System.out.println("Voce foi aprovado no Exame Psicot�cnico?\n1.sim\n2.n�o");
		// atribuindo um valor que o usuario digitou
		psico = batman.nextInt();
		System.out.println("Voce foi aprovado no Exame de Legisla��o?\n1.sim\n2.n�o");
		legis = batman.nextInt();
		System.out.println("Voce foi aprovado no Exame de Dire��o?\n1.sim\n2.n�o");
		direc = batman.nextInt();
		// encerando o scanner
		batman.close();
		// criando condi��o
		if (psico == 1 && legis == 1 && direc == 1) {
			System.out.println("Parab�ns voce pode Solicitar sua Carteira Nacional de Habilita��o!");
		} else {
			System.out.println("Voce infelizmente n�o pode Solicitar sua Carteira Nacional de Habilita��o");
		}
	}

}
