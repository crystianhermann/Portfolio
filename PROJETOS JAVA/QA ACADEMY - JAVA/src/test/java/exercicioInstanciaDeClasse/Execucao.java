package exercicioInstanciaDeClasse;

public class Execucao {

	public static void main(String[] args) {

		Cachorro objCachorro = new Cachorro();

		System.out.println(objCachorro.nome);
		System.out.println(objCachorro.idade);
		
		objCachorro.latir();
		objCachorro.pular();
		objCachorro.deitar();
	}

}
