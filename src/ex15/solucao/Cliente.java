package ex15.solucao;

import java.util.Collection;
import java.util.Vector;

public class Cliente {
    private final String nome;
    private final Collection<Aluguel> fitasAlugadas = new Vector<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.lineSeparator();
        double valorTotal = 0.0;

        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + fimDeLinha);

        for (Aluguel fita : fitasAlugadas) {
            double valorCorrente = fita.calcularValor();

            resultado.append(fita.getTituloFita()).append(": ").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }

        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        return resultado.toString();
    }
}