import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0;
		double num1, num2 = 0;
		System.out.println("digite o 1� n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("digite o 2� n�mero: ");
		num2 = entrada.nextDouble();
		soma = (num1 + num2);
		System.out.println(+soma);
		
	}

}
