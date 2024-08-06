package p;

public class AvaliadorCliente {

	private final CriterioCliente criterioCliente;
	private final CalculadoraCompras calculadoraCompras;

    public AvaliadorCliente(CriterioCliente criterioCliente, CalculadoraCompras calculadoraCompras) {
        this.criterioCliente = criterioCliente;
        this.calculadoraCompras = calculadoraCompras;
    }

    public void avaliaCliente(Cliente novoCliente) {
		double totalCompras = calculadoraCompras.calcularTotalCompras(novoCliente.getMinhasCompras());
		novoCliente.setClienteOuro(criterioCliente.consultarStatusCliente(totalCompras));
	}
}