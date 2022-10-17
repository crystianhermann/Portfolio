package test_java_easy;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java_easy.Exercicio06_easy;

public class TestExercicio06_easy {
	
	static Exercicio06_easy exercicio06_easy;
	
	@BeforeClass
	public static void before() {
		exercicio06_easy = new Exercicio06_easy();
	}
	
	@Test
	public void testeAprovado(){
		
		String mensagemEsperada = "Voce esta aprovado! Parabens!!!";
		String mensagemAtual = exercicio06_easy.verificaAprovacao(9, 6); ;
		Assert.assertEquals(mensagemEsperada, mensagemAtual);	
	}
	
	@Test
	public void testeReprovado(){
		
		String mensagemEsperada = "Voce esta Reprovado";
		String mensagemAtual = exercicio06_easy.verificaAprovacao(2, 2); ;
		Assert.assertEquals(mensagemEsperada, mensagemAtual);	
	}
	
	@Test
	public void testeExame(){
		
		String mensagemEsperada = "Voce esta de Exame";
		String mensagemAtual = exercicio06_easy.verificaAprovacao(5, 5); ;
		Assert.assertEquals(mensagemEsperada, mensagemAtual);	
	}
	
	@Test
	public void testeErro(){
		
		String mensagemEsperada = "Nao foi possivel calcular sua nota";
		String mensagemAtual = exercicio06_easy.verificaAprovacao(-5, -5); ;
		Assert.assertEquals(mensagemEsperada, mensagemAtual);	
	}
	
	
}
