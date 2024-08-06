package p;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private boolean clienteOuro;
	private final List<Compra> minhasCompras = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Compra> getMinhasCompras() {
		return minhasCompras;
	}	
	
	public void setClienteOuro(boolean clienteOuro) {
		this.clienteOuro = clienteOuro;
	}
	
	public boolean isClienteOuro() {
		return clienteOuro;
	}
}
