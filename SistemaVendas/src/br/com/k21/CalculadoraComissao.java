package br.com.k21;

public class CalculadoraComissao {

	private static final int LIMITE_FAIXA_1 = 10000;
	private static final double COMISSAO_FAIXA_1 = 0.05;
	private static final double COMISSAO_FAIXA_2 = 0.06;

	public static double calcularComissao(double valorVenda) 
	{
		if (valorVenda <= LIMITE_FAIXA_1) {
			return COMISSAO_FAIXA_1 * valorVenda;
		} else {
			return COMISSAO_FAIXA_2 * valorVenda;
		}
	}

}
