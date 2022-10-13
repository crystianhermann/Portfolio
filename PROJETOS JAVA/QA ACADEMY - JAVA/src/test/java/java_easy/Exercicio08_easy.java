package java_easy;

public class Exercicio08_easy {
	public static double calculaImpostoDeRenda(double salario) {

		double salarioLiquido = 0.0, impostoRenda = 0;
		

		if (salario <= 1903.99) {
			impostoRenda = 0;
			
			}
		if (salario >= 1903.99 && salario <= 2826.65) {
			impostoRenda = (salario * 0.075) - 142.80;
			
			}
		if (salario >= 2826.66 && salario <= 3751.05) {
			impostoRenda = (salario * 0.15) - 354.8;
			
			}
		if (salario >= 3751.06 && salario <= 4664.68) {
			impostoRenda = (salario * 0.225) - 636.13;
			
			}
		if (salario >= 4664.88) {
			impostoRenda = (salario * 0.275) - 869.36;
			
		}
				
		return impostoRenda;
		
	}
	
	public static double calcularSalarioLiquido(double salario, double impostoRenda) {
		
		return salario - impostoRenda;
	}
}
