public class Carga extends Veiculo{

	private int tara;
	private int cargaMax;		

	public Carga(){
		tara = 0;
		cargaMax = 0;
	}


	public int getTara(){
		return tara;
	}

	public int getCargaMax(){
		return cargaMax;
	}

	public void setTara(int tara){
		this.tara = tara;
	}

	public void setCargaMax(int cargaMax){
		this.cargaMax = cargaMax;
	}
}