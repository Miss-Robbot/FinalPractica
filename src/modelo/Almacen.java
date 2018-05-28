package modelo;

import java.util.TreeMap;

public class Almacen <T,K>{

	//TreeMap Cliente
	//DataNoseque pedido
	private String pathIndiceDni;
	private Cliente pathCliente;
	private TreeMap<K, Integer> indice;
	
	public Almacen(String pathIndiceDni, Cliente pathCliente){
		super();
		this.pathIndiceDni= pathIndiceDni;
		this.pathCliente= pathCliente;
	}
	
	
}
