package modelo;

import java.util.ArrayList;
import java.util.Iterator;
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

	public int getNumeroArticulo() {
		return dato.getNumeroArticulo();
	}

	public boolean grabar(Articulo articulo) {
		return dato.grabar(articulo);
	}
	
	
	
	
	//Aquí todos los métodos que usen la lógica y tengan que devolver cosas



	
}
