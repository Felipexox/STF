import java.util.Scanner;

public class Cliente {
	private int clienteId;
	private String cpf;
	private String nome;
	private Endereco endereco;
	
	
	
	public Cliente(int clienteId, String nome, String cpf, Endereco endereco) {
		super();
		this.clienteId = clienteId;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}


	

	public int getClienteId() {
		return clienteId;
	}




	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public Endereco getEndereco() {
		return endereco;
	}




	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}




	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
	}




	public static Cliente criar() {
		int id = 1000;
		String cpf;
		String nome;
		Scanner inputString = new Scanner(System.in);
		
		System.out.println("Digite a nome");
		nome = inputString.nextLine();
		
		System.out.println("Digite a cpf");
		cpf = inputString.nextLine();
		
		Endereco endereco = Endereco.criar();
		return new Cliente(id,nome,cpf,endereco);
	}
}
