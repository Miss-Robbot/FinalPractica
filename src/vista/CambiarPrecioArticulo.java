package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CambiarPrecioArticulo extends JPanel{

	private JLabel lblPrecioActual;
	private JTextField txtPrecioActual;
	private JLabel lblNuevoPrecio;
	private JTextField txtNuevoPrecio;
	public JLabel getLblPrecioActual() {
		return lblPrecioActual;
	}
	public void setLblPrecioActual(JLabel lblPrecioActual) {
		this.lblPrecioActual = lblPrecioActual;
	}
	public JTextField getTxtPrecioActual() {
		return txtPrecioActual;
	}
	public void setTxtPrecioActual(JTextField txtPrecioActual) {
		this.txtPrecioActual = txtPrecioActual;
	}
	public JLabel getLblNuevoPrecio() {
		return lblNuevoPrecio;
	}
	public void setLblNuevoPrecio(JLabel lblNuevoPrecio) {
		this.lblNuevoPrecio = lblNuevoPrecio;
	}
	public JTextField getTxtNuevoPrecio() {
		return txtNuevoPrecio;
	}
	public void setTxtNuevoPrecio(JTextField txtNuevoPrecio) {
		this.txtNuevoPrecio = txtNuevoPrecio;
	}
	
	
}
