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
	System.out.print("quantos computadores há no lab 1: ");
	int C1 = input.nextInt();
	System.out.print("quantos alunos há no lab 1: ");
	int A1 = input.nextInt();
	System.out.print("quantos computadores há no lab 2: ");
	int C2 = input.nextInt();
	System.out.print("quantos alunos há no lab 2: ");
	int A2 = input.nextInt();
	System.out.print("quantos computadores há no lab 3: ");
	int C3 = input.nextInt();
	System.out.print("quantos alunos há no lab 3: ");
	int A3 = input.nextInt();
	System.out.print("quantos computadores há no lab 4: ");
	int C4 = input.nextInt();
	System.out.print("quantos alunos há no lab 4: ");
	int A4 = input.nextInt();
	
	//verificar true/false
	
	boolean lab1 = A1 <= 40;
	boolean lab2 = A2 % 2 == 0;
	boolean lab3 = A3 <= C3/2;
	boolean lab4 = A4 % 10 == 7;
	
	int alunos = A1+A2+A3+A4;
	int computadores = C1+C2+C3+C4;
	boolean aula = alunos < computadores;
	
	//tera aula ou NoClassDefFoundError
	
	if (lab1 && lab2 && lab3 && lab4 && aula){
	    System.out.println("HABEMUS AULA!!");
	}
	else{
	    System.out.println("Fica pra próxima..");
	}
	}
}
