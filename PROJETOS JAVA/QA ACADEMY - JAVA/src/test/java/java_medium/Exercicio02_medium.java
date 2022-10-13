package java_medium;

public class Exercicio02_medium {
	public double calculaInvestimentoJurosCompostos(double valorInvestimento) {
		double taxaJuros = 0.05;
		double totalAtualizadoComJuros;
		int ano = 1, tempoInvestido = 10;

		totalAtualizadoComJuros = valorInvestimento;
		while (ano <= tempoInvestido) {
			totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
			ano++;
		}
		return totalAtualizadoComJuros - valorInvestimento;
	}
		
		public double calculaValorTotalInvestimento( double valorInvestimento, double valorJuros) {
			return valorInvestimento +valorJuros;
		}

}
