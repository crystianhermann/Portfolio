package java_easy;

public class Exercicio07_easy {
	public static double calculaInss(double salario) {

		double inss = 0.0;

		if (salario <= 1045.00) {
			inss = salario * 0.075;
			System.out.println("O valor do Inss a ser pago e de R$ " + inss);
		}
		if (salario >= 1045.01 && salario <= 2089.60) {
			inss = salario * 0.09;
			System.out.println("O valor do Inss a ser pago e de R$ " + inss);
		}
		if (salario >= 2089.61 && salario <= 3134.40) {
			inss = salario * 0.12;
			System.out.println("O valor do Inss a ser pago e de R$ " + inss);
		}
		if (salario >= 3134.41 && salario <= 6101.06) {
			inss = salario * 0.14;
			System.out.println("O valor do Inss a ser pago e de R$ " + inss);
		}
		if (salario > 6101.06) {
			inss = 854.15;
			System.out.println("O valor do Inss a ser pago e de R$ " + inss);
		}
		return inss;
	}
}
