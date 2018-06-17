import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

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
	public static LinhaTelefonica criar(Cliente cliente) {
		Scanner inputString = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		String numero;
		Chamada[] chamadas = new Chamada[0];
		System.out.println("Digite o numero do cliente");
		numero = inputString.nextLine();
		System.out.println("Digite o saldo inicial");
		float saldo = inputNum.nextFloat();
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, Utilitario.vencimentoRecarga);
		Saldo new_Saldo = new Saldo(saldo, vencimento);
		
		return new Pre(numero, cliente, chamadas, new_Saldo);
	}
	public boolean recarregar(float valor) {
		float newValor = this.saldo.getValor() + valor;
		this.saldo.setValor(newValor);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, Utilitario.vencimentoRecarga);
		this.saldo.setVencimento(vencimento);
		return true;
	}
	public boolean chamar(LinhaTelefonica destinatario) {
		if(saldo.getValor() > 0) {
			super.chamar(destinatario);
			int lastIndex = super.getChamadas().length-1;
			float new_Saldo = saldo.getValor() - super.getChamadas()[lastIndex].getCusto();
			saldo.setValor(new_Saldo);
			return true;
		}
		return false;
	}
	public boolean chamar(LinhaTelefonica destinatario, String conteudo) {
		if(saldo.getValor() > 0) {
			super.chamar(destinatario, conteudo);
			int lastIndex = super.getChamadas().length-1;
			float new_Saldo = saldo.getValor() - super.getChamadas()[lastIndex].getCusto();
			saldo.setValor(new_Saldo);
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return super.toString() + "Pre [saldo=" + saldo + "]";
	}
	
}
