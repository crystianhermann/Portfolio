package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;

public class TestArrayReferencias {

	public static void main(String[] args) {

		Cliente[] contas = new Cliente[5];

		Cliente cc1 = new Cliente();
		cc1.setNome("Claudio");
		Cliente cc2 = new Cliente();
		cc2.setNome("Augusto");
		Cliente cc3 = new Cliente();
		cc3.setNome("Carlos");

		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		
		Cliente ref = contas[1];
		System.out.println("quantidade " + contas.length);
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(i);
		}

	}
}
