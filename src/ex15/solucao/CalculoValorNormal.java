package ex15.solucao;

public class CalculoValorNormal implements CalculoValor{

    @Override
    public double calcular(int diasAlugada) {
        double valorCorrente = 2;
        if(diasAlugada > 2) {
            valorCorrente += (diasAlugada - 2) * 1.5;
        }
        return valorCorrente;    }
}