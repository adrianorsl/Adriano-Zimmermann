import java.util.Scanner;

public class DoisNumerosInteirosEUmReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		float real, a, b, c, d;
		
		System.out.println("Digite 1º inteiro.");
		num1 = entrada.nextInt();
		System.out.println("Digite 2º inteiro.");
		num2 = entrada.nextInt();
		System.out.println("Digite um número real.");
		real = entrada.nextFloat();
		
		a = ((num1 * 2) + num2 / 2);
		System.out.println("dobro do primerio com metade do segundo é: " + a );
		b = ((num1 * 3 ) + real);
		System.out.println("O triplo do 1º com o terceiro é: " + b);
		c = (real * real * real);
		System.out.println("O número real elevado ao cubo é: " + c);
		
		
		
		
		
		
	}

}
