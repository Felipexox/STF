import java.util.Calendar;

public class Voz extends Chamada {
	private Calendar termino;

	public Voz(int transmissaold, Calendar horario, LinhaTelefonica destinatario, float custo, Calendar termino) {
		super(transmissaold, horario, destinatario, custo);
		this.termino = termino;
	}

	public Calendar getTermino() {
		return termino;
	}

	public void setTermino(Calendar termino) {
		this.termino = termino;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+" [Voz [termino=" + termino.getTime() + "]]";
	}
	
	
	
}
