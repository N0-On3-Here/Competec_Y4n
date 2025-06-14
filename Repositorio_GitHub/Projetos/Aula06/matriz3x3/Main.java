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
		
		int matriz [][] = new int [3][3];
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[1][0] = 40;
		matriz[1][1] = 50;
		matriz[1][2] = 60;
		matriz[2][0] = 70;
		matriz[2][1] = 80;
		matriz[2][2] = 90;
		
		System.out.println("O numero do meio da matriz é "+matriz[1][1]);
		System.out.println("______________________");
		
		for (int i = 0; i < 3; i++){
		    for (int j = 0; j < 3; j++){
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println(" ");
		}
	}
}
