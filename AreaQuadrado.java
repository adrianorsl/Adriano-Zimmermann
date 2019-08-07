import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double area, num;
		System.out.println("Digite o numero de um lado do quadrado.");
		num = entrada.nextDouble();
		area = (num * num);
		System.out.println("Área do quadrado é: " + area);
		
	}

}
