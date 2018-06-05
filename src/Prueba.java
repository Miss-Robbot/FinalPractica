import java.awt.EventQueue;

import modelo.Cliente;
import modelo.Logica;
import modelo.Pedido;
import vista.prueba;
import vista.vistaUI;

public class Prueba {
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaUI frame = new vistaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public static void main(String[] args) {
		Logica logica= new Logica();
		Cliente cliente=new Cliente("hola", "weje", "ñjakdf", "56454532");
		Pedido pedido= new Pedido(1, cliente);
		
		logica.getDato().getMapaCliente().put(cliente.getDniCif(),cliente );
		logica.getDato().getMapaCliente().get(cliente.getDniCif()).getPedidos().add(pedido);
		System.out.println(logica.conseguirListaArticulos(cliente, pedido));
	}
}
