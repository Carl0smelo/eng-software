package ex14.solucao;

import java.util.List;

// A interface CalculadoraImposto segue o Princípio Aberto/Fechado (OCP),
// permitindo a extensão do cálculo de impostos sem modificar o código existente.
public interface CalculadoraImposto {
    double calcular(List<Venda> vendas);
}
