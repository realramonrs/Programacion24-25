package ejemplosVentana;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana2 extends JFrame {
	
	JLabel lblResultado;
	JTextField txtResultado,txtOtroResultado;
	JButton btnUno,btnDos,btnTres,btnMas,btnMenos,btnIgual;
	double operando1,operando2,resultado;
	char operacion;
	
	public Ventana2() {
		this.setTitle("Calculadora Muy Básica");
		this.setSize(400, 400);
		this.setLocation(100,350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		initComponents();
		
		//Gestión de eventos
		EscuchadorBotonesNumericos e = new EscuchadorBotonesNumericos();
		btnUno.addActionListener(e);
		btnDos.addActionListener(e);
		btnTres.addActionListener(new EscuchadorBotonesNumericos());
		btnMas.addActionListener(new EscuchadorBotonesOperacion());
		btnMenos.addActionListener(new EscuchadorBotonesOperacion());
		
		txtResultado.addMouseListener(new EscuchadorMouseTextField());
		lblResultado.addMouseListener(new EscuchadorMouseTextField());
		txtOtroResultado.addMouseListener(new EscuchadorMouseTextField());
		
		this.addWindowListener(new WindowAdapter() {

			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
		
		btnIgual.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Obtener el operando 2
				operando2 = Double.parseDouble(txtResultado.getText());
				//Evalúa que operación se quiere realizar
				
				switch(operacion) {
				case '+':
					resultado = operando1 + operando2;
					break;
				case'-':
					resultado = operando1 - operando2;
					break;
				}
				
				//Volcar el resultado a la caja de texto
				txtResultado.setText(Double.toString(resultado));
			}
			
		});
		
		
		//Añadir controles al JFRAME
		add(lblResultado);
		add(txtResultado);
		getContentPane().add(btnUno);
		getContentPane().add(btnDos);
		add(btnTres);
		add(btnMas);
		add(btnMenos);
		add(btnIgual);
		add(txtOtroResultado);
		
		this.setVisible(true);
		
	}
	
	private void initComponents() {
		this.lblResultado = new JLabel("Introduzca un número");
		this.txtResultado = new JTextField(10);
		this.btnUno = new JButton("1");
		this.btnDos = new JButton("2");
		this.btnTres = new JButton("3");
		this.btnMas = new JButton("+");
		this.btnMenos = new JButton("-");
		this.btnIgual = new JButton("=");
		this.txtOtroResultado = new JTextField(10);
		
	}
	
	//Clase Interna para la gestión de eventos
	class EscuchadorBotonesNumericos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtenemos botón que ha sido pulsado
			JButton btnPulsado = (JButton) e.getSource();
			txtResultado.setText(txtResultado.getText()+ btnPulsado.getText());
						
			}
		
	}
	
	class EscuchadorBotonesOperacion implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Obtenemos primer operando
			operando1 = Double.parseDouble(txtResultado.getText());
			//Obtenemos simbolo operacion
			operacion = ((JButton)e.getSource()).getText().charAt(0);	
			
			//Borrar lo que hay en la caja de texto
			txtResultado.setText("");
			}
	}
	
	class EscuchadorMouse2 extends MouseAdapter{

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
	
	class EscuchadorMouseTextField implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//Obtener la caja de texto
			if(e.getSource() instanceof JTextField) {
				JTextField caja = (JTextField) e.getSource();
				caja.setBackground(Color.BLUE);
			}
			else {
				if(e.getSource() instanceof JLabel) {
					JLabel etiqueta = (JLabel) e.getSource();
					if(etiqueta == lblResultado) {
						txtResultado.setBackground(Color.BLUE);
					}
				}
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			//Obtener la caja de texto
			if(e.getSource() instanceof JTextField) {
				JTextField caja = (JTextField) e.getSource();
				caja.setBackground(Color.white);
			}
			else {
				if(e.getSource() instanceof JLabel) {
					JLabel etiqueta = (JLabel) e.getSource();
					if(etiqueta == lblResultado) {
						txtResultado.setBackground(Color.WHITE);
					}
				}
			}
		}
		
	}
	
	class EscuchadorVentana implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(rootPane, "Hasta la próxima");
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
	
	

}
