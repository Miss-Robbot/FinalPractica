package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UI extends JFrame {

	private JPanel contentPane;
	private JPanel panelCabecera;
	private JPanel panelPrincipal;
	private JButton btnInicio;
	private JButton btnCliente;
	private JButton btnPedidos;
	private JButton btnArticulos;
	protected PanelCliente paneCliente;
	//private PanelConsultar panelConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{77, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		panelCabecera = new JPanel();
		GridBagConstraints gbc_panelCabecera = new GridBagConstraints();
		gbc_panelCabecera.insets = new Insets(0, 0, 5, 0);
		gbc_panelCabecera.fill = GridBagConstraints.BOTH;
		gbc_panelCabecera.gridx = 0;
		gbc_panelCabecera.gridy = 0;
		contentPane.add(panelCabecera, gbc_panelCabecera);
		GridBagLayout gbl_panelCabecera = new GridBagLayout();
		gbl_panelCabecera.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelCabecera.rowHeights = new int[]{0, 0};
		gbl_panelCabecera.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelCabecera.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelCabecera.setLayout(gbl_panelCabecera);
		
		btnInicio = new JButton("Inicio");
		GridBagConstraints gbc_btnInicio = new GridBagConstraints();
		gbc_btnInicio.fill = GridBagConstraints.BOTH;
		gbc_btnInicio.insets = new Insets(0, 0, 0, 5);
		gbc_btnInicio.gridx = 0;
		gbc_btnInicio.gridy = 0;
		panelCabecera.add(btnInicio, gbc_btnInicio);
		
		btnCliente = new JButton("Cliente");
		GridBagConstraints gbc_btnCliente = new GridBagConstraints();
		gbc_btnCliente.fill = GridBagConstraints.BOTH;
		gbc_btnCliente.insets = new Insets(0, 0, 0, 5);
		gbc_btnCliente.gridx = 1;
		gbc_btnCliente.gridy = 0;
		panelCabecera.add(btnCliente, gbc_btnCliente);
		
		btnPedidos = new JButton("Pedidos");
		GridBagConstraints gbc_btnPedidos = new GridBagConstraints();
		gbc_btnPedidos.fill = GridBagConstraints.BOTH;
		gbc_btnPedidos.insets = new Insets(0, 0, 0, 5);
		gbc_btnPedidos.gridx = 2;
		gbc_btnPedidos.gridy = 0;
		panelCabecera.add(btnPedidos, gbc_btnPedidos);
		
		btnArticulos = new JButton("Articulos");
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
		contentPane.add(panelPrincipal, gbc_panelPrincipal);
		GridBagLayout gbl_panelPrincipal = new GridBagLayout();
		gbl_panelPrincipal.columnWidths = new int[]{649, 0};
		gbl_panelPrincipal.rowHeights = new int[]{329, 0};
		gbl_panelPrincipal.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panelPrincipal.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelPrincipal.setLayout(gbl_panelPrincipal);
		
	/*	panelConsultar= new PanelConsultar();
		GridBagLayout gridBagLayout = (GridBagLayout) panelConsultar.getLayout();
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0};
		gridBagLayout.columnWidths = new int[]{9, 0, 0};
		GridBagConstraints gbc_panelConsultar = new GridBagConstraints();
		gbc_panelConsultar.fill = GridBagConstraints.BOTH;
		gbc_panelConsultar.gridx = 0;
		gbc_panelConsultar.gridy = 0;
		panelPrincipal.add(panelConsultar, gbc_panelConsultar);
		panelConsultar.setVisible(true);*/
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

	public JButton getBtnCliente() {
		return btnCliente;
	}

	public void setBtnCliente(JButton btnCliente) {
		this.btnCliente = btnCliente;
	}

	public PanelCliente getPaneCliente() {
		return paneCliente;
	}
	
	
	
	

}
