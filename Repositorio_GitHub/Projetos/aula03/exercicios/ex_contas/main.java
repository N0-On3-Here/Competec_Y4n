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
	System.out.print("Digite o primeiro número: ");
	double N = input.nextDouble();
	System.out.print("Digite o segundo número: ");
	double M = input.nextDouble();
	
	System.out.println("Escoha a operação: 1-Adição; 2-Subtração; 3-Divisão; 4-Mutipicação");
	int conta = input.nextInt();
	double resultado;
	 
	switch (conta) {
	    case 1:
	        resultado = N+M;
	        System.out.println("A soma deu "+resultado);
	        break;
	   case 2:
	        resultado = N-M;
	        System.out.println("A subtração deu "+resultado);
	        break;
	   case 3:
	        resultado = N/M;
	        System.out.println("A divisão deu "+resultado);
	        break;
	   case 4:
	        resultado = N*M;
	        System.out.println("A mutipicação deu "+resultado);
	        break;
	   default:
	    System.out.println("Operação inváida! Tente novamente");
	}
	}
}
