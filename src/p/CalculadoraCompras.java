package p;

import java.util.List;

public class CalculadoraCompras {
    public double calcularTotalCompras(List<Compra> compras){
        double totalCompras = 0;
        for (Compra compra: compras) {
            totalCompras = totalCompras + compra.getValor();
        }
        return totalCompras;
    }
}
