package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPedidos extends JPanel{
	
	private JButton btnConsultarPedidos;
	private JButton btnDarAltaPedidos;
	
	public PanelPedidos() {
		
		btnConsultarPedidos = new JButton("Consultar Pedidos");
		btnConsultarPedidos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(new GridLayout(0, 2, 0, 0));
		
		btnDarAltaPedidos = new JButton("Alta Pedidos");
		add(btnDarAltaPedidos);
		add(btnConsultarPedidos);
	}

	
	
	public JButton getBtnConsultarPedidos() {
		return btnConsultarPedidos;
	}
	public void setBtnConsultarPedidos(JButton btnConsultarPedidos) {
		this.btnConsultarPedidos = btnConsultarPedidos;
	}
	public JButton getBtnDarAltaPedidos() {
		return btnDarAltaPedidos;
	}
	public void setBtnDarAltaPedidos(JButton btnDarAltaPedidos) {
		this.btnDarAltaPedidos = btnDarAltaPedidos;
	}
	
}
