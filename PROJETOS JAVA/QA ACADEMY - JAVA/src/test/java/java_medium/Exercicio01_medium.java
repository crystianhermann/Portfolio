package java_medium;

public class Exercicio01_medium {
	public static void exibeParOuImpar() {
		int i = 0;
		
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println("O número: " + i + "É par!");
			} else {
				System.out.println("O número" + i + "É ímpar!");
			}
			i++;
		}
	}

}
