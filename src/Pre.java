
public class Pre extends LinhaTelefonica {
	private Saldo saldo;

	public Pre(String numero, Cliente cliente, Chamada[] chamadas, Saldo saldo) {
		super(numero, cliente, chamadas);
		this.saldo = saldo;
	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}
	
	public boolean recarregar(float valor) {
		return true;
	}
}
