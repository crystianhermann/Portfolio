package java_medium;

public class Exercicio01_medium {
	public static void exibeParOuImpar() {
		int i = 0;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println("O numero: " + i + " e par!");
			} else {
				System.out.println("O numero" + i + " e impar!");
			}
			i++;
		}
	}
}
