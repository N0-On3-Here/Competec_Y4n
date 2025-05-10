/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//Variáveis
		
		String Nome1 = "Yan";
		String Nome2 = "Samuel";
		int IdadeY = 15;
		int IdadeP = 20;
		boolean ComparacaoN = Nome1 == Nome2;
		boolean ComparacaoI = IdadeY == IdadeP;
		
		//Imprimindo
		System.out.println ("____Nomes____");
		System.out.print ("Os nomes Yan e Samuel são iguais : ");
		System.out.println(ComparacaoN);
		
		System.out.println ("___Idade___");
		System.out.print ("Yan é mais novo ou mais velho que o professor : ");
		System.out.println (ComparacaoI);
	}
}