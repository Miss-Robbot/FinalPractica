package modelo;

import java.util.LinkedList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Logica {

	private Datos dato;
	
	public Logica(){
		dato= new Datos();
	}

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
	public void darAltaArticulo(Articulo articulo, int cantidad,Cliente cliente,Pedido pedido){
		dato.getMapaCliente().get(cliente.getDniCif()).getPedidos().get(pedido.getNumero()).getLineas().add(new Linea(articulo, cantidad));
	}
	
	/**
	 * Añade un pedido nuevo al Cliente.
	 * @param pedido
	 * @param cliente
	 */
	public void darAltaPedido(Pedido pedido) {
		//datoActual.getClienteActual().getPedidos().add(pedido);
	}
	
	/**
	 * Te da todos los artículos en un pedido en concreto
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
	
	/**
	 * @author macol
	 * @param dni
	 * @param nombre
	 * @param dire
	 * @param tlf
	 */
	public void crearCliente(String dni, String nombre, String dire, String tlf){
		Cliente client = new Cliente(dni, nombre, dire, tlf);
		dato.grabarCliente(client);
	}
	
	/**
	 * @author macol
	 * @param dni
	 * @return
	 */
	public Cliente consultarCliente(String dni){
		return dato.obtenerCliente(dni);
	}
	
	/**
	 * establece el texto de consulta Cliente
	 * faltan cosas
	 * @author macol
	 * @param client
	 * @param jTextArea
	 * @return
	 */
	public JTextArea seleccionarCliente(Cliente client, JTextArea jTextArea) {
		jTextArea.setText(client.toString());
		return jTextArea;
		
	}
	
	/**
	 * crea el comboBox de consultar Cliente
	 * faltan cosas
	 * @author macol
	 * @param comboBox
	 * @param dni
	 * @return
	 */
	public JComboBox obtenerComboBox(JComboBox comboBox, String dni){
		comboBox.addItem(dato.obtenerCliente(dni));
		return comboBox;
	}

	
}
