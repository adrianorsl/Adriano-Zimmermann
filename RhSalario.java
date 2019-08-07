import java.util.Scanner;

public class RhSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		double Horas, GanhoHora, SalarioBruto, SalarioLiquido, IR, INSS, Sindicato;
		
		System.out.println("Informe valor salarial da hora");
		GanhoHora = entrada.nextDouble();
        System.out.println("Informe horas trabalhadas");
		Horas = entrada.nextDouble();
		
		SalarioBruto = (GanhoHora * Horas);
		INSS = ((SalarioBruto * 8) / 100);
		IR =((SalarioBruto * 11) / 100);
		Sindicato = ((SalarioBruto * 5) / 100);
		SalarioLiquido = (SalarioBruto - INSS - IR - Sindicato);
		System.out.println("Seu salário Bruto e de: R$ " + SalarioBruto);
		System.out.println("Foi descontado de INSS: R$ " + INSS);
		System.out.println("Foi descontado de IR: R$ " + IR);
		System.out.println("Foi descontado do Sindicato: R$ " + Sindicato);
		System.out.println("Seu salário Liquido e de: R$ " + SalarioLiquido);
		
		
	}

}
