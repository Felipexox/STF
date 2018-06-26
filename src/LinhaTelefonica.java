import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

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

	@Override
	public String toString() {
	
		return "\nLinhaTelefonica [numero=" + numero + ", cliente=" + cliente + "\n chamadas=" + Arrays.toString(chamadas);
	}




	public static LinhaTelefonica criar(Cliente cliente) {
		Scanner inputString = new Scanner(System.in);
		String numero;
		Chamada[] chamadas = new Chamada[0];
		System.out.println("Digite o numero do cliente");
		numero = inputString.nextLine();
		return new LinhaTelefonica(numero, cliente, chamadas);
	}
	
	public static LinhaTelefonica pesquisarLinha(String numero, LinhaTelefonica[] linhas) {
		for(int i = 0; i < Utilitario.contLinhas; i++ ){
			if(numero.equals(linhas[i].numero)){
				return linhas[i];
			}
			
		}
		return null;
	}
	
	public boolean chamar(LinhaTelefonica destinatario) {
		Random rand = new Random(Calendar.getInstance().getTimeInMillis());
		rand.setSeed(Calendar.getInstance().getTime().getTime());
		Calendar inicio = Calendar.getInstance();
		Calendar fim = Calendar.getInstance();
		fim.add(Calendar.MINUTE, rand.nextInt(15));
		float minInicio = (float)(inicio.getTimeInMillis())/60000;
		float minFim = (float)(fim.getTimeInMillis())/60000;
		float custo = (minFim - minInicio) * Utilitario.custoChamadaVoz; 
		Voz chamada = new Voz(0, inicio , destinatario, custo , fim);
		addChamada(chamada);
		return true;
	}
	
	public boolean chamar(LinhaTelefonica destinatario, String conteudo) {
		float sizeConteudo = conteudo.length();
		float custo = ((sizeConteudo / Utilitario.comprimentoChamadaTexto) * Utilitario.custoChamadaTexto);
		Texto chamada = new Texto(0, Calendar.getInstance() , destinatario, custo, conteudo);
		addChamada(chamada);
		return true;
	}
	
	private void addChamada(Chamada chamada){
		int length = chamadas.length;
		Chamada[] newChamadas = new Chamada[length+1];
		for(int i = 0; i < chamadas.length; i++){
			newChamadas[i] = chamadas[i];
		}
		newChamadas[length] = chamada;
		chamadas = newChamadas;
	}
}
