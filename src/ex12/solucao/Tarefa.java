package ex12.solucao;

public class Tarefa {
	
	private String nome;
	private Funcionario responsavel;
	private double horasTrabalhadas;
	private boolean completa = false;
	private final ILog log;
	private final IEmail email;

	public Tarefa(ILog log, IEmail email) {
		this.log = log;
		this.email = email;
	}

    public void realizarTrabalho(double horas)
    {
        this.horasTrabalhadas += horas;
        log.log("Trabalho realizado em " + nome + ".");
    }

    public void completarTarefa() {
        completa = true;
        log.log("Tarefa " + nome + " completa.");
		email.enviarEmail(responsavel, "A tarefa " + nome + " foi finalizada.");
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public boolean isCompleta() {
		return completa;
	}
	
	
}
