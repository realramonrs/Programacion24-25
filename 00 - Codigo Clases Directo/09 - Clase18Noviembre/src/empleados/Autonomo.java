package empleados;

public class Autonomo implements Salariable {

	private String iban;
	private String cif;
	private float costeHora;
	private float horas;
	protected float salario;
	
	public Autonomo(String iban, String cif, float costeHora,float horas) {
		super();
		this.iban = iban;
		this.cif = cif;
		this.costeHora = costeHora;
		this.horas = horas;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public float getsalario() {
		return salario;
	}

	@Override
	public void calcularSalario() {
		salario = costeHora*horas;
	}

	@Override
	public String toString() {
		return "Autonomo [iban=" + iban + ", cif=" + cif + ", salario=" + salario + "]";
	}
	
	
	
	
}
