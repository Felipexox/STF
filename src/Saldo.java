import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Saldo {
	private float valor;
	private Calendar vencimento;
	
	public Saldo(float valor, Calendar vencimento) {
		super();
		this.valor = valor;
		this.vencimento = vencimento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public String toString() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Saldo [valor=" + valor + ", vencimento=" + sdf.format( vencimento.getTime()) + "]";
	}
	
	
	
}
