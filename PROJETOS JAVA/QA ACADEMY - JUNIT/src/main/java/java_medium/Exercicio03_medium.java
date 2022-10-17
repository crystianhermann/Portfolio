package java_medium;

public class Exercicio03_medium {
	public void somaNumerosAcumulados() {
		int i = 0;
		int soma = 0;
		while (i <= 1000) {
			soma = soma + i;
			System.out.println(soma);
			i++;
			if (soma >= 1500) {
				break;
			}
		}
	}
}
