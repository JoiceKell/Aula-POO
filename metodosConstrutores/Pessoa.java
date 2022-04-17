public class Pessoa{

	private int cpf = 0;		
	private String nome = "";
	
	private Endereco ender = new Endereco();


//============================================

	public Pessoa(){   //Método construtor não tem tipo e tem o mesmo nome da classe
		System.out.println("\nMetodo Construtor default da classe Pessoa");
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