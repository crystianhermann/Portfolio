package java_easy;

public class Exercicio10_easy {
	public static double calcularValorJuros(double valorInvestimento) {

		double valorJuros = 0.0;
		double txJuros = 0.05;
		double ano = 1;

		while (ano <= 10) {
			valorJuros = valorJuros + (valorInvestimento * txJuros);
			ano = ano + 1;
		}

		return valorJuros;
	}
}
