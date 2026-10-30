package br.edu.fatecpg.polimorfismo.view;
import br.edu.fatecpg.polimorfismo.model.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("============ 1° Atividade ============");
		
		Produto produto1 = new Produto("Arroz");
		Produto produto2 = new Produto("Feijão", 10.00);
		Produto produto3 = new Produto("Salsicha", 30.00, 100);
		
		System.out.println("Nome: " + produto1.nome + " | preço: " + produto1.preco +  " | estoque: " + produto1.estoque);
		System.out.println("Nome: " + produto2.nome + " | preço: " + produto2.preco +  " | estoque: " + produto2.estoque);
		System.out.println("Nome: " + produto3.nome + " | preço: " + produto3.preco +  " | estoque: " + produto3.estoque);
		
		/* A sobrecarga de construtores permite que a mesma classe seja instanciada com 
		 * diferentes conjuntos de dados, sem obrigar a fornecer informações que ainda 
		 * não estão disponiveis*/
		
		System.out.println("============ 2° Atividade ============");
		
		PagamentoBoleto pagamento1 = new PagamentoBoleto();
		PagamentoCartao pagamento2 = new PagamentoCartao();
		
		pagamento1.processarPagamento();
		pagamento2.processarPagamento();
		
		/*O polimorfismo por sobrescrita permite que uma referência do tipo base
		 * aponte para objetos de subtipos e execute o comportamento específico de cada subtipo
		 * em tempo de execução, não precisando alterar a classe base.*/
		
		System.out.println("============ 3° Atividade ============");
		
		Conversor conversor = new Conversor();
		
		conversor.converter(1.0);
		conversor.converter(12);
		conversor.converter("alessandro");
		
		/*A sobrecarga de métodos permite que um mesmo nome represente operações diferentes, 
		 * desde que as assinaturas sejam distintas.*/
		
	}
}
