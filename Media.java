import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		System.out.println("1� nota");
		nota1 = entrada.nextDouble();
		System.out.println("2� nota");
		nota2 = entrada.nextDouble();
		System.out.println("3� nota");
		nota3 = entrada.nextDouble();
		System.out.println("4� nota");
		nota4 = entrada.nextDouble();
		
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("m�dia �: " +media);
	}

}
