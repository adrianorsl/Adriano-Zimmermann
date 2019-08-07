import java.util.Scanner;

public class JoãoPescador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double peixe, multa, excesso;
		peixe = 0;
		System.out.println("Informe Kg pescados.");
		peixe = entrada.nextDouble();
		
		if (peixe > 50) {
			excesso = (peixe - 50);
			System.out.println("Você tem um excesso de: " + excesso);
			multa = (excesso * 4);
			System.out.println("Sua multa foi de: R$ " + multa);
					
	   } else if (peixe < 50) {
		   excesso = (peixe - 50 );
		   System.out.println("Faltou, " + excesso + " KG para atingir 50 KG");
		 		   
	   } else {
		   
		   System.out.println("Seu excesso e de: 0 ");  
	   }
	 	
		
	
	}

}
