package ex14.solucao;


// A interface RegistroImpostoBanco e sua implementação BancoDados seguem o Princípio da Substituição de Liskov (LSP),
// permitindo que diferentes formas de registro de impostos sejam intercambiáveis sem afetar a lógica do sistema.
public interface RegistroImpostoBanco {
    void salvar(int ano, int mes, double valor);
}
