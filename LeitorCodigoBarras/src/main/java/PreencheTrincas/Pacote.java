package PreencheTrincas;

public class Pacote {
	private String codigo;
	private String origem = "";
	private String destino = "";
	private String codigoLoggi = "";
	private String codigoVendedor = "";
	private String tipoProduto = "";

	public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public Pacote(String codigo) {
		this.codigo = codigo;
	}

	private boolean codigoValido() {
		boolean resp = false;

		if (codigo.length() == 15) {
			resp = true;
		}

		return resp;
	}

	public String preencheTrincas() {

		char[] numeros = codigo.toCharArray();

		for (int i = 0; i < numeros.length; i++) {
			if (i >= 0 && i < 3) {
				origem += numeros[i];
			} else if (i >= 3 && i < 6) {
				destino += numeros[i];
			} else if (i >= 6 && i < 9) {
				codigoLoggi += numeros[i];
			} else if (i >= 9 && i < 12) {
				codigoVendedor += numeros[i];
			} else if (i >= 12 && i < 15) {
				tipoProduto += numeros[i];
			}

		}
		return codigoVendedor;
	}

	public String destino() {
		String destino = "";

		if (this.destino.equals("111")) {
			destino = "Centro-oeste";
		} else if (this.destino.equals("333")) {
			destino = "Nordeste";
		} else if (this.destino.equals("555")) {
			destino = "Norte";
		} else if (this.destino.equals("888")) {
			destino = "Sudeste";
		} else if (this.destino.equals("000")) {
			destino = "Sul";
		} else {
			destino = " invalido";
		}

		return destino;
	}

	public String origem() {
		String origem = "";

		if (this.origem.equals("111")) {
			origem = "Centro-oeste";
		} else if (this.origem.equals("333")) {
			origem = "Nordeste";
		} else if (this.origem.equals("555")) {
			origem = "Norte";
		} else if (this.origem.equals("888")) {
			origem = "Sudeste";
		} else if (this.origem.equals("000")) {
			origem = "Sul";
		} else {
			origem = "invalido";
		}

		return origem;
	}

	public String tipoProduto() {
		String tipoProduto = "";

		if (this.tipoProduto.equals("111")) {
			tipoProduto = "Livros";
		} else if (this.tipoProduto.equals("333")) {
			tipoProduto = "Eletronicos";
		} else if (this.tipoProduto.equals("555")) {
			tipoProduto = "Bebidas";
		} else if (this.tipoProduto.equals("888")) {
			tipoProduto = "Brinquedos";
		} else if (this.tipoProduto.equals("000")) {
			tipoProduto = "Joias";
		} else {
			tipoProduto = "invalido";
		}

		return tipoProduto;
	}

	public String codigoLoggi() {
		String codigoLoggi = "";
		if (this.codigoLoggi.equals("555")) {
			codigoLoggi = "555";
		} else {
			codigoLoggi = "invalido";
		}
		return codigoLoggi;
	}

	public void verificar() {
		if (codigoValido()) {

			if (origem().endsWith("invalido") || destino().endsWith("invalido") || codigoLoggi().equals("invalido")
					|| tipoProduto().equals("invalido")) {
				System.out.println("* O código de barras é invalido *");
			} else {
				System.out.println("* O código de barras esta Valido *");

			}

			if (origem().endsWith("Sul") && tipoProduto().endsWith("Brinquedos")) {
				System.out.println("** Origem Sul e Tipo: Brinquedo **");
			}

			if (codigoVendedor.equals("584")) {
				System.out.println("*** Vendedor com CNPJ inativo! ***");
			}
			if (origem().endsWith("Centro-oeste") && tipoProduto().endsWith("Joias")) {
				System.out.println("**** Não é possível despachar pacotes contendo "
						+ "jóias tendo como região de origem o Centro-oeste ****");
			}

		}
	}
}
