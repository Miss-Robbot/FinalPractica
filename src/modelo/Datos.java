package modelo;


public class Datos {

	private AlmacenIndice almacen;
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
	
	
	

}