package controlador;

import java.util.ArrayList;

import javax.swing.JComboBox;

import modelo.Articulo;
import modelo.Precio;

public class Cambiar extends Acciones{

	/**
	 * Llena el combobox de artículos
	 * 
	 * @param combobox
	 * @param articulos
	 */
	public void rellenarComboboxArticulo(JComboBox combobox) {
		combobox.removeAllItems();
		ArrayList<Articulo> articulos= getLogica().getListaArticulos();
		for (Articulo articulo : articulos) {
			combobox.addItem(articulo.toString());
		}
	}
	
}
