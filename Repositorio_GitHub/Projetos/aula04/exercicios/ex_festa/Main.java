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
		
		//medindo
		System.out.print("Digite a largura do espaço da festa: ");
		double l = input.nextDouble();
		System.out.print("Digite o comprimento do espaço da festa: ");
		double c = input.nextDouble();
		System.out.print("Digite o número de convidados da festa: ");
		int N = input.nextInt();
		
		//calculando
		
		double area = l*c;
		double areaConv = N*2;
		
		if (area > areaConv){
		    System.out.println("JÁ É INTEEEEEEEEER");
		}
		else{
		    System.out.println("Santa Rita realmente ficou pequena...");
		}
	}
}
