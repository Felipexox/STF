import java.util.Calendar;

public class Fatura {
	private int faturaId;
	private Calendar dataInicial;
	private Calendar dataFinal;
	private float valor;
	
	public Fatura(int faturaId, Calendar dataInicial, Calendar dataFinal, float valor) {
		super();
		this.faturaId = faturaId;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.valor = valor;
	}

	public int getFaturaId() {
		return faturaId;
	}

	public void setFaturaId(int faturaId) {
		this.faturaId = faturaId;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
