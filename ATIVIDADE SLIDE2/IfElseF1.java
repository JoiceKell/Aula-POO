public class IfElseF1{
	public static void main(String[] avgs){
		int a=0, b=20;
		
		for(a=0; a<b; a++){
			if(a==(b/2)){
				System.out.println("A é igual a metade de B, logo A vale: "+a+" e B vale: "+b);
			} else if(a!=(b/2)){
				System.out.println("A é diferente da metade de b, logo A vale: "+a+" e B vale: "+b);
			}
		}
	}
}