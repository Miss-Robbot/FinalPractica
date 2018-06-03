package modelo;

import java.io.Serializable;
import java.util.LinkedList;

public class Cliente implements Serializable {
	private String dniCif;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private LinkedList<Pedido> pedidos;

	public LinkedList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente(String dniCif, String razonSocial, String direccion, String telefono) {
		super();
		this.dniCif = dniCif;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDniCif() {
		return dniCif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		boolean retorno = super.equals(obj);
		if(!retorno){
			retorno = this.dniCif.equals(cliente.dniCif);
		}
		return retorno;
	}

	@Override
	public int hashCode() {
		return dniCif.hashCode();
	}

	@Override
	public String toString() {
		return razonSocial+": DNI/NIF: "+dniCif+". Direccion: "+direccion+". Telefono: "+telefono;
	}
}
