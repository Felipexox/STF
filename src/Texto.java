import java.util.Calendar;

public class Texto extends Chamada{
	private String conteudo;

	public Texto(int transmissaold, Calendar horario, LinhaTelefonica destinatario, float custo, String conteudo) {
		super(transmissaold, horario, destinatario, custo);
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return super.toString()+"\nTexto [conteudo=" + conteudo + "]";
	}
	
	
}
