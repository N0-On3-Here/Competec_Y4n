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
	    
	   //palavra
	   System.out.println("Escreva a palavra para repetição: ");
	   String palavra = input.nextLine();
	   System.out.println("__________________________________");
	   
	   //repeticao
	   int x = 0;
	   
	   while (x < 5){
	       System.out.println(palavra);
	       x++;
	   }
	}
}
