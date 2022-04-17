public class Pessoa{

	private int cpf = 0;		
	private String nome = "";

//===========Endereco===================	

	private int num = 0;	
	private String rua = "";

	public int getNum(){
		return num;
	}

	public String getRua(){
		return rua;
	}

	public void setNum(int num){
		this.num = num;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

//====================================


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