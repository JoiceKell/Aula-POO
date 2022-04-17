public class Pessoa{

	private int cpf;		
	private String nome;
	private Endereco ender;


//============================================

	public Pessoa(){   //Método construtor não tem tipo e tem o mesmo nome da classe
		cpf = 10;
		nome = "Joice";
		//ender = new Endereco();
	} 

	public Pessoa(int cpf, String nome, Endereco ender){  //Assinatura
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}

	public Pessoa(int doc, Endereco dados, String apelido){
		this.cpf = doc;
		this.nome = apelido;
		this.ender = dados;
	}


	public int impDados(){
		System.out.println("\nMetodo impDados DEFAULT da classe Pessoa");
		return 0;
	}

	public String impDados(int valor){
		System.out.println("\nMetodo impDados SOBRECARGA1 da classe Pessoa "+valor);
		return "";
	}

//=============================================



//===========================================

	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}

//===========================================

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setCpf(int cpf){
		this.cpf = cpf;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}