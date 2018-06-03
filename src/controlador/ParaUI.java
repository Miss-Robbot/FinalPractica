package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.DatoActual;
import modelo.Logica;
import vista.vistaUI;

public class ParaUI extends vistaUI{

	private Acciones acciones; //Esto es para coger la logica 
	private Borrar borrar;
	private Cambiar cambiar;
	private Consultar consultar;
	private DarAlta darAlta;
	private Insertar insertar;
	
	
	public ParaUI(){
		
		
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
