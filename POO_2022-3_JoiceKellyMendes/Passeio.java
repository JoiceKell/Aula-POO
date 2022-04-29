public class Passeio extends Veiculo{

	private int qtdePassageiro;		

	public Passeio(){
		qtdePassageiro = 0;
	}


	public int getQtdePassageiro(){
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro){
		this.qtdePassageiro = qtdePassageiro;
	}

	public int calcVel(){
		return (1000);
	}
}