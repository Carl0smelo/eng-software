package ex10.solucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteracaoUsuario {

    private final BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public Pessoa obterDadosPessoa() throws IOException {
        Pessoa usuario = new Pessoa();

        System.out.println("Seja bem-vinda ou bem-vindo.");

        System.out.println("Qual é seu primeiro nome?");
        usuario.setPrimeiroNome(teclado.readLine());

        System.out.println("Qual é seu último nome?");
        usuario.setUltimoNome(teclado.readLine());

        if (usuario.getPrimeiroNome().isEmpty() || usuario.getUltimoNome().isEmpty()) {
            System.out.println("Você não forneceu um nome válido.");
            return null;
        }

        return usuario;
    }

    public void exibirIdUsuario(Pessoa usuario) {
        if (usuario != null) {
            System.out.println("Seu id de usuário é " + usuario.getPrimeiroNome().charAt(0) + usuario.getUltimoNome());
        }
    }
}