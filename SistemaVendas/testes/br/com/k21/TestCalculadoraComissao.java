package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void testCalcularValorComisaoEntrada1000Saida50() {
		double valorVenda  = 1000 ;
		double esperado = 51;

		double valorRetornado = CalculadoraComissao.calcularComissao(valorVenda);

		assertEquals(esperado, valorRetornado, 0);
	}

	@Test
	public void testCalcularValorComisaoEntrada1Saida5Cents() {
		double valorVenda  = 1;
		double esperado = 0.05;

		double valorRetornado = CalculadoraComissao.calcularComissao(valorVenda);

		assertEquals(esperado, valorRetornado, 0);
	}

	@Test
	public void testCalcularValorComisaoEntrada10001Saida600Reais06Cents() {
		double valorVenda  = 10001;
		double esperado = 600.06;

		double valorRetornado = CalculadoraComissao.calcularComissao(valorVenda);

		assertEquals(esperado, valorRetornado, 0);
	}

}
