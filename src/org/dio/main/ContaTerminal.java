package org.dio.main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o numero da conta: ");
		numero = scan.nextInt();
		
		System.out.println("Agora informe a ag�ncia: ");
		agencia = scan.next();
		
		System.out.println("Digite o nome do cliente: ");
		nomeCliente = scan.next();
		
		System.out.println("Informe qual ser� o saldo inicial da conta: ");
		saldo = scan.nextDouble();
		
		System.out.println("Ol� "+ nomeCliente +", obrigado por criar uma conta em nosso banco");
		System.out.println("Sua ag�ncia �: "+ agencia);
		System.out.println("Sua conta �: " + numero);
		System.out.println("Seu saldo j� est� dispon�vel para saque. Saldo atual: "+ saldo);
		
		scan.close();
	}
}
