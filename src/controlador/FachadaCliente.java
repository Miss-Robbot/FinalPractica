package controlador;

import almacen.AlmacenIndice;
import modelo.Cliente;
import utiles.Constantes;

public class FachadaCliente{
	
	private Constantes constantes;
	private AlmacenIndice<Cliente, String> almacenCliente;
	
	public FachadaCliente() {
		super();
		almacenCliente= new AlmacenIndice<>(constantes.getIndiceDat(), constantes.getClientesDat());
	}

	public boolean borrar(String key) {
		return almacenCliente.borrar(key);
	}

	public Cliente consultar(String key) {
		return almacenCliente.obtener(key);
	}

	public boolean darAlta(Cliente cliente) {
		return almacenCliente.grabar(cliente, cliente.getKey());
	}

}
