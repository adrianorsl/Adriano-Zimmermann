import java.util.Scanner;

public class GanhoHoraMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		double horas, salario, ganho;
		System.out.println("Quanto você ganha por hora?");
		ganho = entrada.nextDouble();
		System.out.println("Quantas horas você trabalhou no mês?");
		horas = entrada.nextDouble();
		salario = (ganho * horas);
		System.out.println("Seu salário deste mês é: "  + salario);
		
	}

}
