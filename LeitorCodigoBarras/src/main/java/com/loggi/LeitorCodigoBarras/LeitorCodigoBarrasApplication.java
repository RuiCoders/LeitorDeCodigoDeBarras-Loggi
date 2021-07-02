package com.loggi.LeitorCodigoBarras;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import PreencheTrincas.Pacote;

@SpringBootApplication
public class LeitorCodigoBarrasApplication {
	public static void main(String[] args) {
		int opcao = 1;

		do {
			System.out.print("\nInforme o numero do codigo de barras para continuar:\n");
			Scanner scanner = new Scanner(System.in);
			String numero = scanner.nextLine();
			Pacote gerador = new Pacote(numero);
			gerador.preencheTrincas();
			gerador.verificar();
			System.out.printf("\n Código: %s", numero);
			System.out.printf("\n Região de origem: %s", gerador.origem());
			System.out.printf("\n Região de destino: %s", gerador.destino());
			System.out.printf("\n Código Loggi: %s", gerador.codigoLoggi());
			System.out.printf("\n Código do vendedor do produto: %s", gerador.getCodigoVendedor());
			System.out.printf("\n Tipo do produto: %s\n", gerador.tipoProduto());
			System.out.println("\n 1 - Iniciar uma nova consulta de codigo de barras");
			System.out.println(" 2 - Sair");
			System.out.println("OPCAO: ");
			opcao = scanner.nextInt();
		} while (opcao != 2);
		System.out.println(">>> Programa finalizado com sucesso <<<");
	}
}
