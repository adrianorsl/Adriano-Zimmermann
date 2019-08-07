import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double altura, ideal;
		
		
		System.out.println("Digite sua altura em metros.");
		altura = entrada.nextDouble();
		ideal = ((72.2 * altura) - 58);	
		System.out.println("Seu peso ideal é: " + ideal);
		
		
		
		
	}

}
