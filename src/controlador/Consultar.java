package controlador;

import java.util.LinkedList;

import modelo.Articulo;
import modelo.Pedido;
import modelo.Precio;

public class Consultar extends Acciones{

	//Pueden modificarse tanto el void como la entrada de datos
	
	/**
	 * Te dan todos los precios menos el actual
	 * @param articulo
	 * @return
	 */
	public LinkedList<Precio> consultarPreciosAntiguos(Articulo articulo){
		LinkedList<Precio> preciosArticulo=getLogica().preciosArticulo(articulo);
		preciosArticulo.pop(); //Tener cuidado que este quite el último añadido
		return preciosArticulo;
	}
	
	/**
	 * Te da todos los articulos de un Pedido
	 */
	public LinkedList<Articulo> consultarArticulo(Pedido pedido){
		return getLogica().articulosEnPedido(pedido);
	}
	public void consultarCliente(){
		
	}
}
