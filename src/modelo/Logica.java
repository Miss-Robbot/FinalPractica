package modelo;

import java.util.LinkedList;

public class Logica {

	private Datos dato;

	public Datos getDato() {
		return dato;
	}

	public void setDato(Datos dato) {
		this.dato = dato;
	}
	
	
	//Aquí todos los métodos que usen la lógica y tengan que devolver cosas
	
	/**
	 * Le pasas el artículo que quieres y te devuelve su nombre, descripción y proveedor en un String.
	 * @param articulo
	 * @return
	 */
	public String consultarArticulo(Articulo articulo){
		return articulo.toString();
	}
	
	/**
	 * Te devuelve todos los precios de un artículo en concreto
	 * @param articulo
	 * @return
	 */
	public LinkedList<Precio> preciosArticulo(Articulo articulo){
		return articulo.getPrecios();
	}
	
	/**
	 * Añade un artículo a la línea de pedido. Recordar crear una nueva línea de pedido antes, para no sustituir la anterior.
	 * @param articulo
	 * @param cantidad
	 */
	public void darAltaArticulo(Articulo articulo, int cantidad){
		dato.getLinea().setArticulo(articulo);
		dato.getLinea().setCantidad(cantidad);
	}
	
	public LinkedList<Articulo> articulosEnPedido(Pedido pedido){
		return dato.getAlmacenPedidos().getLineaPedidos();
	}
	
	
}
