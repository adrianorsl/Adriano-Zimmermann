import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double fahren, ceulsius;
		System.out.println("Digite a temperatura em Fahrenheit.");
		fahren = entrada.nextDouble();
		ceulsius = ((fahren - 32) * 5 / 9 );
		System.out.println( + ceulsius + " ºC");
		
		
	}

}
