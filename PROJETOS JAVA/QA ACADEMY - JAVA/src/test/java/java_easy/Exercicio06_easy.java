package java_easy;

public class Exercicio06_easy {

	public static String verificaAprovacao(double nota1, double nota2) {
		double resultado;

		resultado = (nota1 + nota2) / 2;

		if (resultado > 5) {
			return "Voc� est� aprovado! Parab�ns!!!";
		}
		if (resultado < 5) {
			return "Voc� est� Reprovado";

		}
		if (resultado == 5) {
			return "Voc� est� de Exame";

		}
		return "N�o foi poss�vel calcular sua nota";
	}

}
