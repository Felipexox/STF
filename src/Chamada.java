import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Chamada {
	private int transmissaold;
	private Calendar horario;
	private LinhaTelefonica destinatario;
	private float custo;
	
	public Chamada(int transmissaold, Calendar horario, LinhaTelefonica destinatario, float custo) {
		super();
		this.transmissaold = transmissaold;
		this.horario = horario;
		this.destinatario = destinatario;
		this.custo = custo;
	}

	public int getTransmissaold() {
		return transmissaold;
	}

	public void setTransmissaold(int transmissaold) {
		this.transmissaold = transmissaold;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public LinhaTelefonica getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(LinhaTelefonica destinatario) {
		this.destinatario = destinatario;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	@Override
	public String toString() {
		DateFormat dtHora = DateFormat.getDateTimeInstance();

		DecimalFormat formatar = new DecimalFormat("0.00");
		return "\nChamada [transmissaold=" + transmissaold + ", horario=" + dtHora.format(horario.getTime()) + ", destinatario=" + destinatario.getNumero()
				+ ", custo=" + formatar.format(custo) + "]";
	}
	
	
	
}
