
public class Pos extends LinhaTelefonica{
	private Fatura[] faturas;
	
	public Pos(String numero, Cliente cliente, Chamada[] chamadas, Fatura[] faturas) {
		super(numero, cliente, chamadas);
		this.faturas = faturas;
	}

	

	public Fatura[] getFaturas() {
		return faturas;
	}



	public void setFaturas(Fatura[] faturas) {
		this.faturas = faturas;
	}



	public boolean pagarFatura() {
		return true;
	}
}
