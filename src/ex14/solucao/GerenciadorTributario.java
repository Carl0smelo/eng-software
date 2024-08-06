package ex14.solucao;

import java.util.List;

// A classe GerenciadorTributario segue o Princípio da Inversão de Dependência (DIP),
// dependendo de abstrações (CalculadoraImposto e RegistroImpostoBanco) e não de implementações concretas.
public class GerenciadorTributario implements IGerenciadorTributario {

	private final CalculadoraImposto calculadoraImposto;
	private final RegistroImpostoBanco registroImpostoBanco;

	public GerenciadorTributario(CalculadoraImposto calculadoraImposto, RegistroImpostoBanco registroImpostoBanco) {
		this.calculadoraImposto = calculadoraImposto;
		this.registroImpostoBanco = registroImpostoBanco;
	}

	@Override
	public void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes) {
		
		double imposto = calculadoraImposto.calcular(vendasMes);
		registroImpostoBanco.salvar(ano, mes, imposto);
	}
}
