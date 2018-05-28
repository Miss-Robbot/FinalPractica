package vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCliente extends JPanel{

	private JButton btnConsultarCliente;
	private JButton btnDarAlta;
	private JButton btnBorrar;
	
	public JButton getBtnConsultarCliente() {
		return btnConsultarCliente;
	}
	public void setBtnConsultarCliente(JButton btnConsultarCliente) {
		this.btnConsultarCliente = btnConsultarCliente;
	}
	public JButton getBtnDarAlta() {
		return btnDarAlta;
	}
	public void setBtnDarAlta(JButton btnDarAlta) {
		this.btnDarAlta = btnDarAlta;
	}
	public JButton getBtnBorrar() {
		return btnBorrar;
	}
	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}
	
	
}
