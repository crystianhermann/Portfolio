package java_medium;

public class Exercicio07_08_medium {
	public String [] criaVetorMeses() {

		String[] vetorMeses;
		vetorMeses = new String[12];

		vetorMeses[0] = "Janeiro";
		vetorMeses[1] = "Fevereiro";
		vetorMeses[2] = "Mar�o";
		vetorMeses[3] = "Abril";
		vetorMeses[4] = "Maio";
		vetorMeses[5] = "Junho";
		vetorMeses[6] = "Julho";
		vetorMeses[7] = "Agosto";
		vetorMeses[8] = "Setembro";
		vetorMeses[9] = "Outubro";
		vetorMeses[10] = "Novembro";
		vetorMeses[11] = "Dezembro";
		return vetorMeses;
	}

	public void imprimeValoresVetor(String [] vetorMeses) {
		int i = 0;
		while (i <= 11) {
			System.out.println("O m�s: " + (i + 1) + " - " + vetorMeses[i]);
			i++;
		}
	}
}
