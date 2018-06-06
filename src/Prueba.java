import java.awt.EventQueue;

import controlador.ParaUI;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Linea;
import modelo.Logica;
import modelo.Pedido;
import vista.prueba;
import vista.vistaUI;

public class Prueba {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUI frame = new ParaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*public static void main(String[] args) {
		Logica logica= new Logica();
		Cliente cliente=new Cliente("hola", "weje", "ñjakdf", "56454532");
		Pedido pedido= new Pedido(0, cliente);
		Articulo articulo= new Articulo(0, "patata", "jejejeje", 5);
		logica.getDato().getMapaCliente().put(cliente.getDniCif(),cliente );
		logica.getDato().getMapaCliente().get(cliente.getDniCif()).getPedidos().add(pedido);
		logica.getDato().getMapaCliente().get(cliente.getDniCif()).getPedidos().get(pedido.getNumero()).insertarLinea(new Linea(articulo, 2));
		System.out.println(logica.getDato().getMapaCliente().get(cliente.getDniCif()));
		System.out.println(logica.conseguirListaArticulos(cliente, pedido));
	}*/
}
