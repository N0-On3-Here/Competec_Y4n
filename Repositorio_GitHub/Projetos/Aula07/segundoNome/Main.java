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
		
		System.out.print("Digite o seu nome completo: ");
		String resposta = input.nextLine();
		
		String[] segundoNome = resposta.split(" ");
		
		if (segundoNome.length<2){
		    System.out.println("Erro, digite seu nome completo");
		} else{
		System.out.println("Seu segundo nome é "+segundoNome[1]);
		}
	}
}
