package ex11.solucao;

import java.time.LocalDateTime;

public interface IEmprestavel extends IItemBiblioteca{
    void emprestar(String usuarioEmprestimo);
    void devolver();
    LocalDateTime getDataDevolver();
    int getDuracaoEmprestimoEmDias();
    void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias);
    String getUsuarioEmprestimo();
    void setUsuarioEmprestimo(String usuarioEmprestimo);
    LocalDateTime getDataEmprestimo();
    void setDataEmprestimo(LocalDateTime dataEmprestimo);
}
