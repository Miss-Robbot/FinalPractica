package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


import javax.swing.JComboBox;

import modelo.Articulo;
import modelo.Cliente;
import modelo.DatoActual;
import modelo.Linea;
import modelo.Logica;
import validacion.Validator;
import modelo.Pedido;
import vista.PanelConsultar;
import vista.UI;
import vista.vistaUI;

public class ParaUI extends UI{

	private Acciones acciones; //Esto es para coger la logica 

	Validator validador = new Validator();

	private Borrar borrar=new Borrar();
	private Cambiar cambiar=new Cambiar();
	private Consultar consultar=new Consultar();
	private DarAlta darAlta= new DarAlta();
	private Insertar insertar= new Insertar();
	private DatoActual datoActual= new DatoActual();
	
	
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
				//consultar.rellenarComboboxArticulo(panelConsultar.getComboBox());
				
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
				
			}
		});
		
		panelArticulos.getBtnConsultarArticulos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
				consultar.rellenarComboboxArticulo(panelConsultar.getComboBox());
				
				panelConsultar.getComboBox().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Articulo articulo = (Articulo) panelConsultar.getComboBox().getSelectedItem();
						consultar.consultarArticulo(articulo, panelConsultar.getTxtInformacion());
					}
				});
			}
		});
		
		panelArticulos.getBtnCambiarPrecioArticulo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				cambiarPrecioArticulo.setVisible(true);
				
			}
		});
		
		panelArticulos.getBtnConsultarPreciosAntiguos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				todosInvisibles();
				panelConsultar.setVisible(true);
				//DatoActual datoActualNuevo= new DatoActual();
				//consultar.rellenarComboboxArticulo(panelConsultar.getComboBox());
				
			}
		});
		
		panelCliente.getBtnDarAlta().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				/*altaCliente.setLblError("");
				altaCliente.setVisible(true);
				
				altaCliente.getBtnDarDeAlta().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String nombre = altaCliente.getTxtNombre().getText();
						String dni = altaCliente.getTxtDNI().getText();
						String dire = altaCliente.getTxtDireccion().getText();
						String tlf = altaCliente.getTxtTelf().getText();
						altaCliente.vaciarTextos();
						
						if(validador.isPhone(tlf)&&!validador.isNumber(nombre)){//averiguar las validaciones
							acciones.getLogica().crearCliente( dni, nombre, dire, tlf);
							consulta.setComboBox(acciones.getLogica().obtenerComboBox(consulta.getComboBox(), dni));
							altaCliente.setLblError("");
							todosInvisibles();
							panelCliente.setVisible(true);
						}else{
							altaCliente.setLblError("Ha habido un error dando de alta al cliente");
						}
					}
				});*/
				
			}
		});
		
		panelCliente.getBtnConsultarCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				/*consulta.getTextArea().setText("");
				consulta.getBtnVolver().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						todosInvisibles();
						panelCliente.setVisible(true);
						
						
					}
				});
				consulta.setVisible(true);
				consulta.getComboBox().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						consulta.setTextArea(acciones.getLogica().seleccionarCliente((Cliente) consulta.getComboBox().getSelectedItem(), consulta.getTextArea()));
						//comboBox= listaClientes
						//al click, poner texto de info del cliente
						
					}
				});*/
				
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
						//logica.borrarCliente(borrar.getComboBox(), borrar.getComboBox().getSelectedItem().toString());
						
					}
				});
			}
		});
		
	}
	

	public void todosInvisibles(){
		panelArticulos.setVisible(false);
		panelPedidos.setVisible(false);
		panelInicio.setVisible(false);
		panelCliente.setVisible(false);
		panelDarAltaArticulo.setVisible(false);
		panelConsultar.setVisible(false);
		cambiarPrecioArticulo.setVisible(false);
		panelDarAltaCliente.setVisible(false);
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}
	
	//Aquí van todos los actionListener con las acciones de accionable.
	
	
}
