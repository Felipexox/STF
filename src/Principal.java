import java.util.Scanner;

public class Principal {
	private static Cliente[] clientes = new Cliente[0];
	private static LinhaTelefonica[] linhas = new LinhaTelefonica[0];
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("rua1", 1, "cep1", "cidade1", "estado1");
		Endereco endereco2 = new Endereco("rua2", 2, "cep2", "cidade2", "estado2");
		
		Cliente cliente1 = new Cliente(0, "Cliente1", "CPF1", endereco1);
		Cliente cliente2 = new Cliente(1, "Cliente2", "CPF2", endereco2);
		
		
		LinhaTelefonica linha1 = Pos.criar(cliente1);
		LinhaTelefonica linha2 = Pos.criar(cliente2);
		
		
		System.out.println(linha2);
		
		linha1.chamar(linha2, "Bla bla bla");
		linha1.chamar(linha2);
		
		System.out.println(linha1);
		
		if(linha1 instanceof Pos) {
			((Pos)linha1).pagarFatura();
		}
		
		//Menu
		Scanner input = new Scanner(System.in);
		System.out.println("--------- Opcoes ---------");
		System.out.println("- 1 - Cadastrar Cliente");
		System.out.println("- 2 - Cadastrar Pre Pago");
		System.out.println("- 3 - Cadastrar Pos Pago");
		System.out.println("- 4 - Ligar");
		System.out.println("- 5 - Recarregar");
		System.out.println("- 6 - Pesquisar Cliente");
		System.out.println("- 7 - Ligar");
		int escolha = Integer.parseInt(input.nextLine());
		switch(escolha) {
			case 1:
				Cliente cliente = Cliente.criar();
				addCliente(cliente);
				break;
			case 2: 
				System.out.println("Digite o CPF do cliente");
				String cpf = input.nextLine();
				Cliente tempCliente = pesquisarCliente(cpf);
				Pre pre = Pre.criar();
				break;
		
		}
		
	}
	private static void addLinha(LinhaTelefonica linha){
		int length = linhas.length;
		LinhaTelefonica[] newLinhas = new LinhaTelefonica[length+1];
		for(int i = 0; i < linhas.length; i++){
			newLinhas[i] = linhas[i];
		}
		newLinhas[length] = linha;
		linhas = newLinhas;
	}
	private static void addCliente(Cliente cliente){
		int length = clientes.length;
		Cliente[] newClientes = new Cliente[length+1];
		for(int i = 0; i < clientes.length; i++){
			newClientes[i] = clientes[i];
		}
		newClientes[length] = cliente;
		clientes = newClientes;
	}
	private static Cliente pesquisarCliente(String cpf) {
		for(int i = 0; i < clientes.length; i ++) {
			if(clientes[i].getCpf().equals(cpf)) {
				return clientes[i];
			}
		}
		return null;
	}
}
