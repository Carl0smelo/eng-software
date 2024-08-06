package ex14.solucao;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("10/05/2023", 11.5));
        vendas.add(new Venda("12/05/2023", 8.5));
        vendas.add(new Venda("12/05/2023", 1000.0));

        CalculadoraImposto calculadoraImposto = new CalculadoraImpostoPadrao();
        RegistroImpostoBanco registroImpostoBanco = new BancoDados();

        IGerenciadorTributario impostos = new GerenciadorTributario(calculadoraImposto, registroImpostoBanco);
        impostos.registraTotalImpostoMes(2023, 5, vendas);

    }

}
