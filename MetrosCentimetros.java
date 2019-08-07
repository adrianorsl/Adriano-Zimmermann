import java.util.Scanner;

public class MetrosCentimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double metros, centimetros = 0;
		System.out.println("digite quantos metros você quer converter em centimetros: ");
		metros = entrada.nextDouble();
		centimetros = (metros * 100);
		System.out.println(+ centimetros + "cm");	
		
		
	}

}
