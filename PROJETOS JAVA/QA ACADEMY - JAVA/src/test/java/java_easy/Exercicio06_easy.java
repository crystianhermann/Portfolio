package java_easy;

public class Exercicio06_easy {

	public static String verificaAprovacao(double nota1, double nota2) {
		double resultado;

		resultado = (nota1 + nota2) / 2;

		if (resultado > 5) {
			return "Você está aprovado! Parabéns!!!";
		}
		if (resultado < 5) {
			return "Você está Reprovado";

		}
		if (resultado == 5) {
			return "Você está de Exame";

		}
		return "Não foi possível calcular sua nota";
	}

}
