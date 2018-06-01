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
	
	/**
	 * Te da todos los artículos en un peiddo en concreto
	 * @param pedido
	 * @return
	 */
	public LinkedList<Articulo> articulosEnPedido(Pedido pedido){
		return dato.getAlmacenPedidos().getLineaPedidos();
	}
	
	/**
	 * Cambia el último precio de la lista (precioActual)  a un precio nuevo
	 * @param precioNuevo
	 * @param articulo
	 */
	public void cambiarPrecio(Precio precioNuevo,Articulo articulo){
		articulo.getPrecios().pop();
		articulo.getPrecios().add(precioNuevo);
	}
	
	/**
	 * Añade un articulo a un pedido en concreto
	 * @param pedido
	 * @param articulo
	 * @param cantidad
	 */
	public void addArticulo(Pedido pedido, Articulo articulo,int cantidad){
		pedido.getLineas().add(new Linea(articulo, cantidad));
	}
	
}
