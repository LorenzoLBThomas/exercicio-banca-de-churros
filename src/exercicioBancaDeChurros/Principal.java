package exercicioBancaDeChurros;

public class Principal {

	public static void main(String[] args) {
		BancaDeChurros banca = new BancaDeChurros(new Churros[Teclado.leInt("Quantos churros cabem no estoque?")]);

		for (int i = 0; i < banca.getArrayChurros().length; i++) {
			char op = Teclado.leChar("Deve ser adicionado algum churro nesta posição? [S/N]");
			if (Character.toLowerCase(op) == 's')
				banca.getArrayChurros()[i] = new Churros(Teclado.leString("Digite o sabor do churro: "),
						Teclado.leDouble("Digite o preço do churro: R$ "));
			else
				banca.getArrayChurros()[i] = new Churros();;
		}
		
		if(banca.insereChurro(new Churros(Teclado.leString("Digite o sabor do churro a ser inserido: "), 
				Teclado.leDouble("Digite o preço do churro a ser inserido: "))))
			System.out.println("Churro novo inserido com sucesso.");
		else
			System.out.println("Não há espaço no estoque.");
			
		System.out.println("Existem "+banca.estoqueChurros("Chocolate")+" churros de chocolate.");

		banca.valorTotal();

		banca.imprimeChurros();

		banca.vendeChurros("Creme de Avelã");

		banca.imprimeChurros();

		banca.lePedidos("Lorenzo", "Doce de leite", 1);
	}

}
