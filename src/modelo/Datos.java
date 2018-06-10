package modelo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import almacen.AlmacenIndice;
import almacen.AlmacenIndividual;
import almacen.AlmacenIndividualSet;
import almacen.AlmacenRutaDestino;
import almacen.AlmacenRutaMapeada;

//La suite de test tiene que daos en verde. Luego podeis probar esta clase
public class Datos {
	// VAmos a expresar los diferentes almacenes
	private String pathIndiceCliente = "/data/clientes/index.data";
	private String pathDatosCliente = "/data/clientes/clientes.data";
	private String pathDatosProveedores = "/data/proveedores/proveedores.data";
	private String pathMapaArticulos = "/data/articulos";
	private String pathArchivosMapaArticulos = "/articulos.map";
	private String pathPedidos = "/data/pedidos";
	private String pathNumeroPedido = "/data/pedidos/numPedido.data";
	//private int numeroUltimoPedido = 0;

	// Cliente
	private AlmacenIndice<Cliente, String> clientes;
	// Proveedores
	private AlmacenIndividualSet<Proveedor> proveedores;
	// Articulo
	private AlmacenRutaMapeada<Articulo, String> articulos;
	// Pedidos
	private AlmacenRutaDestino<Pedido> pedidos;
	// numeroUltimoPedido
	private AlmacenIndividual<Integer> numeroPedido;

	public Datos() {

		clientes = new AlmacenIndice<Cliente, String>(pathIndiceCliente,
				pathDatosCliente);
		proveedores = new AlmacenIndividualSet<>(new TreeSet<Proveedor>(),
				pathDatosProveedores);
		articulos = new AlmacenRutaMapeada<>("art", pathMapaArticulos,
				pathArchivosMapaArticulos);
		pedidos = new AlmacenRutaDestino<>(pathPedidos, "ped");
//		numeroPedido = new AlmacenIndividual<>();
//		Integer obtener = numeroPedido.obtener(pathNumeroPedido);
//		if (obtener == null) {
//			numeroPedido.grabar(pathNumeroPedido, 0);
//		}
	}

	public boolean grabar(Cliente cliente) {
		return clientes.grabar(cliente, cliente.getKey());
	}

	public boolean grabar(Proveedor proveedor) {
		return proveedores.grabar(proveedor);
	}

	public boolean grabar(Articulo articulo) {
		return articulos.grabar(articulo, articulo.getKey(),
				articulo.getIdArticulo());
	}

	public boolean grabar(Pedido pedido) {
		return pedidos.grabar(pedido.getCliente().getDni(),
				String.valueOf(pedido.getNumero()), pedido);
	}

	public boolean grabar(Integer integer) {
		return numeroPedido.grabar(pathNumeroPedido, integer);
	}

	/// Igual con el resto de metodos de obtener. Pondre uno de prueba
	public void obtener(Cliente cliente, String clave) {
		cliente = clientes.obtener(clave);
	};

	public void obtener(Pedido pedido, String dniCliente, int numeroPedido) {
		pedido = pedidos.obtener(dniCliente, String.valueOf(numeroPedido));
	}

	// hecho por alicia
	public Articulo obtener(String nombreArticulo) {
		return articulos.obtener(nombreArticulo);
	}

	public String getPathMapaArticulos() {
		return pathMapaArticulos;
	}

	public String getPathArchivosMapaArticulos() {
		return pathArchivosMapaArticulos;
	}

	public AlmacenRutaMapeada<Articulo, String> getArticulos() {
		return articulos;
	}

	public int getNumeroArticulo() {
		return articulos.obtenNumero();
	}

	public Set<String> keySet() {
		return articulos.keySet();
	}

	public ArrayList<Articulo> getListaArticulos() {
		ArrayList<Articulo> articulos = new ArrayList<Articulo>();
		for (String clave : this.keySet()) {
			Articulo articulo = obtener(clave);
			if(articulo!=null)
				articulos.add(articulo);
		}
		return articulos;
	}
	
	public int getNumeroPedido() {
		return pedidos.obtenNumero();
	}

}
