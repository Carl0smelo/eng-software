package ex12.solucao;

public class MecanismoLog implements ILog {

	@Override
	public void log(String mensagem) {
		System.out.println(mensagem);
	}
}
