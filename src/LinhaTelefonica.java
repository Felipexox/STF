
public class LinhaTelefonica {
	private String numero;
	private Cliente cliente;
	private Chamada[] chamadas;
	
	
	
	public LinhaTelefonica(String numero, Cliente cliente, Chamada[] chamadas) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.chamadas = chamadas;
	}

	


	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Chamada[] getChamadas() {
		return chamadas;
	}




	public void setChamadas(Chamada[] chamadas) {
		this.chamadas = chamadas;
	}




	public LinhaTelefonica criar() {
		return new LinhaTelefonica(null, null, null);
	}
	
	public LinhaTelefonica pesquisarLinha(String numeor, LinhaTelefonica[] linhas) {
		return new LinhaTelefonica(null, null, null);
	}
	
	public boolean chamar(String destinatario) {
		return true;
	}
	
	public boolean chamar(String destinatario, String conteudo) {
		return true;
	}
}
