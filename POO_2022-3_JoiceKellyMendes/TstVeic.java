import java.util.Scanner;

public class TstVeic{

	public static void main(String avg[]){

		Scanner input = new Scanner(System.in);

		Leitura l = new Leitura();
		Passeio p = new Passeio();
		Carga c = new Carga();

		int opcao = 0;

		System.out.println("MENU: ");
		System.out.println("1- Cadastrar Veiculo de Passeio;");
		System.out.println("2- Cadastrar Veiculo de Carga;");
		System.out.println("Escolha uma opcao: ");
		
		opcao = input.nextInt();
	

		switch(opcao){
			case 1: 
				p.setPlaca(l.entDados("Informe a PLACA: "));
				p.setMarca(l.entDados("Informe a MARCA: "));
				p.setModelo(l.entDados("Informe a MODELO: "));
				p.setCor(l.entDados("Informe a COR: "));
				p.setQntRodas(Integer.parseInt(l.entDados("\nInforme a QNT DE RODAS: ")));
				p.setVelocMax(Integer.parseInt(l.entDados("\nInforme a VELOC MAXIMA em Km/h: ")));

				p.getMotor().setQntPistoes(Integer.parseInt(l.entDados("Informe a QNT DE PISTÕES: ")));
				p.getMotor().setPotencia(Integer.parseInt(l.entDados("Informe a POTENCIA: ")));

				p.setDataCadastro(l.entDados("Informe a DATA DE CADASTRO: "));
			
				p.setQtdePassageiro(Integer.parseInt(l.entDados("Informe a QNTDE PASSAGEIROS: ")));

				System.out.println("\nPLACA...: "+p.getPlaca());
				System.out.println("MARCA...: "+p.getMarca());
				System.out.println("MODELO...: "+p.getModelo());
				System.out.println("COR...: "+p.getCor());
				System.out.println("VELOCIDADE MAX...: "+p.calcVel());
				System.out.println("QNT DE PISTOES...: "+p.getMotor().getQntPistoes());
				System.out.println("POTENCIA...: "+p.getMotor().getPotencia());
				System.out.println("DATA CADASTRO...: "+p.getDataCadastro());
				System.out.println("QNTDE PASSAGEIRO...: "+p.getQtdePassageiro());
				
			break;
		
			case 2:
				c.setPlaca(l.entDados("Informe a PLACA: "));
				c.setMarca(l.entDados("Informe a MARCA: "));
				c.setModelo(l.entDados("Informe a MODELO: "));
				c.setCor(l.entDados("Informe a COR: "));
				c.setQntRodas(Integer.parseInt(l.entDados("\nInforme a QNT DE RODAS: ")));
				c.setVelocMax(Integer.parseInt(l.entDados("\nInforme a VELOC MAXIMA em Km/h: ")));

				c.getMotor().setQntPistoes(Integer.parseInt(l.entDados("Informe a QNT DE PISTÕES:: ")));
				c.getMotor().setPotencia(Integer.parseInt(l.entDados("Informe a POTENCIA: ")));
				
				c.setDataCadastro(l.entDados("Informe a DATA DE CADASTRO: "));
			
				c.setTara(Integer.parseInt(l.entDados("Informe a TARA: ")));
				c.setCargaMax(Integer.parseInt(l.entDados("Informe a CARGA MAX: ")));

				System.out.println("\nPLACA...: "+c.getPlaca());
				System.out.println("MARCA...: "+c.getMarca());
				System.out.println("MODELO...: "+c.getMarca());
				System.out.println("COR...: "+c.getCor());
				System.out.println("VELOCIDADE MAX...: "+c.getVelocMax());
				System.out.println("QNT DE PISTOES...: "+c.getMotor().getQntPistoes());
				System.out.println("POTENCIA...: "+c.getMotor().getPotencia());
				System.out.println("DATA CADASTRO...: "+c.getDataCadastro());
				System.out.println("TARA...: "+c.getTara());
				System.out.println("CARGA MAX...: "+c.getCargaMax());

				
			break;
		}
	}
}