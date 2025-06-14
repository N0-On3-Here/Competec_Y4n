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
		//entrada
		System.out.println("Digite os 10 valores do vetor");
		int vetor[] = new int[10];
		int maior = -999999999;
		int menor = 999999999;
		
		//calculo
		for (int i = 0; i < vetor.length; i++){
		    System.out.print((i+1)+" - ");
		    vetor[i] = input.nextInt();
		    
		    //maior
		    if (vetor[i] > maior){
		        maior = vetor[i];
		    }
		    
		    //menor
		    if (vetor[i] < menor){
		        menor = vetor[i];
		    }
		}
		
		//saida
		System.out.println("__Valores do vetor__");
		for(int i = 0; i < vetor.length; i++){
		    System.out.println((i+1)+" _ "+vetor[i]);
		}
		System.out.println("O maior número é "+maior);
		System.out.println("O menor número é "+menor);
	}
}
