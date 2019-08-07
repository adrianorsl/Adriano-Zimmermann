import java.util.Scanner;

public class PesoIdealHomemMulher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
		
		double alturaH, idealH, alturaF, idealF;
		char sexo = ' ';
		
		System.out.println("Informe sexo, M masculino ou F feminino.");
		sexo = entrada.nextLine().charAt(0);
		
		
		if (sexo == 'm') {
		    System.out.println("Digite sua altura em metros.");
		    alturaH = entrada.nextDouble();
		    idealH = ((72.2 * alturaH) - 58);	
		    System.out.println("Seu peso ideal é: " + idealH);
	    
		} else if (sexo == 'f') {
			
	    	System.out.println("Digite sua altura em metros.");
	        alturaF = entrada.nextDouble();
	        idealF = ((62.1 * alturaF) - 44.7);	
	        System.out.println("Seu peso ideal é: " + idealF);
	    
		} else {
	    	System.out.println("sexo invalido");
		}
		
	}
	
	
	

}
