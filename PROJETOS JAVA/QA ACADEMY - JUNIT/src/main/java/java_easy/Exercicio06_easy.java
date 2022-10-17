package java_easy;

public class Exercicio06_easy {

	public static String verificaAprovacao(double nota1, double nota2) {
		double resultado;

		resultado = (nota1 + nota2) / 2;

		if (resultado > 5) {
			return "Voce esta aprovado! Parabens!!!";
		}
		if (resultado >= 0 && resultado < 5) {
			return "Voce esta Reprovado";

		}
		if (resultado == 5) {
			return "Voce esta de Exame";

		}
		return "Nao foi possivel calcular sua nota";
	}

}
