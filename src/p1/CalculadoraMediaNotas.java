package p1;

import java.util.List;

public class CalculadoraMediaNotas {

    public static double calcularMedia(List<Avaliacao> avaliacoes) {
        int totalNotas = 0;
        int contadorNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            totalNotas += avaliacao.getNota();
            contadorNotas++;
        }
        return contadorNotas > 0 ? (double) totalNotas / contadorNotas : 0;
    }
}