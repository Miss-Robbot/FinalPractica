package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class vistaDos extends JFrame{

	private JPanel panelPrincipal;
	private JPanel panelCabecera;
	private PanelInicio panelInicio;
	private PanelCliente panelCliente;
	private PanelPedidos panelPedidos;
	private PanelArticulos panelArticulos;
	private PanelConsultarCliente panelConsultar;
	private PanelDarAlta panelDarAlta;
	private CambiarPrecioArticulo panelCambiarPrecio;
	
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
	public PanelConsultarCliente getPanelConsultar() {
		return panelConsultar;
	}
	public void setPanelConsultar(PanelConsultarCliente panelConsultar) {
		this.panelConsultar = panelConsultar;
	}
	public PanelDarAlta getPanelDarAlta() {
		return panelDarAlta;
	}
	public void setPanelDarAlta(PanelDarAlta panelDarAlta) {
		this.panelDarAlta = panelDarAlta;
	}
	public CambiarPrecioArticulo getPanelCambiarPrecio() {
		return panelCambiarPrecio;
	}
	public void setPanelCambiarPrecio(CambiarPrecioArticulo panelCambiarPrecio) {
		this.panelCambiarPrecio = panelCambiarPrecio;
	}
	
	
}
