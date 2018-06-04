package modelo;

public class DatoActual {

	Cliente clienteActual;
	Pedido pedidoActual;
	Linea lineaActual;
	Articulo articuloActual;
	
	public DatoActual(){
		datosFicticios();
	}
	public Cliente getClienteActual() {
		return clienteActual;
	}
	public void setClienteActual(Cliente clienteActual) {
		this.clienteActual = clienteActual;
	}
	public Pedido getPedidoActual() {
		return pedidoActual;
	}
	public void setPedidoActual(Pedido pedidoActual) {
		this.pedidoActual = pedidoActual;
	}
	public Linea getLineaActual() {
		return lineaActual;
	}
	public void setLineaActual(Linea lineaActual) {
		this.lineaActual = lineaActual;
	}
	public Articulo getArticuloActual() {
		return articuloActual;
	}
	public void setArticuloActual(Articulo articuloActual) {
		this.articuloActual = articuloActual;
	}
	
	public void datosFicticios(){
		
		Cliente clienteNuevo= new Cliente("1", "patata", "Calle pato", "8");
		Pedido pedidoNuevo= new Pedido(0, clienteNuevo);
		Articulo articuloUno= new Articulo(1, "movil", "una cosa maravillosa", 65);
		Linea lineaUno= new Linea(articuloUno, 1);
		
		Articulo articuloDos= new Articulo(3, "botella", "alargado", 89);
		Linea lineaDos= new Linea(articuloDos, 1);
		
		Articulo articuloTres= new Articulo(2, "vaso", "asco", 30);
		Linea lineaTres= new Linea(articuloTres, 1);
		
		pedidoNuevo.insertarLinea(lineaUno);
		pedidoNuevo.insertarLinea(lineaDos);
		pedidoNuevo.insertarLinea(lineaTres);
		
		clienteNuevo.getPedidos().add(pedidoNuevo);
		
		this.setArticuloActual(articuloTres);
		this.setClienteActual(clienteNuevo);
		this.setLineaActual(lineaTres);
		this.setPedidoActual(pedidoNuevo);
		
	}
	
}
