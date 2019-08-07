import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		System.out.println("1º nota");
		nota1 = entrada.nextDouble();
		System.out.println("2º nota");
		nota2 = entrada.nextDouble();
		System.out.println("3º nota");
		nota3 = entrada.nextDouble();
		System.out.println("4º nota");
		nota4 = entrada.nextDouble();
		
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("média é: " +media);
	}

}
