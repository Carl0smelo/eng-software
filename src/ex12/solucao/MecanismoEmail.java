package ex12.solucao;

public class MecanismoEmail implements IEmail {

	@Override
	public void enviarEmail(Funcionario funcionario, String mensagem){
		System.out.println("Simulando o envio de email para " + funcionario.getNome());
	}
}
