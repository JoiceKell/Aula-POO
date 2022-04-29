/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

public class Cliente{

	private String cpf;		
	private String nome;
	private String email;
	private String telefone;
	
	private ContaBancaria conta;
	private Endereco ender;


//============= Método Construtor Inicializa Atributos =======================

	public Cliente(){  
		
		cpf = "";
		nome = "";
		email = "";
		telefone = "";
		ender = new Endereco();
		conta = new ContaBancaria();

	} 

//============= Métodos Cria Conta =======================

	public void criaContPou(int numConta, double saldo, Cliente cliente){ 
		
		this.conta = new ContaPoupanca(numConta, saldo, cliente);

	}
	
	public void criaContCor(int numConta, double saldo, Cliente cliente){  
		
		this.conta = new ContaCorrente(numConta, saldo, cliente);

	}

//=============== Métodos Getter e Setter de Endereco e Conta ============================

	
	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

//=============== Métodos Getter e Setter dos demais Atributos ==========================

	public String getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public String getEmail(){
		return email;
	}

	public String getTelefone(){
		return telefone;
	}



	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEmail(String email){
		this.nome = email;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

}