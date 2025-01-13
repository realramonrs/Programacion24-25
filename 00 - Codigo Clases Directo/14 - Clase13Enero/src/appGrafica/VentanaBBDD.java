package appGrafica;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import conexionBBDD.Utilidades;


public class VentanaBBDD extends JFrame {
	
	JComboBox cmbGeneros;
	JButton btnConsulta;
	JTextArea txtAreaResultado;
	
	
	public VentanaBBDD() {
		this.setSize(850,750);
		this.setTitle("Mis Libros");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		inicializarComponentes();
		
		//Gestionar los layout --> Como distribuir los controles
		//Por Defecto : BorderLayout
	/*	this.add(cmbGeneros,BorderLayout.NORTH);
		this.add(btnConsulta,BorderLayout.CENTER);
		this.add(txtAreaResultado,BorderLayout.SOUTH); */
		
		//Podemos cambiar el layout principal a flow layout
		this.setLayout(new FlowLayout());
		this.add(cmbGeneros);
		this.add(btnConsulta);
		this.add(txtAreaResultado);
		
		
		//Gestión de Eventos
		
		this.btnConsulta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Connection conexion = DriverManager.getConnection(Utilidades.cadenaConexionMariaDB,"root","");
					PreparedStatement consulta = conexion.prepareStatement("SELECT Titulo,Autor,Precio From Libros Where Genero = ?");
					consulta.setString(1, cmbGeneros.getSelectedItem().toString());
					ResultSet res = consulta.executeQuery();
					
					while(res.next()) {
						txtAreaResultado.append(res.getString("Titulo") + " " + res.getString("Autor") + "\n");
					}
					res.close();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		//Hacer visible la ventana
		this.setVisible(true);
	}
	
	
	private void inicializarComponentes() {
		cmbGeneros = new JComboBox();
		cmbGeneros.addItem("Todos");
		btnConsulta = new JButton("Filtrar");
		txtAreaResultado = new JTextArea(30, 100);
		volcarGeneros();
	}
	
	
	private void volcarGeneros() {
		try {
			Connection conexion = DriverManager.getConnection(Utilidades.cadenaConexionMariaDB,"root","");
		    Statement consulta = conexion.createStatement();
		    ResultSet generos = consulta.executeQuery("SELECT DISTINCT Genero From Libros");
		    
		    while(generos.next()) {
		    	cmbGeneros.addItem(generos.getString("Genero"));
		    }
		    generos.close();
		    
		    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
