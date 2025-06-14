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
		Scanner input= new Scanner(System.in);
		
		System.out.println("Adivinhe a senha numérica de 4 números");
		int resposta = input.nextInt();
		
		int senha = 2468;
        while (resposta != senha){
            System.out.println("senha incorreta! tente novamente");
		    resposta = input.nextInt();
        }
        System.out.println("Senha correta, acesso concedido");
	}
}
