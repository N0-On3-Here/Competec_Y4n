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
	
	//inicio
	System.out.print("Digite o quanto de dinheiro Itu levou: ");
	double Di = input.nextDouble();
	System.out.print("Digite o quanto de dinheiro Caio levou: ");
	double Dc = input.nextDouble();
	System.out.print("Digite o preço da barrinha de goiaba: ");
	double P = input.nextDouble();
	System.out.print("Digite a quantidade de barrinhas: ");
	int N = input.nextInt();
	
	//saida
	double total = N * P;
    double dinheiroTotal = Di + Dc;
    double X = total - dinheiroTotal;

	
	System.out.printf("Rayssa teve que enviar R$ %.2f para Itu e Caio%n", X);
	}
}
