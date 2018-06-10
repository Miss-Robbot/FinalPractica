package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;


import javax.swing.JComboBox;
import javax.swing.JTextField;

import modelo.Articulo;
import modelo.Cliente;
import modelo.Linea;
import modelo.Logica;
import validacion.Validador;
import validacion.Validator;
import modelo.Pedido;
import vista.PanelConsultar;
import vista.UI;
import vista.vistaUI;

public class ParaUI extends UI{

	private Acciones acciones=new Acciones(); //Esto es para coger la logica 
	private Validador validador= new Validador();

	Validator validator = new Validator();

	private Borrar borrar=new Borrar();
	private Cambiar cambiar=new Cambiar();
	private Consultar consultar=new Consultar();
	private DarAlta darAlta= new DarAlta();
	private Insertar insertar= new Insertar();
	
	
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
		public void actionPerformed(ActionEvent arg0) {
			 altaCliente.setLblError("");
			
			altaCliente.getBtnDarDeAlta().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String nombre = altaCliente.getTxtNombre().getText();
					String dni = altaCliente.getTxtDNI().getText();
					String dire = altaCliente.getTxtDireccion().getText();
					String tlf = altaCliente.getTxtTelf().getText();
					altaCliente.vaciarTextos();
					
					if(validator.isPhone(tlf)&&!validator.isNumber(nombre)){//averiguar las validaciones
						acciones.grabar((acciones.getLogica().crearCliente(dni, nombre, dire, tlf)));
						
						panelConsultar.setComboBox(consultar.actualizarComboBoxCliente(panelConsultar.getComboBox()));
						borrarCliente.setComboBox(consultar.actualizarComboBoxCliente(borrarCliente.getComboBox()));
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
				panelDarAltaArticulo.setVisible(true);
				
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
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				cambiarPrecioArticulo.setVisible(true);
				//hacer bien, que me estoy quedando dormida
				consultar.rellenarComboboxArticulo(cambiarPrecioArticulo.getComboBox());
				consultar.getPrecioActualArticulo(cambiarPrecioArticulo.getTxtPrecioActual());
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
		altaCliente.setVisible(false);
		panelConsultarArticulo.setVisible(false);
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}
	
	
	
}