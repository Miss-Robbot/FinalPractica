package controlador;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Logica;
import vista.PanelCliente;
import vista.UI;

public class ParaUI extends UI{

	private Acciones acciones; //Esto es para coger la logica 
	private Borrar borrar;
	private Cambiar cambiar;
	private Consultar consultar;
	private DarAlta darAlta;
	private Insertar insertar;
	PanelCliente pcli = new PanelCliente();
	
	
	public ParaUI(){
		
		getBtnCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setPanelPrincipal(pcli);
				
				
			}
		});
		
		
		/*getVistaDos().getPanelArticulos().getBtnConsultarArticulos().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				consultar.rellenarComboboxArticulo(getVistaDos().getPanelConsultar().getComboBox(), acciones.getLogica().getDatoActual());
				
			}
		});*/
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}
	
	//Aquí van todos los actionListener con las acciones de accionable.
	
	
}
