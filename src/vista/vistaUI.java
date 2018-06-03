package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class vistaUI extends JFrame{
	
	private JPanel contentPanel;
	private JPanel panelPrincipal;
	private JPanel panelCabecera;
	private PanelInicio panelInicio;
	private PanelCliente panelCliente;
	private PanelPedidos panelPedidos;
	private PanelArticulos panelArticulos;
	private PanelConsultar panelConsultar= new PanelConsultar();
	private PanelDarAltaArticulo panelDarAlta;
	private CambiarPrecioArticulo panelCambiarPrecio;
	
	public vistaUI() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{52, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panelCabecera = new JPanel();
		GridBagConstraints gbc_panelCabecera = new GridBagConstraints();
		gbc_panelCabecera.insets = new Insets(0, 0, 5, 0);
		gbc_panelCabecera.fill = GridBagConstraints.BOTH;
		gbc_panelCabecera.gridx = 0;
		gbc_panelCabecera.gridy = 0;
		add(panelCabecera, gbc_panelCabecera);
		GridBagLayout gbl_panelCabecera = new GridBagLayout();
		gbl_panelCabecera.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelCabecera.rowHeights = new int[]{0, 0};
		gbl_panelCabecera.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelCabecera.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelCabecera.setLayout(gbl_panelCabecera);
		
		JButton btnInicio = new JButton("Inicio");
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.fill = GridBagConstraints.BOTH;
		gbc_btnInicio.insets = new Insets(0, 0, 0, 5);
		gbc_btnInicio.gridx = 0;
		gbc_btnInicio.gridy = 0;
		panelCabecera.add(btnInicio, gbc_btnInicio);
		
		JButton btnCliente = new JButton("Cliente");
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.BOTH;
		gbc_btnCliente.insets = new Insets(0, 0, 0, 5);
		gbc_btnCliente.gridx = 1;
		gbc_btnCliente.gridy = 0;
		panelCabecera.add(btnCliente, gbc_btnCliente);
		
		JButton btnPedidos = new JButton("Pedidos");
		GridBagConstraints gbc_btnPedidos = new GridBagConstraints();
		gbc_btnPedidos.fill = GridBagConstraints.BOTH;
		gbc_btnPedidos.insets = new Insets(0, 0, 0, 5);
		gbc_btnPedidos.gridx = 2;
		gbc_btnPedidos.gridy = 0;
		panelCabecera.add(btnPedidos, gbc_btnPedidos);
		
		JButton btnArticulos = new JButton("Articulos");
		GridBagConstraints gbc_btnArticulos = new GridBagConstraints();
		gbc_btnArticulos.fill = GridBagConstraints.BOTH;
		gbc_btnArticulos.gridx = 3;
		gbc_btnArticulos.gridy = 0;
		panelCabecera.add(btnArticulos, gbc_btnArticulos);
		
		panelPrincipal = new JPanel();
		GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
		gbc_panelPrincipal.fill = GridBagConstraints.BOTH;
		gbc_panelPrincipal.gridx = 0;
		gbc_panelPrincipal.gridy = 1;
		add(panelPrincipal, gbc_panelPrincipal);
		
		contentPanel= new JPanel();
		contentPanel.add(panelCabecera);
		contentPanel.add(panelPrincipal);
		contentPanel.setVisible(true);
		panelCabecera.setVisible(true);
		//panelPrincipal.add(panelInicio);
		//panelPrincipal.add(panelCliente);
		//panelPrincipal.add(panelPedidos);
		//panelPrincipal.add(panelArticulos);
		//panelPrincipal.add(panelConsultar);
		//panelConsultar.setVisible(true);
		//panelPrincipal.add(panelDarAlta);
		//panelPrincipal.add(panelCambiarPrecio);
	}
	
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}
	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	public JPanel getPanelCabecera() {
		return panelCabecera;
	}
	public void setPanelCabecera(JPanel panelCabecera) {
		this.panelCabecera = panelCabecera;
	}
	public PanelInicio getPanelInicio() {
		return panelInicio;
	}
	public void setPanelInicio(PanelInicio panelInicio) {
		this.panelInicio = panelInicio;
	}
	public PanelCliente getPanelCliente() {
		return panelCliente;
	}
	public void setPanelCliente(PanelCliente panelCliente) {
		this.panelCliente = panelCliente;
	}
	public PanelPedidos getPanelPedidos() {
		return panelPedidos;
	}
	public void setPanelPedidos(PanelPedidos panelPedidos) {
		this.panelPedidos = panelPedidos;
	}
	public PanelArticulos getPanelArticulos() {
		return panelArticulos;
	}
	public void setPanelArticulos(PanelArticulos panelArticulos) {
		this.panelArticulos = panelArticulos;
	}
	public PanelConsultar getPanelConsultar() {
		return panelConsultar;
	}
	public void setPanelConsultar(PanelConsultar panelConsultar) {
		this.panelConsultar = panelConsultar;
	}
	
	public PanelDarAltaArticulo getPanelDarAlta() {
		return panelDarAlta;
	}
	public void setPanelDarAlta(PanelDarAltaArticulo panelDarAlta) {
		this.panelDarAlta = panelDarAlta;
	}
	public CambiarPrecioArticulo getPanelCambiarPrecio() {
		return panelCambiarPrecio;
	}
	public void setPanelCambiarPrecio(CambiarPrecioArticulo panelCambiarPrecio) {
		this.panelCambiarPrecio = panelCambiarPrecio;
	}
	
	
}
