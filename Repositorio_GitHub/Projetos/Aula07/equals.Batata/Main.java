/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String secreto = "Batata";
		
		System.out.print("Digite a palavra secreta: ");
		String resposta = input.nextLine();
		
		if (resposta.equalsIgnoreCase(secreto)){
		    System.out.println("Parabéns! você acertou");    
		} else{
		    System.out.println("Que pena, você errou!");
		}
		
		String acertou = (secreto.equalsIgnoreCase(resposta)) ? "Parabens, você acertou!" : "Que pena, você errou!";
		System.out.println(acertou);
	
	}
}
