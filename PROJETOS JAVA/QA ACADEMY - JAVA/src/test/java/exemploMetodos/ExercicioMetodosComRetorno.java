package exemploMetodos;

public class ExercicioMetodosComRetorno {

	public static String primeiroMetodo() {
		String mensagem = "primeiroMetodo";
		return mensagem;
	}

	public static int segundoMetodo() {
		return 2;
	}

	public static double terceiroMetodo() {
		return 3.0;
	}

	public static boolean quartoMetodo() {
		return true;
	}

	public static String quintoMetodo() {
		return "Quinto Método";
	}

	public static void main(String[] args) {
		System.out.println(primeiroMetodo());
		System.out.println(segundoMetodo());
		System.out.println(terceiroMetodo());
		System.out.println(quartoMetodo());
		System.out.println(quintoMetodo());
		
	}
}
