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
		System.out.printf("\n Código: %s",numero);
		System.out.printf("\n Região de origem: %s", gerador.origem());
		System.out.printf("\n Região de destino: %s", gerador.destino());
		System.out.printf("\n Código Loggi: %s", gerador.codigoLoggi());
		System.out.printf("\n Código do vendedor do produto: %s",gerador.getCodigoVendedor());
		System.out.printf("\n Tipo do produto: %s\n", gerador.tipoProduto());
		  System.out.println("\n 1 - Iniciar uma nova consulta de codigo de barras");
	      System.out.println(" 2 - Sair");
	      System.out.println("OPCAO: ");
		opcao = scanner.nextInt();
		}while (opcao != 2 );
		System.out.println(">>> Programa finalizado com sucesso <<<");
	}
}
/*Pacote 1: 888555555123888
 * 000111555585888
Pacote 2: 333333555584333
Pacote 3: 222333555124000
Pacote 4: 000111555874555
Pacote 5: 111888555654777
Pacote 6: 111333555123333
Pacote 7: 555555555123888
Pacote 8: 888333555584333
Pacote 9: 111333555124000
Pacote 10: 333888555584333
Pacote 11: 555888555123000
Pacote 12: 111888555123555
Pacote 13: 888000555845333
Pacote 14: 000111555874000
Pacote 15: 111333555123555*/
