public class Saida{
	public static void main(String avg[]){
		System.out.println("\nMAIN - ANTES da chamada do impDados!");
		
		impDados(10);

		System.out.println("\nMAIN - DEPOIS da chamada do impDados!");
	}
	public static void impDados(int x){
		System.out.println("\n X vale: "+x);
	}
}