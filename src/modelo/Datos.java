package modelo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import almacen.AlmacenIndice;
import almacen.AlmacenIndividualSet;
import almacen.AlmacenRutaDestino;
import almacen.AlmacenRutaMapeada;

//La suite de test tiene que daos en verde. Luego podeis probar esta clase
public class Datos {
	// VAmos a expresar los diferentes almacenes
	
	private String pathIndiceCliente = "index.data";
	private String pathDatosCliente = "clientes.data";
	private String pathDatosProveedores = "/data/proveedores/proveedores.data";
	private String pathMapaArticulos = "/data/articulos";
	private String pathArchivosMapaArticulos = "/articulos.map";
	private String pathPedidos = "/data/pedidos";
	private String pathNumeroPedido = "/data/pedidos/numPedido.data";
	//private int numeroUltimoPedido = 0;

	// Cliente
	private int index=0;
	private ArrayList<Integer> anadidos = new ArrayList<>();
	private TreeMap<String, String> mapaCliente= new TreeMap<>();//mapa de keys
	private AlmacenIndice<Cliente, String> clientes;
	// Proveedores
	private AlmacenIndividualSet<Proveedor> proveedores;
	// Articulo
	private AlmacenRutaMapeada<Articulo, String> articulos;
	// Pedidos
	private AlmacenRutaDestino<Pedido> pedidos;
	// numeroUltimoPedido
	//private AlmacenIndividual<Integer> numeroPedido;
	private int numeroPedido=1;

	public Datos() {

		//Yolanda yolanda
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
//			//numeroPedido.grabar(pathNumeroPedido, 0);
//		}

	}

	public boolean grabar(Cliente cliente) {
		return clientes.grabar(cliente,
				cliente.getKey());
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

//	public boolean grabar(Integer integer) {
//		return numeroPedido.grabar(pathNumeroPedido, integer);
//	}

	/// Igual con el resto de metodos de obtener. Pondre uno de prueba
	public Cliente obtener1(String clave) {
		return clientes.obtener(clave);
	};

	public Pedido obtener(String dniCliente, String numeroPedido) {
		return pedidos.obtener(dniCliente, numeroPedido);
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
		//return pedidos.obtenNumero();
		return numeroPedido;
	}
	
	public void aumentarNumeroPedido() {
		//return pedidos.obtenNumero();
		numeroPedido++;
	}

	
	public ArrayList<Pedido> getListaPedidos() {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		for (String clave : this.keySet()) {
			Pedido pedido = obtener("80079711J",clave);
			if(pedido!=null)
				pedidos.add(pedido);
		}
		return pedidos;
	}
	
	public TreeMap<String, String> getMapaCliente() {
		return mapaCliente;
	}
	public void setMapaCliente(TreeMap<String, String> mapaCliente) {
		this.mapaCliente = mapaCliente;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public ArrayList<Integer> getAnadidos() {
		return anadidos;
	}
	public void setAnadidos(ArrayList<Integer> anadidos) {
		this.anadidos = anadidos;
	}
	public void grabarCliente(Cliente cliente){
		this.mapaCliente.put(String.valueOf(index), cliente.getKey());
	}
	public String obtenerClienteKey(String index, Datos dato){
		return this.mapaCliente.get(index);
	}

}
