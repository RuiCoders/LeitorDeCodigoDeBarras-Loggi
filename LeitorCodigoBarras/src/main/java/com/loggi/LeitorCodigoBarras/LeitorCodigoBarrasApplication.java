package com.loggi.LeitorCodigoBarras;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import PreencheTrincas.Pacote;

@SpringBootApplication
public class LeitorCodigoBarrasApplication {
	public static void main(String[] args) {
		System.out.print("\nDigite o numero do codigo de barras: ");
		Scanner scanner = new Scanner(System.in);
		String numero = scanner.nextLine();
		scanner.close();
		Pacote gerador = new Pacote(numero);
		gerador.preencheTrincas();
		gerador.verificar();
		System.out.printf("\n Região de origem:  %s ", gerador.origem());
		System.out.printf("\n Região de destino:  %s ", gerador.destino());
		System.out.printf("\n Código Loggi:  %s ", gerador.codigoLoggi());
		System.out.printf("\n Código do vendedor do produto: %s ",gerador.getCodigoVendedor());
		System.out.printf("\n Tipo do produto: %s", gerador.tipoProduto());
	}

}
