public class Pessoa{

	private int cpf;		
	private String nome;
	private Endereco ender;


//============================================

	public Pessoa(){   //Método construtor não tem tipo e tem o mesmo nome da classe
		cpf = 10;
		nome = "Joice";
		ender = new Endereco();
	} 

	public Pessoa(int cpf, String nome, Endereco ender){  //Assinatura
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
	}

	public Pessoa(Pessoa p){       //Pessoa p2 = new Pessoa(p1) Clone, mas com endereçamento diferente
		this.cpf = p.getCpf();
		this.nome = p.getNome();
		this.ender = p.getEnder();
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