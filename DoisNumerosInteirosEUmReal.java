import java.util.Scanner;

public class DoisNumerosInteirosEUmReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		float real, a, b, c, d;
		
		System.out.println("Digite 1� inteiro.");
		num1 = entrada.nextInt();
		System.out.println("Digite 2� inteiro.");
		num2 = entrada.nextInt();
		System.out.println("Digite um n�mero real.");
		real = entrada.nextFloat();
		
		a = ((num1 * 2) + num2 / 2);
		System.out.println("dobro do primerio com metade do segundo �: " + a );
		b = ((num1 * 3 ) + real);
		System.out.println("O triplo do 1� com o terceiro �: " + b);
		c = (real * real * real);
		System.out.println("O n�mero real elevado ao cubo �: " + c);
		
		
		
		
		
		
	}

}
