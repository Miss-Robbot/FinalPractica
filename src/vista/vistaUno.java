package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class vistaUno extends JFrame{

	private JLabel lblUsuario;
	private JLabel lblContrasenia;
	private JTextField txtUsuario;
	private JTextField txtContrasenia;
	private JPanel panelPrincipal;
	
	public JLabel getLblUsuario() {
		return lblUsuario;
	}
	public void setLblUsuario(JLabel lblUsuario) {
		this.lblUsuario = lblUsuario;
	}
	public JLabel getLblContrasenia() {
		return lblContrasenia;
	}
	public void setLblContrasenia(JLabel lblContrasenia) {
		this.lblContrasenia = lblContrasenia;
	}
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}
	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}
	public JTextField getTxtContrasenia() {
		return txtContrasenia;
	}
	public void setTxtContrasenia(JTextField txtContrasenia) {
		this.txtContrasenia = txtContrasenia;
	}
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}
	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	
}
