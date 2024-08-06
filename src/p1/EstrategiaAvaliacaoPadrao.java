package p1;

import java.util.List;

public class EstrategiaAvaliacaoPadrao implements EstrategiaAvaliacao {

    @Override
    public void avaliar(Fornecedor fornecedor, Avaliacao novaAvaliacao) {
        List<Avaliacao> avaliacoes = fornecedor.getMinhasAvaliacoes();
        double mediaNotas = CalculadoraMediaNotas.calcularMedia(avaliacoes);

        if (mediaNotas >= 5 && novaAvaliacao.getNota() > 9) {
            fornecedor.setBomFornecedor(true);
        }
    }
}