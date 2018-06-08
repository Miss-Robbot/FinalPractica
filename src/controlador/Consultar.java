package controlador;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import modelo.*;

public class Consultar extends Acciones {

	// Pueden modificarse tanto el void como la entrada de datos

	/**
	 * Pone en el textArea de informacion (en consultar) todos los precios
	 * antiguos de x artículo (controlar con el combobox en paraui)
	 * 
	 * @param articulo
	 * @return
	 */
	public void consultarPreciosAntiguos(Articulo articulo,
			JTextArea txtInformacion) {
		/*LinkedList<Precio> preciosArticulo = getLogica()
				.preciosArticulo(articulo);
		preciosArticulo.pop(); // Tener cuidado que este quite el último añadido
		String informacion = "";
		for (Iterator iterator = preciosArticulo.iterator(); iterator
				.hasNext();) {
			Precio precio = (Precio) iterator.next();
			informacion.concat(preciosArticulo.toString() + "\n");
		}
		txtInformacion.setText(informacion);*/
	}

	/**
	 * Pone en el textArea de informacion (en consultar) toda la información de
	 * todos los artículos de x pedido. Este pedido estará controlado en el
	 * paraui por el combobox
	 */
	public void consultarPedido(Pedido pedido, JTextArea txtInformacion) {
		//LinkedList<Articulo> articulos = getLogica().articulosEnPedido(pedido);
		/*String informacionArticulos = "";
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			informacionArticulos.concat(articulo.toString() + "\n");
		}
		txtInformacion.setText(informacionArticulos);*/
	}

	/**
	 * Pone en el textArea (enlazar con panelConsultar) toda la información del
	 * artículo elegir el articulo en el paraui con el combobox
	 * 
	 * @param articulo
	 * @param txtInformacion
	 */

	public void consultarArticulo(Articulo articulo, JTextArea txtInformacion) {
		//txtInformacion.setText(articulo.toStringDos());

	}

	/**
	 * Llena el combobox de artículos
	 * 
	 * @param combobox
	 * @param articulos
	 */
	public void rellenarComboboxArticulo(JComboBox<Articulo> combobox, Cliente cliente, int posicion) {
		/*LinkedList<Articulo> articulos = getLogica().conseguirListaArticulos(cliente, posicion);
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			combobox.addItem(articulo);
		}*/
	}

	/*public void rellenarComboboxPedido(JComboBox<Pedido> comboBox,
			DatoActual datoActual) {
		LinkedList<Pedido> pedidos = conseguirListaPedidos();
		for (Iterator iterator = pedidos.iterator(); iterator.hasNext();) {
			Pedido pedido = (Pedido) iterator.next();
			comboBox.addItem(pedido);
		}
	}*/

	
	/*
	 * 
	 */
	/*public LinkedList<Pedido> conseguirListaPedidos() {
		LinkedList<Pedido> pedidos = new LinkedList<Pedido>();

		for (Iterator iterator = getLogica().getDatoActual().getClienteActual()
				.getPedidos().iterator(); iterator.hasNext();) {
			Pedido pedido = (Pedido) iterator.next();
			pedidos.add(pedido);

		}
		return pedidos;
	}*/
	public void rellenarComboboxCliente(JComboBox<Cliente> comboBox) {

		/*LinkedList<Cliente> clientes = conseguirListaClientes();
		for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			comboBox.addItem(cliente);
				}*/
			}




	private LinkedList<Cliente> conseguirListaClientes() {
		LinkedList<Cliente> clientes = new LinkedList<Cliente>();
		/*for (Iterator iterator = getLogica().getDatoActual().getClienteActual(); iterator.hasNext();) {
		Cliente cliente = (Cliente) iterator.next();
		clientes.add(cliente);}*/
			
		return clientes;
	}

}
