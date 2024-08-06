package p;

public class CriterioClientePadrao implements CriterioCliente{

    @Override
    public boolean consultarStatusCliente(double totalCompras) {
        return totalCompras >= 1000;
    }
}
