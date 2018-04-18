package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class ObrisiKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblSifra;
	private JTextField txtSifra;
	private JLabel lblNaziv;
	private JTextField txtNaziv;
	private JLabel lblProdajniKurs;
	private JTextField txtProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField txtKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField txtSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField txtSkraceniNaziv;
	private JButton btnOdustani;
	private JButton btnObrisi;
	private MenjacnicaGUI mg;
	private JCheckBox chckbxZaistaObrisiKurs;


	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI mg) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObrisiKursGUI.class.getResource("/imgs/Money.png")));
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		
		this.mg = mg;
	}
	
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblSifra());
			panel.add(getTxtSifra());
			panel.add(getLblNaziv());
			panel.add(getTxtNaziv());
			panel.add(getLblProdajniKurs());
			panel.add(getTxtProdajniKurs());
			panel.add(getLblKupovniKurs());
			panel.add(getTxtKupovniKurs());
			panel.add(getLblSrednjiKurs());
			panel.add(getTxtSrednjiKurs());
			panel.add(getLblSkraceniNaziv());
			panel.add(getTxtSkraceniNaziv());
			panel.add(getBtnOdustani());
			panel.add(getBtnObrisi());
			panel.add(getChckbxZaistaObrisiKurs());
		}
		return panel;
	}

	
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSifra.setBounds(37, 61, 160, 26);
		}
		return lblSifra;
	}
	private JTextField getTxtSifra() {
		if (txtSifra == null) {
			txtSifra = new JTextField();
			txtSifra.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtSifra.setBounds(37, 92, 270, 32);
			txtSifra.setColumns(10);
		}
		return txtSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNaziv.setBounds(461, 61, 160, 26);
		}
		return lblNaziv;
	}
	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
			txtNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtNaziv.setBounds(461, 92, 270, 32);
			txtNaziv.setColumns(10);
		}
		return txtNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblProdajniKurs.setBounds(37, 159, 160, 29);
		}
		return lblProdajniKurs;
	}
	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtProdajniKurs.setBounds(37, 195, 270, 32);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblKupovniKurs.setBounds(461, 159, 160, 29);
		}
		return lblKupovniKurs;
	}
	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtKupovniKurs.setBounds(461, 195, 270, 32);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSrednjiKurs.setBounds(37, 264, 160, 29);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextField();
			txtSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtSrednjiKurs.setBounds(37, 309, 270, 32);
			txtSrednjiKurs.setColumns(10);
		}
		return txtSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblSkraceniNaziv.setBounds(461, 264, 160, 29);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTxtSkraceniNaziv() {
		if (txtSkraceniNaziv == null) {
			txtSkraceniNaziv = new JTextField();
			txtSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtSkraceniNaziv.setBounds(461, 309, 270, 32);
			txtSkraceniNaziv.setColumns(10);
		}
		return txtSkraceniNaziv;
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
			btnOdustani.setBounds(461, 409, 270, 32);
		}
		return btnOdustani;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = "Obrisali ste: (Sifra: " + txtSifra.getText()+"; Valuta: " + txtNaziv.getText() + " (" + txtSkraceniNaziv.getText()+ ") " +
							" Prodajni kurs: " + txtProdajniKurs.getText() +
							"; Srednji kurs: " + txtSrednjiKurs.getText() +
							"; Kupovni kurs: " + txtKupovniKurs.getText() + " )";
		mg.addNewText(text);
		dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnObrisi.setBounds(37, 411, 270, 32);
		}
		return btnObrisi;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(chckbxZaistaObrisiKurs.isSelected()) {
//						System.out.println("ccc");
						btnObrisi.setEnabled(true);
					}	
					else btnObrisi.setEnabled(false);
				}
			});
			
			chckbxZaistaObrisiKurs.setFont(new Font("Tahoma", Font.PLAIN, 20));
			chckbxZaistaObrisiKurs.setBounds(37, 364, 270, 32);
			
		}
		return chckbxZaistaObrisiKurs;
	}
}
