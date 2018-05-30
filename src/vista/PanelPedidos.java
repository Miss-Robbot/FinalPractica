package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPedidos extends JPanel{
	public PanelPedidos() {
		
		JButton btnNewButton = new JButton("Consultar Pedidos");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton_1 = new JButton("Alta Pedidos");
		add(btnNewButton_1);
		add(btnNewButton);
	}

	private JButton btnConsultarPedidos;
	private JButton btnDarAltaPedidos;
	
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
