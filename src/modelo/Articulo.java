package modelo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

public class Articulo implements Serializable,Indexable<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idArticulo;
	private String nombre;
	private String descripcion;
	private LinkedList<Precio> precios = new LinkedList<Precio>();
	
	public Articulo(){
		
	}

	public Articulo(int idArticulo, String nombre, String descripcion, float precio) {
		super();
		this.idArticulo = idArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		precios.add(new Precio(precio, false));
	}

	public float getOldPrice(GregorianCalendar instant) {
		Iterator<Precio> iterator = precios.iterator();
		boolean encontrado = false;
		float precio = 0;
		while (iterator.hasNext() && !encontrado) {
			Precio next = iterator.next();
			if (next.isInToPeriod(instant)) {
				encontrado = true;
				precio = next.getPrecio();
			}
			;
		}
		return precio;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Articulo elemento=(Articulo)obj;
//		/*boolean retorno=super.equals(elemento);
//		if(!retorno){
//			retorno=idArticulo==elemento.getIdArticulo();
//		}*/
//		return nombre.equals(elemento.getNombre());
//	}
	
	
	
	
	public void insertarNuevoPrecio(float nuevoPrecio, boolean oferta) {
		assert nuevoPrecio > 0;
		precios.getLast().setFechaFinal();
		precios.addLast(new Precio(nuevoPrecio, oferta));
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	

	public float getCurrentPrice() {
		return precios.getLast().getPrecio();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		Articulo other=(Articulo)obj;
		 if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int getIdArticulo() {
		return idArticulo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	
	/**
	 * @return the precios
	 */
	public LinkedList<Precio> getPrecios() {
		return precios;
	}

	/**
	 * @param precios the precios to set
	 */
	public void setPrecios(LinkedList<Precio> precios) {
		this.precios = precios;
	}

	@Override
	public String getKey() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre ;
	}
	
	public String informacionArticulo(){
		return "Nombre: "+nombre+"\n Descripcion: "+descripcion+"\nPrecio actual: "+precios.getFirst().toString();
	}

	

}
