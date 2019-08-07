import java.util.Scanner;

public class LojaTintas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int metros, latas;
		float valor;
		double res;
		
		System.out.println("Informe quantos metros quadrados seram pintados.");
		metros = entrada.nextInt();
		
		if (metros <= 54) {
			System.out.println("1 lata de tinta");
			System.out.println("Seu Gasto e de R$ 80,00");
		} else if ( metros > 54) {
			latas = ( metros / 54);
			res = (metros % 54);
			    if (res > 0) {
			    	latas = (latas + 1);
			    	valor = (latas * 80);
			    	System.out.println("Você deve comprar "+ latas + " latas de tinta.");
			    	System.out.println("Você ira gastar R$ " + valor);
			    	
			    }else if (res == 0) {
			    	valor = (latas * 80);
			    	System.out.println("Você deve comprar "+ latas + " latas de tinta.");
			    	System.out.println("Você ira gastar R$ " + valor);
			    }
			    
			
		}
			
		
		
		
		
	}

}
