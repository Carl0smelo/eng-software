package ex15.solucao;

public class CalculoValorInfantil implements CalculoValor {

    @Override
    public double calcular(int diasAlugada) {
        double valorCorrente = 1.5;
        if (diasAlugada > 3) {
            valorCorrente += (diasAlugada - 3) * 1.5;
        }
        return valorCorrente;
    }
}