import java.util.Scanner;

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

	public static LinhaTelefonica criar(Cliente cliente) {
		Scanner inputString = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		String numero;
		Chamada[] chamadas = new Chamada[0];
		Fatura[] faturas = new Fatura[0];
		System.out.println("Digite o numero do cliente");
		numero = inputString.nextLine();
	
		return new Pos(numero, cliente, chamadas, faturas);
	}

	public boolean pagarFatura() {
		float somaMes = 0;
		for(int i =0 ; i < super.getChamadas().length; i++) {
			somaMes += super.getChamadas()[i].getCusto();
		}
		System.out.println("A sua fatura do mês foi: "+ somaMes);
		super.setChamadas(new Chamada[0]);
		return true;
	}
}
