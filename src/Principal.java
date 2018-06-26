import java.util.Scanner;

public class Principal {
	private static Cliente[] clientes = new Cliente[100];
	private static LinhaTelefonica[] linhas = new LinhaTelefonica[100];
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("rua1", 1, "cep1", "cidade1", "estado1");
		Endereco endereco2 = new Endereco("rua2", 2, "cep2", "cidade2", "estado2");
		
		Cliente cliente1 = new Cliente(0, "Cliente1", "CPF1", endereco1);
		Cliente cliente2 = new Cliente(1, "Cliente2", "CPF2", endereco2);
		addCliente(cliente1);
		addCliente(cliente2);
		
		/*
		
		LinhaTelefonica linha1 = Pos.criar(cliente1);
		LinhaTelefonica linha2 = Pos.criar(cliente2);
		
		
		System.out.println(linha2);
		
		linha1.chamar(linha2, "Bla bla bla");
		linha1.chamar(linha2);
		
		System.out.println(linha1);
		
		if(linha1 instanceof Pos) {
			((Pos)linha1).pagarFatura();
		}
		*/
		//Menu
		int escolha = 0;
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("--------- Opcoes ---------");
			System.out.println("- 1 - Cadastrar Cliente   ");
			System.out.println("- 2 - Cadastrar Pre Pago  ");
			System.out.println("- 3 - Cadastrar Pos Pago  ");
			System.out.println("- 4 - Ligar               ");
			System.out.println("- 5 - Mensagem            ");
			System.out.println("- 6 - Recarregar          ");
			System.out.println("- 7 - Pesquisar Cliente   ");
			System.out.println("- 8 - Pesquisar Linha Telefonica ");
			System.out.println("- 9 - Sair                ");
			escolha = Integer.parseInt(input.nextLine());
			switch(escolha) {
				case 1:
					Cliente cliente = Cliente.criar();
					addCliente(cliente);
					break;
				case 2: 
					System.out.println("Digite o CPF do cliente");
					String cpf = input.nextLine();
					cliente = pesquisarCliente(cpf);
					if(cliente != null){
						LinhaTelefonica pre = Pre.criar(cliente);
						addLinha(pre);
					}else{
						System.out.println("Cliente não encontrado");
					}
					break;
				case 3:
					System.out.println("Digite o CPF do cliente");
					cpf = input.nextLine();
					cliente = pesquisarCliente(cpf);
					if(cliente != null){
						LinhaTelefonica pos = Pos.criar(cliente);
						addLinha(pos);
					}else{
						System.out.println("Cliente não encontrado");
					}
					break;
				case 4:
					System.out.println("Digite o numero origem");
					String numeroOrigem = input.nextLine();
					LinhaTelefonica linhaOrigem = LinhaTelefonica.pesquisarLinha(numeroOrigem, linhas);
					if(linhaOrigem == null){
						System.out.println("Numero inexistente");
						break;
					}
					System.out.println("Digite o numero destino");
					String numeroDestino = input.nextLine();
					LinhaTelefonica linhaDestino = LinhaTelefonica.pesquisarLinha(numeroDestino, linhas);
					if(linhaDestino == null){
						System.out.println("Numero inexistente");
						break;
					}
					linhaOrigem.chamar(linhaDestino);
					break;
				case 5:
					System.out.println("Digite o numero origem");
					numeroOrigem = input.nextLine();
					linhaOrigem = LinhaTelefonica.pesquisarLinha(numeroOrigem, linhas);
					System.out.println("Digite o numero destino");
					numeroDestino = input.nextLine();
					linhaDestino = LinhaTelefonica.pesquisarLinha(numeroDestino, linhas);
					System.out.println("Digite sua mensagem");
					String mensagem = input.nextLine();
					linhaOrigem.chamar(linhaDestino,mensagem);
					break;
				case 6:
					System.out.println("Digite o numero origem");
					numeroOrigem = input.nextLine();
					LinhaTelefonica linha = LinhaTelefonica.pesquisarLinha(numeroOrigem, linhas);
					if(linha instanceof Pre){
						float valor = Float.parseFloat(input.nextLine());
						((Pre)linha).recarregar(valor);
					}else{
						System.out.println("Essa linha não é pre paga");
					}
					break;
				case 7:
					System.out.println("Digite o CPF do cliente");
					cpf = input.nextLine();
					cliente = pesquisarCliente(cpf);
					System.out.println("Informacoes do cliente:");
					System.out.println(cliente);
					break;
				case 8:
					System.out.println("Digite o numero");
					numeroOrigem = input.nextLine();
					linha = LinhaTelefonica.pesquisarLinha(numeroOrigem, linhas);
					if(linha != null){
						System.out.println(linha);
					}else{
						System.out.println("Linha não encontrada");
					}
					break;
			}
		}while(escolha != 9);
	}
	private static void addLinha(LinhaTelefonica linha){
		linhas[Utilitario.contLinhas] = linha;
		Utilitario.contLinhas++;
	}
	private static void addCliente(Cliente cliente){
		clientes[Utilitario.contClientes] = cliente;
		Utilitario.contClientes++;
	}
	private static Cliente pesquisarCliente(String cpf) {
		for(int i = 0; i < Utilitario.contClientes; i ++) {
			if(clientes[i].getCpf().equals(cpf)) {
				return clientes[i];
			}
		}
		return null;
	}
	
}
