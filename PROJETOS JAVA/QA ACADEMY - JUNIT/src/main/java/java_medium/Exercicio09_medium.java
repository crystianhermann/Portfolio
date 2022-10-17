package java_medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
	public void RecebeImprimeNomeNumero() {

		String[] alunosVetor = new String[5];

		int[] numeroAlunosVetor = new int[5];
		int i = 0;

		while (i < 5) {
			alunosVetor[i] = RecebeAluno();
			numeroAlunosVetor[i] = RecebeNumeroDoAluno();
			i++;
		}

		imprimeNomeNumero(alunosVetor, numeroAlunosVetor);
	}

	private void imprimeNomeNumero(String[] vetorNomes, int[] vetorNumeros) {
		int i = 0;
		while (i < 5) {
			System.out.println("Nome do aluno: " + vetorNomes[i] + " - " + "Numero do aluno: " + vetorNumeros[i]);
			i++;
		}
	}

	private int RecebeNumeroDoAluno() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
	}

	private String RecebeAluno() {
		return JOptionPane.showInputDialog("Digite o nome do aluno");
	}
}
