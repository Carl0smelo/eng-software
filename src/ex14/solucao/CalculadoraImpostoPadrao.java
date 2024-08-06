package ex14.solucao;

import java.util.List;

// Classe CalculadoraImpostoPadrao segue o Princípio da Responsabilidade Única (SRP),
// pois é responsável apenas por calcular o imposto baseado nas vendas.
public class CalculadoraImpostoPadrao implements CalculadoraImposto {

    @Override
    public double calcular(List<Venda> vendas) {
        double imposto = 0;
        for (Venda venda : vendas) {
            if (venda.getValor() < 1000)
                imposto += 0.05 * venda.getValor();
            else
                imposto += 0.07 * venda.getValor();
        }
        return imposto;
    }
}