package controlador;

public interface Accionable {

	/**
	 * Entra en un artículo y ve todos los precios que ha tenido
	 */
	public void consultarPreciosAntiguos();
	
	/**
	 * Mira todas las especificaciones de un artículo
	 */
	public void consultarArticulo();
	
	/**
	 * Mira todos los datos de un cliente en concreto
	 */
	public void consultarCliente();
	
	/**
	 * Pone un pedido nuevo asociado a un cliente
	 */
	public void insertarLineaPedido();
	
	/**
	 * Cambia el precio actual de un artículo y añade el precio anterior a 
	 * los precios antiguos.
	 */
	public void cambiarPrecioArticulo();
	
	/**
	 * Borra un cliente de nuestra "base de datos" (fichero)
	 */
	public void borrarCliente();
	
	/**
	 * Crea un nuevo pedido
	 */
	public void darAltaPedido();
	
	/**
	 * Crea un nuevo cliente
	 */
	public void darAltaCliente();
	
	/**
	 * Crea un nuevo artículo
	 */
	public void darAltaArticulo();
	
}
