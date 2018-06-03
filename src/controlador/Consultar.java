package controlador;

import java.awt.TextArea;
import java.awt.TextField;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import modelo.Articulo;
import modelo.DatoActual;
import modelo.Linea;
import modelo.Pedido;
import modelo.Precio;

public class Consultar extends Acciones{

	//Pueden modificarse tanto el void como la entrada de datos
	
	/**
	 * Pone en el textArea de informacion (en consultar) todos los precios antiguos de x artículo (controlar con el combobox en paraui)
	 * @param articulo
	 * @return
	 */
	public void consultarPreciosAntiguos(Articulo articulo, JTextArea txtInformacion){
		LinkedList<Precio> preciosArticulo=getLogica().preciosArticulo(articulo);
		preciosArticulo.pop(); //Tener cuidado que este quite el último añadido
		String informacion="";
		for (Iterator iterator = preciosArticulo.iterator(); iterator.hasNext();) {
			Precio precio = (Precio) iterator.next();
			informacion.concat(preciosArticulo.toString()+"\n");
		}
		txtInformacion.setText(informacion);
	}
	
	/**
	 * Pone en el textArea de informacion (en consultar) toda la información de todos los artículos de x pedido. Este pedido 
	 * estará controlado en el paraui por el combobox
	 */
	public void consultarPedido(Pedido pedido, JTextArea txtInformacion){
		LinkedList<Articulo> articulos= getLogica().articulosEnPedido(pedido);
		String informacionArticulos="";
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			informacionArticulos.concat(articulo.toString()+"\n");
		}
		txtInformacion.setText(informacionArticulos);
	}
	
	/**
	 * Pone en el textArea (enlazar con panelConsultar) toda la información del artículo
	 * elegir el articulo en el paraui con el combobox
	 * @param articulo
	 * @param txtInformacion
	 */
	public void consultarArticulo(Articulo articulo, JTextArea txtInformacion){
		txtInformacion.setText(articulo.toString());
	}
	
	/**
	 * Llena el combobox de artículos
	 * @param combobox
	 * @param articulos
	 */
	public void rellenarComboboxArticulo(JComboBox<Articulo> combobox, DatoActual datoActual){
		LinkedList<Articulo> articulos= conseguirListaArticulos(datoActual);
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			combobox.addItem(articulo);
		}
	}
	
	/**
	 * Tiene todos los artículos en una lista del pedido de dato actual
	 * @param datoActual
	 */
	public LinkedList<Articulo> conseguirListaArticulos(DatoActual datoActual){
		LinkedList<Articulo> articulos=null;
		for (Iterator iterator = datoActual.getPedidoActual().getLineas().iterator(); iterator.hasNext();) {
			Linea linea = (Linea) iterator.next();
			articulos.add(linea.getArticulo());
			
		}
		
		return articulos;
	}
	public void consultarCliente(){
		
	}
}
