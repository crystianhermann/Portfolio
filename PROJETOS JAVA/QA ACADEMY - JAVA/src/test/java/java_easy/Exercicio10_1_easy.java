package java_easy;

public class Exercicio10_1_easy {
	public static void main(String[] args) {

		double txJuros = 0.05;
		double valorInvestimento = 1000.00;
		double valorJuros = (10 * txJuros) * valorInvestimento;
		double valorTotal = valorJuros + valorInvestimento;
		
		System.out.println("Valor Investido: R$ " + valorInvestimento);
		System.out.println("Valor Juros: R$ "+ valorJuros);
		System.out.println("Valor Total com Juros R$ "+ valorTotal);
	}

}
