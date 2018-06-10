package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Linea;
import modelo.Pedido;
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
	
	private Cliente clientePrueba = new Cliente("80079711J", "Yolanda");
	private Articulo articuloPrueba = new Articulo(1, "pc", "superChulo", 100);
	private Linea lienaPrueba = new Linea(articuloPrueba, 20);
	
	
	public ParaUI(){
		
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
				panelDarAltaArticulo.setVisible(true);
				
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
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		panelCliente.getBtnConsultarCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
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
				
				borrarCliente.setVisible(true);
				borrarCliente.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
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
						
						String txtProveedor=panelDarAltaPedido.getTxtProveedor().getText().trim();
						panelDarAltaArticulo.getTxtProveedor().setText(txtProveedor);
						
						int cantidad=Integer.parseInt(panelDarAltaPedido.getTextField().getText());
						int idPedido=acciones.getNumeroArticulo();
						if(validador.validarPedido(txtNombre, txtDescripcion, txtProveedor, cantidad)){
							//Pedido pedido= new Pedido(idPedido, txtNombre, txtDescripcion, cantidad);
							Pedido pedido = new Pedido(22, clientePrueba);
							acciones.grabar(pedido);
							panelDarAltaPedido.getLblConfirmacion().setText("Todo bien");
							limpiarEtiqueta(panelDarAltaPedido.getTxtNombre());
							limpiarEtiqueta(panelDarAltaPedido.getTxtDescripcion());
							limpiarEtiqueta(panelDarAltaPedido.getTxtProveedor());
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
				consultar.rellenarComboboxArticulo(panelConsultarArticulo.getComboBox());
				panelConsultarArticulo.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						panelConsultarArticulo.getTxtInformacion().setText("");
						Articulo articulo= acciones.getLogica().getDato().obtener(panelConsultarArticulo.getComboBox().getSelectedItem().toString());
						panelConsultarArticulo.getTxtInformacion().setText(articulo.informacionArticulo());
						
					}
				});
			}
		});
		
		panelArticulos.getBtnCambiarPrecioArticulo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				
			}
		});
		
		panelArticulos.getBtnConsultarPreciosAntiguos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
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
		panelDarAltaCliente.setVisible(false);
		panelConsultarArticulo.setVisible(false);
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}
	
	
	
}
