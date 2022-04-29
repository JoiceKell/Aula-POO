public class Motor{

	private int qntPistoes;	
	private int potencia;

	public Motor(){
		qntPistoes = 0;
		potencia = 0;
	}

	public int getQntPistoes(){
		return qntPistoes;
	}

	public int getPotencia(){
		return potencia;
	}

	public void setQntPistoes(int qntPistoes){
		this.qntPistoes = qntPistoes;
	}

	public void setPotencia(int potencia){
		this.potencia = potencia;
	}

}