package ex15.questao;

public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double calcularValor() {
        return fita.calcularValorAluguel(diasAlugada);
    }

    public String getTituloFita() {
        return fita.getTitulo();
    }
}

