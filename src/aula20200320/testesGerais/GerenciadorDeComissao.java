package aula20200320.testesGerais;

public class GerenciadorDeComissao {

	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao / 100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda,
			double percentualDeComissao) {
		double conseguiuValorMinimo = valorDaVenda * percentualDeComissao / 100;

		if (conseguiuValorMinimo >= valorMinimo) {
			return conseguiuValorMinimo;
		}

		return valorMinimo;
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda,
			double percentualDeComissao) {
		double valorTotalComissao = valorDaVenda * percentualDeComissao / 100;

		if (valorTotalComissao >= valorMinimo && valorTotalComissao <= valorMaximo) {
			return valorTotalComissao;
		}

		if (valorTotalComissao <= valorMinimo) {
			return valorMinimo;
		}
		return valorMaximo;
	}

}
