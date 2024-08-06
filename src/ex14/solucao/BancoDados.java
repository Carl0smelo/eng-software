package ex14.solucao;

public class BancoDados implements RegistroImpostoBanco {

	@Override
	public void salvar(int ano, int mes, double valor) {
		System.out.println("Simulando o registro em banco de dados: " + ano + "/" + mes + " " + valor);
	}
}
