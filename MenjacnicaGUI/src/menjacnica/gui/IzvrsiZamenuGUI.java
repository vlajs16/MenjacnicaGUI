package menjacnica.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Toolkit;

public class IzvrsiZamenuGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblKupovniKurs;
	private JTextField txtKupoviKurs;
	private JLabel lblValuta;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField txtProdajniKurs;
	private JLabel lblIznos;
	private JTextField txtIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JSlider slider;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private String valuta = "EUR";
	private String prodKup = "Kupovina";
	private int iznos;
	
	private MenjacnicaGUI mg;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI mg) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/imgs/Money.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		iznos = slider.getValue();
		txtIznos.setText(iznos+"");
		this.mg = mg;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblKupovniKurs());
			panel.add(getTxtKupoviKurs());
			panel.add(getLblValuta());
			panel.add(getComboBox());
			panel.add(getLblProdajniKurs());
			panel.add(getTxtProdajniKurs());
			panel.add(getLblIznos());
			panel.add(getTxtIznos());
			panel.add(getLblVrstaTransakcije());
			panel.add(getRdbtnKupovina());
			panel.add(getRdbtnProdaja());
			panel.add(getBtnIzvrsiZamenu());
			panel.add(getBtnOdustani());
			panel.add(getSlider());
		}
		return panel;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblKupovniKurs.setBounds(50, 64, 200, 32);
		}
		return lblKupovniKurs;
	}

	private JTextField getTxtKupoviKurs() {
		if (txtKupoviKurs == null) {
			txtKupoviKurs = new JTextField();
			txtKupoviKurs.setEditable(false);
			txtKupoviKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtKupoviKurs.setBounds(50, 119, 200, 32);
			txtKupoviKurs.setColumns(10);
		}
		return txtKupoviKurs;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblValuta.setBounds(320, 65, 150, 31);
		}
		return lblValuta;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
					valuta = comboBox.getSelectedItem().toString();
				}
			});
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "RSD", "USD" }));
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
			comboBox.setBounds(320, 118, 150, 32);
		}
		return comboBox;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblProdajniKurs.setBounds(520, 64, 200, 32);
		}
		return lblProdajniKurs;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtProdajniKurs.setBounds(520, 119, 200, 32);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblIznos.setBounds(50, 177, 200, 32);
		}
		return lblIznos;
	}

	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtIznos.setBounds(50, 225, 200, 32);
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblVrstaTransakcije.setBounds(320, 166, 200, 32);
		}
		return lblVrstaTransakcije;
	}

	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (rdbtnKupovina.isSelected())
						prodKup = "Kupovina";
				}
			});
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnKupovina.setBounds(365, 210, 155, 29);
			rdbtnKupovina.setSelected(true);
		}
		return rdbtnKupovina;
	}

	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (rdbtnProdaja.isSelected())
						prodKup = "Prodaja";
				}
			});
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnProdaja.setBounds(365, 247, 155, 29);
		}
		return rdbtnProdaja;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = prodKup + " " + iznos + "  " + valuta;
					mg.addNewText(text);
					dispose();
				}
			});
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnIzvrsiZamenu.setBounds(50, 418, 270, 32);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnOdustani.setBounds(450, 418, 270, 32);
		}
		return btnOdustani;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					iznos = slider.getValue();
					txtIznos.setText(iznos+"");
				}
			});
			slider.setFont(new Font("Tahoma", Font.PLAIN, 20));
			slider.setSnapToTicks(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(50, 312, 670, 72);
		}
		return slider;
	}
}
