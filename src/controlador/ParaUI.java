package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Cliente;
import modelo.DatoActual;
import modelo.Logica;
import validacion.Validator;
import vista.UI;
import vista.vistaUI;

public class ParaUI extends UI{

	private Acciones acciones; //Esto es para coger la logica 
	private Borrar borrar;
	private Cambiar cambiar;
	private Consultar consultar;
	private DarAlta darAlta;
	private Insertar insertar;
	Validator validador = new Validator();
	
	
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
