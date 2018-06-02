package modelo;

import utiles.Constantes;

public class Datos {

	private Constantes constantes;
	private AlmacenIndice<Cliente, String> almacen;
	private AlmacenPedidos almacenPedidos;
	private Linea linea;
	private Articulo articulo;
	
	public AlmacenIndice getAlmacen() {
		return almacen;
	}
	public void setAlmacen(AlmacenIndice almacen) {
		this.almacen = almacen;
	}
	public Linea getLinea() {
		return linea;
	}
	public void setLinea(Linea linea) {
		this.linea = linea;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public AlmacenPedidos getAlmacenPedidos() {
		return almacenPedidos;
	}
	public void setAlmacenPedidos(AlmacenPedidos almacenPedidos) {
		this.almacenPedidos = almacenPedidos;
	}
	
	/**
	 * @author macol
	 * @param cliente
	 */
	
	public void grabarCliente(Cliente cliente){
		almacen = new AlmacenIndice<>(constantes.getClientesDat(), constantes.getIndiceDat());
		almacen.grabar(cliente, cliente.getDniCif());
	}
	
	/**
	 * @author macol
	 * @param dni
	 * @return
	 */
	public Cliente obtenerCliente(String dni){
		return almacen.obtener(dni);
	}
	

}