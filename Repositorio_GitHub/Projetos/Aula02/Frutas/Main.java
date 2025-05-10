/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	//Variáveis
	double Abacaxi = 8.5;
	double Goiaba = 2.0;
	double Laranja = 1.3;
	int codigo = 2;
	
	//Verificar erro
	if (codigo > 3 || codigo < 1){
	    System.out.print ("error : ");
	}
	else {
	    System.out.println ("Código -- Produto -- Preço");
	}
	
	//
	switch (codigo){
	    case 1:
	     System.out.println ("01 ---- Abacaxi -- R$ 8,50");
	     break;
	    case 2:
	     System.out.println ("02 ---- Goiaba -- R$ 2,00");
	     break;
	    case 3:
	     System.out.println ("03 ---- Laranja -- R$ 1,30");
	     break;
	    default:
	     System.out.println ("Invalid Operation");
	        
	}
	}
}