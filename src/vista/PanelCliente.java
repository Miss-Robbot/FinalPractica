package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class PanelCliente extends JFrame {

	private JPanel contentPane;
	private JButton btnDarAlta;
	private JButton btnConsultarCliente;
	private JButton btnBorrarCliente;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelCliente frame = new PanelCliente();
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
	public PanelCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSeleccioneLaOpcin = new JLabel("    Seleccione la opci\u00F3n que corresponda   ");
		lblSeleccioneLaOpcin.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(0, 0, 0, 0)));
		lblSeleccioneLaOpcin.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		GridBagConstraints gbc_lblSeleccioneLaOpcin = new GridBagConstraints();
		gbc_lblSeleccioneLaOpcin.fill = GridBagConstraints.VERTICAL;
		gbc_lblSeleccioneLaOpcin.insets = new Insets(0, 0, 5, 0);
		gbc_lblSeleccioneLaOpcin.gridx = 0;
		gbc_lblSeleccioneLaOpcin.gridy = 0;
		contentPane.add(lblSeleccioneLaOpcin, gbc_lblSeleccioneLaOpcin);
		
		btnDarAlta = new JButton("Dar de Alta");
		btnDarAlta.setBackground(SystemColor.activeCaption);
		btnDarAlta.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnDarAlta.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnDarAlta, gbc_btnNewButton);
		
		btnConsultarCliente = new JButton("Consultar Cliente");
		btnConsultarCliente.setBackground(SystemColor.activeCaption);
		btnConsultarCliente.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnConsultarCliente.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnConsultarCliente = new GridBagConstraints();
		gbc_btnConsultarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultarCliente.fill = GridBagConstraints.BOTH;
		gbc_btnConsultarCliente.gridx = 0;
		gbc_btnConsultarCliente.gridy = 4;
		contentPane.add(btnConsultarCliente, gbc_btnConsultarCliente);
		
		btnBorrarCliente = new JButton("Borrar Cliente");
		btnBorrarCliente.setBackground(SystemColor.activeCaptionBorder);
		btnBorrarCliente.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		btnBorrarCliente.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnBorrarCliente = new GridBagConstraints();
		gbc_btnBorrarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnBorrarCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBorrarCliente.gridx = 0;
		gbc_btnBorrarCliente.gridy = 6;
		contentPane.add(btnBorrarCliente, gbc_btnBorrarCliente);
	}
	
	public JButton getBtnDarAlta() {
		return btnDarAlta;
	}

	public void setBtnDarAlta(JButton btnDarAlta) {
		this.btnDarAlta = btnDarAlta;
	}

	public JButton getBtnConsultarCliente() {
		return btnConsultarCliente;
	}

	public void setBtnConsultarCliente(JButton btnConsultarCliente) {
		this.btnConsultarCliente = btnConsultarCliente;
	}

	public JButton getBtnBorrarCliente() {
		return btnBorrarCliente;
	}

	public void setBtnBorrarCliente(JButton btnBorrarCliente) {
		this.btnBorrarCliente = btnBorrarCliente;
	}
	

}
