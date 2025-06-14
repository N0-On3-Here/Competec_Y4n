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
	  
	  int num[] = new int [3];
	    System.out.print("Escreva o 1 num: ");
	    num[0] = input.nextInt();
	    System.out.print("Escreva o 2 num: ");
	    num[1] = input.nextInt();
	    System.out.print("Escreva o 3 num: ");
	    num[2] = input.nextInt();
	    
	  int x = num[0] + num[1] + num[2];
	  System.out.println("A soma é "+x);
	}
}