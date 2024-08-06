package ex15.solucao;

public class CalcularValorLancamento implements CalculoValor{

    @Override
    public double calcular(int diasAlugada) {
        return diasAlugada * 3;
    }
}