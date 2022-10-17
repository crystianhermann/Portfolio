package java_easy;

public class Exercicio09_easy {
	public static void calculaTabuada(int numeroDigitado) {
		int i = 0, resultado;

		while (i <= 10) {
			resultado = numeroDigitado * i;
			System.out.println(numeroDigitado + " X " + i + " = " + resultado);
			i++;
		}
	}
}
