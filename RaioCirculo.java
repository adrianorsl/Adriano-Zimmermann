import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double area, raio;
		System.out.println("digite o raio do circulo.");
		raio = entrada.nextDouble();
		area = (3.14 * raio * raio);
		System.out.println("Área do circulo é: " + area);
				
		
	}

}
