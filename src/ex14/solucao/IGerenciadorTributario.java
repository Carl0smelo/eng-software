package ex14.solucao;

import java.util.List;

// A interface IGerenciadorTributario segue o Princípio da Segregação de Interface (ISP),
// definindo apenas os métodos necessários para a gestão tributária.
public interface IGerenciadorTributario {
    void registraTotalImpostoMes(int ano, int mes, List<Venda> vendasMes);
}
