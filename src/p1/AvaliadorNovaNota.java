package p1;

public class AvaliadorNovaNota {

    private final EstrategiaAvaliacao estrategiaAvaliacao;

    public AvaliadorNovaNota(EstrategiaAvaliacao estrategiaAvaliacao) {
        this.estrategiaAvaliacao = estrategiaAvaliacao;
    }

    public void avaliaNotaFornecedor(Avaliacao novaAvaliacao) {
        Fornecedor fornecedor = novaAvaliacao.getFornecedorAvaliado();
        estrategiaAvaliacao.avaliar(fornecedor, novaAvaliacao);
    }
}
