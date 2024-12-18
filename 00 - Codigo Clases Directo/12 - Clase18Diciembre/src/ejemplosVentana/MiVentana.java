package ejemplosVentana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class MiVentana extends JFrame implements ActionListener,WindowListener {
	
	JLabel lblNombre,lblSaludo;
	JTextField txtNombre;
	JButton btnSaludar,btnBorrar;

	public MiVentana() {
		//Establecemos propiedades del JFrame: Titulo, tamaño, Fuente, Color de Fondo
		//Titulo de la ventana
		this.setTitle("Mi primera ventana");
		//Establecer un tamaño
		this.setSize(300, 500);
		
		//Establecer comportamiento boton cerrar ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Establecer administrador diseño
		this.setLayout(new FlowLayout());
		//Establecer posicion inicial ventana
		this.setLocation(300, 300);
		
		//Método que inicialice los controles 
		initComponents();
		
		//Asignar listener a los controles : Gestión de eventos
		btnSaludar.addActionListener(this);
		btnBorrar.addActionListener(this);
		this.addWindowListener(this);
		
		
		
		//Añadirlos al panel de contenidos
		add(lblNombre);
		add(txtNombre);
		add(btnSaludar);
		add(lblSaludo);	
		add(btnBorrar);
		
		
		//Hacerla visible
		this.setVisible(true);
	}
	
	
	private void initComponents() {
		lblNombre = new JLabel("Introduce tu nombre:");
		txtNombre = new JTextField(20);
		btnSaludar = new JButton("Saludar");
		lblSaludo = new JLabel("Aquí va a estar el saludo");
		btnBorrar = new JButton("Borrar texto");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Obtener botón que fue pulsado
		JButton btnPulsado = (JButton)e.getSource();
		if(btnPulsado==btnBorrar) {
		//if(btnPulsado.getText().equals("Borrar texto")) {
			txtNombre.setText("");
		}
		else {
		//Obtener el texto del TextField
		String nombre = txtNombre.getText();
		
		if(nombre.equals("")) {
			JOptionPane.showMessageDialog(this, "Debes introducir un nombre!");
		}
		else {
		//Modificar el texto de la etiqueta lblSaludo
		lblSaludo.setText("Hola " + nombre);
		}
		}
				
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Hasta la próxima!!");
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
