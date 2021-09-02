package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;


import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.TextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGitHub;
	
	public SimplePresentationScreen(Student studentData) {
		setBackground(Color.GRAY);
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(780, 309));
		setResizable(false);
		setContentPane(contentPane);
		init();
	}
	
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 211);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		textFieldLU = new JTextField();
		textFieldLU.setBounds(187, 11, 196, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		Integer id = studentData.getId();
		textFieldLU.setText(id.toString());
		textFieldLU.setEnabled(false);
		
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(187, 41, 196, 20);
		tabInformation.add(textFieldApellido);
		textFieldApellido.setText(studentData.getLastName());
		textFieldApellido.setEnabled(false);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(187, 75, 196, 20);
		tabInformation.add(textFieldNombre);
		textFieldNombre.setText(studentData.getFirstName());
		textFieldNombre.setEnabled(false);
		
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(187, 106, 196, 20);
		tabInformation.add(textFieldEmail);
		textFieldEmail.setText(studentData.getMail());
		textFieldEmail.setEnabled(false);
		
		
		textFieldGitHub = new JTextField();
		textFieldGitHub.setColumns(10);
		textFieldGitHub.setBounds(187, 137, 196, 20);
		tabInformation.add(textFieldGitHub);
		textFieldGitHub.setText(studentData.getGithubURL());
		textFieldGitHub.setEnabled(false);
		
		
		JLabel LU = new JLabel("LU");
		LU.setBounds(31, 14, 76, 14);
		tabInformation.add(LU);
		
		JLabel Apellido = new JLabel("Apellido");
		Apellido.setBounds(31, 44, 76, 14);
		tabInformation.add(Apellido);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(31, 78, 76, 14);
		tabInformation.add(Nombre);
		
		JLabel Email = new JLabel("Email");
		Email.setBounds(31, 109, 76, 14);
		tabInformation.add(Email);
		
		JLabel GitHub = new JLabel("GitHub");
		GitHub.setBounds(31, 140, 76, 14);
		tabInformation.add(GitHub);
		contentPane.add(tabbedPane);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(448, 25, 160, 199);
		ImageIcon ico = new ImageIcon(getClass().getResource("/images/yo.png"));
		ImageIcon ima = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(ima);
		
		contentPane.add(lblNewLabel);
		
		JLabel LabelTiempo = new JLabel("Esta ventana fue generada el " + LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear() + " a las: " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond());
		LabelTiempo.setBounds(31, 227, 392, 14);
		contentPane.add(LabelTiempo);
		
	}
}
