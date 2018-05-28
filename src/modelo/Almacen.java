package modelo;

import java.util.TreeMap;

public class Almacen{

	//TreeMap Cliente
	//DataNoseque pedido
	private TreeMap<Integer, Cliente> mapa; //El primero es el indice del mapa y el segundo el tipo de objetos que contiene. Ese integer, 
	 										//será igual al dni del cliente.
	
	public Almacen(){
		super();
		mapa= new TreeMap<>();
	}
	
	
}
