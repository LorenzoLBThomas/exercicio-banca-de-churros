package exercicioBancaDeChurros;

public class BancaDeChurros {
	Churros[] arrayChurros;

	public BancaDeChurros(Churros[] arrayChurros) {
		this.arrayChurros = arrayChurros;
	}

	public Churros[] getArrayChurros() {
		return arrayChurros;
	}

	public void setArrayChurros(Churros[] arrayChurros) {
		this.arrayChurros = arrayChurros;
	}

	public int estoqueChurros(String sabor) {
		int quant = 0;
		for (int i = 0; i < arrayChurros.length; i++) {
			if (arrayChurros[i].getSabor() != null)
				if (arrayChurros[i].getSabor().equals(sabor))
					quant++;
		}
		return quant;
	}

	public boolean insereChurro(Churros churro) {
		for (int i = 0; i < arrayChurros.length; i++) {
			if (arrayChurros[i].getSabor() == null) {
				arrayChurros[i] = churro;
				return true;
			}
		}
		return false;
	}

	public double valorTotal() {
		double valor = 0;
		for (int i = 0; i < arrayChurros.length; i++) {
			valor += arrayChurros[i].getPreco();
		}
		return valor;
	}

	public boolean vendeChurros(String sabor) {
		for (int i = 0; i < arrayChurros.length; i++) {
			if (arrayChurros[i].getSabor() != null)
				if (arrayChurros[i].getSabor().equals(sabor)) {
					System.out.println("Compra aprovada! Valor: R$ " + arrayChurros[i].getPreco());
					arrayChurros[i].setSabor(null);
					arrayChurros[i].setPreco(0.0);
					return true;
				}
		}
		System.out.println("Não existem churros do sabor desejado.");
		return false;
	}

	public void imprimeChurros() {
		for (int i = 0; i < arrayChurros.length; i++) {
			System.out.println("Sabor: " + arrayChurros[i].getSabor() + " // Preço: R$ " + arrayChurros[i].getPreco());
		}
	}

	public void lePedidos(String nome, String sabor, int quantidade) {
		if (quantidade > estoqueChurros(sabor))
			System.out.println("Não existe(m) " + quantidade + " churros do sabor desejado. Pedido não realizado.");
		else
			System.out.println("Pedido realizado com sucesso!");
	}
}
