import java.util.Scanner;

public class Endereco {
	private String rua;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	
	
	
	public Endereco(String rua, int numero, String cep, String cidade, String estado) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}


	


	public String getRua() {
		return rua;
	}





	public void setRua(String rua) {
		this.rua = rua;
	}





	public int getNumero() {
		return numero;
	}





	public void setNumero(int numero) {
		this.numero = numero;
	}





	public String getCep() {
		return cep;
	}





	public void setCep(String cep) {
		this.cep = cep;
	}





	public String getCidade() {
		return cidade;
	}





	public void setCidade(String cidade) {
		this.cidade = cidade;
	}





	public String getEstado() {
		return estado;
	}





	public void setEstado(String estado) {
		this.estado = estado;
	}





	@Override
	public String toString() {
		return "rua: " + rua + ", " + numero + " cep: " + cep + ", cidade: " + cidade + ", estado: "
				+ estado;
	}





	public static Endereco criar() {
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		String rua;
		int numero;
		String cep;
		String cidade;
		String estado;
		System.out.println("Digite a rua");
		rua = inputString.nextLine();
		System.out.println("Digite a numero");
		numero = inputInt.nextInt();
		System.out.println("Digite a cep");
		cep = inputString.nextLine();
		System.out.println("Digite a cidade");
		cidade = inputString.nextLine();
		System.out.println("Digite a estado");
		estado = inputString.nextLine();
		
		return new Endereco(rua, numero, cep,cidade,estado);
	}
}
