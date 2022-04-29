
public abstract class Veiculo{

	private String placa;		
	private String marca;
	private String modelo;
	private String cor;
	private int qntRodas;
	private int velocMax;

	private Motor motor;
	private String dataCadastro;


//============================================

	public Veiculo(){ 

		placa = "";		
		marca = "";
		modelo = "";
		cor = "";
		qntRodas = 0;
		velocMax = 0;
		motor = new Motor();
		dataCadastro = "";

	} 

//=============================================

	public abstract int calcVel();	

//===========================================

	public Motor getMotor(){
		return motor;
	}

	public void setMotor(Motor motor){
		this.motor = motor;
	}

//===========================================

	public String getPlaca(){
		return placa;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}

	public String getCor(){
		return cor;
	}

	public int getQntRodas(){
		return qntRodas;
	}

	public int getVelocMax(){
		return velocMax;
	}

	public String getDataCadastro(){
		return dataCadastro;
	}

//=============================================

	public void setPlaca(String placa){
		this.placa = placa;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public void setQntRodas(int qntRodas){
		this.qntRodas = qntRodas;
	}

	public void setVelocMax(int velocMax){

		if(velocMax < 10 || velocMax > 250){
			System.out.println("A velocidade está fora dos limites brasileiros");
			this.velocMax = 100;
		} else {
			this.velocMax = velocMax;
		}
	}

	public void setDataCadastro(String dataCadastro){
		this.dataCadastro = dataCadastro;
	}

}


