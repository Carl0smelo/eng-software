package p1;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;

    private boolean bomFornecedor;
    private final List<Avaliacao> minhasAvaliacoes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Avaliacao> getMinhasAvaliacoes() {
        return minhasAvaliacoes;
    }

    public void setBomFornecedor(boolean bomFornecedor) {
        this.bomFornecedor = bomFornecedor;
    }

    public boolean isBomFornecedor() {
        return bomFornecedor;
    }
}
