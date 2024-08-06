package ex10.solucao;

import java.io.IOException;

public class Programa {

    public static void main(String[] args) {
        InteracaoUsuario interacao = new InteracaoUsuario();
        Pessoa usuario = null;
        try {
            usuario = interacao.obterDadosPessoa();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler os dados do usuário.");
        }

        interacao.exibirIdUsuario(usuario);
    }
}