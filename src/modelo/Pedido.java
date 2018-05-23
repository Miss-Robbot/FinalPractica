package modelo;

import java.sql.Date;
import java.util.LinkedList;

public class Pedido {

	private int numero;
	private Date fecha;
	private LinkedList<LineaPedido> lineaPedido;
}
