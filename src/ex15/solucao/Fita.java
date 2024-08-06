package ex15.solucao;

public class Fita {
    private final String titulo;
    private final CalculoValor calculoValor;

    public Fita(String titulo, CalculoValor calculoValor) {
        this.titulo = titulo;
        this.calculoValor = calculoValor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double calcularValorAluguel(int diasAlugada) {
        return calculoValor.calcular(diasAlugada);
    }
}