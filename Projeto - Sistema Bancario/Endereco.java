/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

public class Endereco{

	private int num;
	private int cep;	
	private String rua;
	private String cidade;
	private String estado;
	private String bairro;
	private String complemento;


//============= Método Construtor Inicializa Atributos =======================

	public Endereco(){
		num = 0;
		rua = "";
		cidade = "";
		estado = "";
		bairro = "";
		complemento = "";
	}


//================= Métodos Getters ==============================

	public int getNum(){
		return num;
	}

	public int getCep(){
		return cep;
	}

	public String getRua(){
		return rua;
	}

	public String getCidade(){
		return cidade;
	}

	public String getEstado(){
		return estado;
	}

	public String getBairro(){
		return bairro;
	}

	public String getComplemento(){
		return complemento;
	}

//================= Métodos Setters ==============================

	public void setNum(int num){
		this.num = num;
	}

	public void setCep(int cep){
		this.cep = cep;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public void setComplemento(String complemento){
		this.complemento= complemento;
	}

}