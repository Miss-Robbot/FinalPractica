package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Linea;
import modelo.Pedido;
import modelo.Precio;
import validacion.Validador;
import validacion.Validator;
import vista.UI;

public class ParaUI extends UI{

	private Acciones acciones=new Acciones(); //Esto es para coger la logica 
	private Validador validador= new Validador();

	Validator validator = new Validator();

	private Borrar borrar=new Borrar();
	private Cambiar cambiar=new Cambiar();
	private Consultar consultar=new Consultar();
	private DarAlta darAlta= new DarAlta();
	private Insertar insertar= new Insertar();

	private FachadaCliente fachada = new FachadaCliente();
	
	//Yolanda
	private Cliente clientePrueba = new Cliente("80079711J", "Yolanda");
	private Articulo articuloPrueba = new Articulo(1, "pc", "superChulo", 100);
	private Linea lienaPrueba = new Linea(articuloPrueba, 20);
	
	public ParaUI(){
		
		Cliente cliente = new Cliente("12345678U", "Carmen" +"C/Piruleta"+ "629629421");
		cliente.setNombre("Carmen");
		Cliente cliente2 = new Cliente("87654321E", "Elliot"+ "C/Mesados"+ "640800320");
		cliente2.setNombre("Elliot");
		
		acciones.grabar(cliente);
		acciones.getLogica().getDato().grabarCliente(cliente);
		acciones.getLogica().getDato().setIndex(acciones.getLogica().getDato().getIndex()+1);
		acciones.grabar(cliente2);
		acciones.getLogica().getDato().grabarCliente(cliente2);
		acciones.getLogica().getDato().setIndex(acciones.getLogica().getDato().getIndex()+1);
		
		btnInicio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelInicio.setVisible(true);
				
			}
		});
		
		btnCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelCliente.setVisible(true);
				
			}
		});

		panelCliente.getBtnDarAlta().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				altaCliente.setVisible(true);
				
			}
		});
		
		panelCliente.getBtnConsultarCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
				
			}
		});
		
		panelCliente.getBtnBorrarCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				borrarCliente.setVisible(true);
				
			}
		});
		
panelCliente.getBtnDarAlta().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				altaCliente.setVisible(true);
				altaCliente.getBtnDarDeAlta().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String nombre = altaCliente.getTxtNombre().getText();
						String dni = altaCliente.getTxtDNI().getText();
						String dire = altaCliente.getTxtDireccion().getText();
						String tlf = altaCliente.getTxtTelf().getText();
						altaCliente.vaciarTextos();
						
						if(validator.isPhone(tlf)&&!validator.isNumber(nombre)){
							
							Cliente client = new Cliente(dni, acciones.getLogica().crearDatos( dni,nombre, dire, tlf));
							client.setNombre(nombre);
							acciones.grabar(client);
							acciones.getLogica().getDato().grabarCliente(client);
							acciones.getLogica().getDato().setIndex(acciones.getLogica().getDato().getIndex()+1);
							
							altaCliente.setLblError("");
							todosInvisibles();
							panelCliente.setVisible(true);
						}else{
							altaCliente.setLblError("Ha habido un error dando de alta al cliente");
						}
					}
				});
			}
		});
		
		panelCliente.getBtnConsultarCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
				panelConsultar.setTxtInformacion("");
				panelConsultar.getBtnVolver().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						todosInvisibles();
						panelCliente.setVisible(true);
						
						
					}
				});
				
				
				if(panelConsultar.getComboBox().getItemCount()==0)
				consultar.rellenarComboboxCliente(panelConsultar.getComboBox(), acciones);
				
				panelConsultar.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						panelConsultar.getTxtInformacion().setText("");
						Cliente cliento = new Cliente();
						cliento = (Cliente) panelConsultar.getComboBox().getSelectedItem();
						panelConsultar.getTxtInformacion().setText(acciones.getLogica().conseguirInfo(cliento));
						
					}
				});
			}
			
		});
		
		
panelCliente.getBtnBorrarCliente().addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				borrarCliente.getBtnVolver().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						todosInvisibles();
						panelCliente.setVisible(true);
						
						
					}
				});
				
				//borrarCliente.setTextArea("");
				if(panelConsultar.getComboBox().getItemCount()==0)
				consultar.rellenarComboboxCliente(borrarCliente.getComboBox(), acciones);
				
				borrarCliente.setVisible(true);
				borrarCliente.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//logica.borrarCliente(borrar.getComboBox(), borrar.getComboBox().getSelectedItem().toString());
						if(acciones.borrar((Cliente) panelConsultar.getComboBox().getSelectedItem())){
							consultar.rellenarComboboxCliente(borrarCliente.getComboBox(), acciones);
						
						borrarCliente.setTextArea("La operación se ha realizado con éxito");
						todosInvisibles();
						panelCliente.setVisible(true);
						}else{
							borrarCliente.setTextArea("Ha habido un problema al dar de baja al cliente.");
						}
					}
				});
			}
		});
		
	
		btnPedidos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelPedidos.setVisible(true);
				
			}
		});
		
		panelPedidos.getBtnConsultarPedidos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
				
			}
		});
		
		panelPedidos.getBtnDarAltaPedidos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelDarAltaPedido.setVisible(true);
				panelDarAltaPedido.getBtnDarAlta().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String txtNombre=panelDarAltaPedido.getTxtNombre().getText().trim();
						panelDarAltaArticulo.getTxtNombre().setText(txtNombre);
						
						String txtDescripcion=panelDarAltaPedido.getTxtDescripcion().getText().trim();
						panelDarAltaArticulo.getTxtDescripcion().setText(txtDescripcion);
						//Yolanda
						
						int cantidad=Integer.parseInt(panelDarAltaPedido.getTextField().getText());
						int idPedido=acciones.getNumeroArticulo();
						if(validador.validarPedido(txtNombre, txtDescripcion, cantidad)){
							//Pedido pedido= new Pedido(idPedido, txtNombre, txtDescripcion, cantidad);
							
							Cliente clientePrueba = new Cliente(txtNombre, "Yolanda");
							
							Cliente clientebueno= acciones.getLogica().getDato().obtener1(txtNombre);
							
							//Articulo articuloPrueba = new Articulo(1, "pc", "superChulo", 100);
							
							
							Articulo articuloPrueba =acciones.getLogica().getDato().obtener(txtDescripcion);
							
							Linea lineaPrueba = new Linea(articuloPrueba, cantidad);
							
							Pedido pedido = new Pedido(acciones.getNumeroPedido(), clientePrueba);
							pedido.insertarLinea(lineaPrueba);
							acciones.grabar(pedido);
							panelDarAltaPedido.getLblConfirmacion().setText("Pedido dado de alta correctamente");
							acciones.aumentarNumeroPedido();
							limpiarEtiqueta(panelDarAltaPedido.getTxtNombre());
							limpiarEtiqueta(panelDarAltaPedido.getTxtDescripcion());
							limpiarEtiqueta(panelDarAltaPedido.getTextField());
						}
						else
							panelDarAltaPedido.getLblConfirmacion().setText("Error al dar de alta el pedido");
					}
				});
			}
		});
		
		btnArticulos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelArticulos.setVisible(true);
				
			}
		});
		
		panelArticulos.getBtnDarAltaArticulo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelDarAltaArticulo.setVisible(true);
				panelDarAltaArticulo.getBtnDarAlta().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String txtNombre=panelDarAltaArticulo.getTxtNombre().getText().trim();
						panelDarAltaArticulo.getTxtNombre().setText(txtNombre);
						
						String txtDescripcion=panelDarAltaArticulo.getTxtDescripcion().getText().trim();
						panelDarAltaArticulo.getTxtDescripcion().setText(txtDescripcion);
						
						String txtProveedor=panelDarAltaArticulo.getTxtProveedor().getText().trim();
						panelDarAltaArticulo.getTxtProveedor().setText(txtProveedor);
						
						int cantidad=Integer.parseInt(panelDarAltaArticulo.getTextField().getText());
						int idArticulo=acciones.getNumeroArticulo();
						if(validador.validarArticulo(txtNombre, txtDescripcion, txtProveedor, cantidad)){
							Articulo articulo= new Articulo(idArticulo, txtNombre, txtDescripcion, cantidad);
							articulo.getListaPrecioAntiguos();
							acciones.grabar(articulo);
							panelDarAltaArticulo.getLblConfirmacion().setText("Todo bien");
							limpiarEtiqueta(panelDarAltaArticulo.getTxtNombre());
							limpiarEtiqueta(panelDarAltaArticulo.getTxtDescripcion());
							limpiarEtiqueta(panelDarAltaArticulo.getTxtProveedor());
							limpiarEtiqueta(panelDarAltaArticulo.getTextField());
						}
						else
							panelDarAltaArticulo.getLblConfirmacion().setText("Error al dar de alta");
					}
				});
			}
		});
		
		panelArticulos.getBtnConsultarArticulos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultarArticulo.setVisible(true);
				
				if(panelConsultarArticulo.getComboBox().getItemCount()==0)
				consultar.rellenarComboboxArticulo(panelConsultarArticulo.getComboBox());
				
				panelConsultarArticulo.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						panelConsultarArticulo.getTxtInformacion().setText("");
						Articulo articulo= new Articulo();
						articulo=acciones.getLogica().getDato().obtener(panelConsultarArticulo.getComboBox().getSelectedItem().toString());
						panelConsultarArticulo.getTxtInformacion().setText(articulo.informacionArticulo());
						
					}
				});
			}
			
		});
		
		panelConsultarArticulo.getBtnVolver().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelArticulos.setVisible(true);
				
			}
		});
		panelArticulos.getBtnCambiarPrecioArticulo().addActionListener(new ActionListener() {
			float precioInt;
			Articulo articulo= new Articulo();
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				cambiarPrecioArticulo.setVisible(true);
				cambiar.rellenarComboboxArticulo(cambiarPrecioArticulo.getComboBox());
				
				cambiarPrecioArticulo.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						panelConsultarArticulo.getTxtInformacion().setText("");
						
						articulo=acciones.getLogica().getDato().obtener(cambiarPrecioArticulo.getComboBox().getSelectedItem().toString());
						cambiarPrecioArticulo.getTxtPrecioActual().setText(articulo.getPrecios().getFirst().toString());
						if(validator.isNumber(cambiarPrecioArticulo.getTxtNuevoPrecio().getText()))
							precioInt= Integer.parseInt(cambiarPrecioArticulo.getTxtNuevoPrecio().getText());
						
					}
				});
				cambiar.getPrecioActualArticulo(cambiarPrecioArticulo.getTxtPrecioActual());
				
				
				cambiarPrecioArticulo.getBtnCambiar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Precio precioNuevo= new Precio((float)precioInt, false);
						articulo.getPrecios().push(precioNuevo);
						todosInvisibles();
						panelArticulos.setVisible(true);
						cambiarPrecioArticulo.getTxtNuevoPrecio().setText("");
					}
				});
				
			}
		});
		
		cambiarPrecioArticulo.getBtnVolver().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelArticulos.setVisible(true);
				
			}
		});
		panelArticulos.getBtnConsultarPreciosAntiguos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultarArticulo.setVisible(true);
				
				if(panelConsultarArticulo.getComboBox().getItemCount()==0)
				consultar.rellenarComboboxArticulo(panelConsultarArticulo.getComboBox());
				
				panelConsultarArticulo.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						panelConsultarArticulo.getTxtInformacion().setText("");
						Articulo articulo= new Articulo();
						articulo=acciones.getLogica().getDato().obtener(panelConsultarArticulo.getComboBox().getSelectedItem().toString());
						panelConsultarArticulo.getTxtInformacion().setText(articulo.getPrecios().toString());
						
					}
				});
				
				
			}
		});
		
	
		
	}
	
	private void limpiarEtiqueta(JTextField etiqueta){
		etiqueta.setText("");
	}
	private void todosInvisibles(){
		panelArticulos.setVisible(false);
		panelPedidos.setVisible(false);
		panelInicio.setVisible(false);
		panelCliente.setVisible(false);
		panelDarAltaArticulo.setVisible(false);
		panelConsultar.setVisible(false);
		cambiarPrecioArticulo.setVisible(false);
		altaCliente.setVisible(false);
		panelConsultarArticulo.setVisible(false);
		borrarCliente.setVisible(false);
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}
	
	
	
}