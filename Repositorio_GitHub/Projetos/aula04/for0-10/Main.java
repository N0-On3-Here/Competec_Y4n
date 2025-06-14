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
		
		System.out.println("Digite um número para mutipicar");
		int x = input.nextInt();
		
		
		for (int i = 1; i<=10; i++){
		    System.out.println(i+"-"+x*i);
		    
		}
	}
}
