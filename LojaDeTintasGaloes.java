import java.util.Scanner;

public class LojaDeTintasGaloes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double valorL, valorG, latas, metros, resL, resG;
		int galao;
		
		System.out.println("Informe quantos metros quadrados seram pintados.");
		metros = entrada.nextDouble();
		
		if (metros < 108) {
			galao = (int) (metros / 21.6);
			resG = (metros % 21.6);
			if (resG > 0) {
				galao = (galao + 1);
				valorG = (galao * 25);
				System.out.println("Você terá que comprar " + galao + " galões. Ou uma lata de tinta");
				System.out.println("Se você quiser comprar em galão custará R$ " + valorG + ". Ou se quiser em lata custará R$ 80,00." );
				
			}else {
				valorG = (galao * 25);
				System.out.println("Você terá que comprar " + galao + " galões. Ou uma lata de tinta");
				System.out.println("Se você quiser comprar em galão custará R$ " + valorG + ". Ou se quiser em lata custará R$ 80,00." );
			}
					
		}else if (metros >= 108) {
			latas =(int) (metros / 108);
			resL = (metros % 108);
			galao = (int) (metros / 21.6);
			resG = (metros % 21.6);
			if (resG > 0) {
				galao = (galao + 1);
				valorG = (galao * 25);
				System.out.println("Você terá que comprar " + galao + " galões.	");
				System.out.println("Se você quiser comprar em galão custará R$ " + valorG + "." );
				if (resL > 0 ) {
					latas = (latas + 1);
					valorL = (latas * 80);
					System.out.println("Você terá que comprar " + latas + " latas.");
					System.out.println("Se você quiser comprar em latas custará R$ " + valorL );
				}else {
					valorL = (latas * 80);
					System.out.println("Você terá que comprar " + latas + " latas.");
					System.out.println("Se você quiser comprar em latas custará R$ " + valorL );					
				}
			}else {
				valorG = (galao * 25);
				System.out.println("Você terá que comprar " + galao + " galões.	");
				System.out.println("Se você quiser comprar em galão custará R$ " + valorG + "." );
				if (resL > 0 ) {
					latas = (latas + 1);
					valorL = (latas * 80);
					System.out.println("Você terá que comprar " + latas + " latas.");
					System.out.println("Se você quiser comprar em latas custará R$ " + valorL );
				}else {
					valorL = (latas * 80);
					System.out.println("Você terá que comprar " + latas + " latas.");
					System.out.println("Se você quiser comprar em latas custará R$ " + valorL );					
				}
			}
		}
		
		
		
		
		
		
		
	}

}
