package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelArticulos extends JPanel{
	
	private JButton btnConsultarArticulos;
	private JButton btnDarAltaArticulo;
	private JButton btnCambiarPrecioArticulo;
	private JButton btnConsultarPreciosAntiguos;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelArticulos frame = new PanelArticulos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public PanelArticulos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{580, 0};
		gridBagLayout.rowHeights = new int[]{60, 25, 65, 25, 65, 25, 65, 25, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btnConsultarArticulos = new JButton("Consultar Articulos");
		GridBagConstraints gbc_btnConsultarArticulos = new GridBagConstraints();
		gbc_btnConsultarArticulos.fill = GridBagConstraints.BOTH;
		gbc_btnConsultarArticulos.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultarArticulos.gridx = 0;
		gbc_btnConsultarArticulos.gridy = 1;
		add(btnConsultarArticulos, gbc_btnConsultarArticulos);
		
		btnDarAltaArticulo = new JButton("Dar Alta Articulo");
		GridBagConstraints gbc_btnDarAltaArticulo = new GridBagConstraints();
		gbc_btnDarAltaArticulo.fill = GridBagConstraints.BOTH;
		gbc_btnDarAltaArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_btnDarAltaArticulo.gridx = 0;
		gbc_btnDarAltaArticulo.gridy = 3;
		add(btnDarAltaArticulo, gbc_btnDarAltaArticulo);
		
		btnCambiarPrecioArticulo = new JButton("Cambiar Precio Articulo");
		GridBagConstraints gbc_btnCambiarPrecioArticulo = new GridBagConstraints();
		gbc_btnCambiarPrecioArticulo.fill = GridBagConstraints.BOTH;
		gbc_btnCambiarPrecioArticulo.insets = new Insets(0, 0, 5, 0);
		gbc_btnCambiarPrecioArticulo.gridx = 0;
		gbc_btnCambiarPrecioArticulo.gridy = 5;
		add(btnCambiarPrecioArticulo, gbc_btnCambiarPrecioArticulo);
		
		btnConsultarPreciosAntiguos = new JButton("Consultar Precios Antiguos");
		GridBagConstraints gbc_btnConsultarPreciosAntiguos = new GridBagConstraints();
		gbc_btnConsultarPreciosAntiguos.fill = GridBagConstraints.BOTH;
		gbc_btnConsultarPreciosAntiguos.gridx = 0;
		gbc_btnConsultarPreciosAntiguos.gridy = 7;
		add(btnConsultarPreciosAntiguos, gbc_btnConsultarPreciosAntiguos);
	}


	
	public JButton getCogerBtnConsultarArticulos() {
		return btnConsultarArticulos;
	}
	public void setCambiarBtnConsultarArticulos(JButton btnConsultarArticulos) {
		this.btnConsultarArticulos = btnConsultarArticulos;
	}
	public JButton getCogerBtnDarAltaArticulo() {
		return btnDarAltaArticulo;
	}
	public void setCambiarBtnDarAltaArticulo(JButton btnDarAltaArticulo) {
		this.btnDarAltaArticulo = btnDarAltaArticulo;
	}
	public JButton getCogerBtnCambiarPrecioArticulo() {
		return btnCambiarPrecioArticulo;
	}
	public void setCambiarBtnCambiarPrecioArticulo(JButton btnCambiarPrecioArticulo) {
		this.btnCambiarPrecioArticulo = btnCambiarPrecioArticulo;
	}
	public JButton getCogerBtnConsultarPreciosAntiguos() {
		return btnConsultarPreciosAntiguos;
	}
	public void setCambiarBtnConsultarPreciosAntiguos(JButton btnConsultarPreciosAntiguos) {
		this.btnConsultarPreciosAntiguos = btnConsultarPreciosAntiguos;
	}
	
	
}
