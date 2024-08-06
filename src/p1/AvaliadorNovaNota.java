package p1;

import java.util.List;

public class AvaliadorNovaNota {

    public void avaliaNotaFornecedor(Avaliacao novaAvaliacao) {
        Fornecedor fornecedor = novaAvaliacao.getFornecedorAvaliado();

        // Calcula média de notas do fornecedor
        List<Avaliacao> avaliacoes = fornecedor.getMinhasAvaliacoes();
        int totalNotas = 0;
        int contadorNotas = 0;
        for (Avaliacao avaliacao: avaliacoes) {
            totalNotas = totalNotas + avaliacao.getNota();
            contadorNotas = contadorNotas + 1;
        }
        double mediaNotas = 0;
        if (contadorNotas > 0)
            mediaNotas = totalNotas/contadorNotas;

        //Decide se a nova nota enquadra o fornecedor como bom fornecedor
        if (mediaNotas >= 5 && novaAvaliacao.getNota() > 9) {
            fornecedor.setBomFornecedor(true);
        }
    }
}
