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
		
		//tamanho
		System.out.print("tamanho das linhas - ");
		int linha = input.nextInt();
		System.out.print("tamanho das colunas - ");
		int coluna = input.nextInt();
		
		// 0 metodo
		int tabela00 [][] = new int [linha][coluna];
		tabela00 [0][0] = 100;
		
		System.out.println("____________");
		System.out.println("metodo 01 ( matriz com entrada )");
		System.out.println("escreva os valores de cada linha e então coluna");
		
		for (int i = 0; i < linha; i++){
		    for (int j = 0; j < coluna; j++){
		        tabela00 [i][j] = input.nextInt();
		    }
		}
		
		// 1 metodo (errado, para revisar)
		System.out.println("____________");
		System.out.println("Matriz já declarada");
		int tabela01 [][] = new int [5][3];
		tabela01[0][0] = 0;
		tabela01[0][1] = 1;
		tabela01[0][2] = 2;
		tabela01[1][0] = 3;
		tabela01[1][1] = 4;
		tabela01[1][2] = 10;
		tabela01[2][0] = 20;
		tabela01[2][1] = 30;
		tabela01[2][2] = 40;
		tabela01[3][0] = 50;
		tabela01[3][1] = 101;
		tabela01[3][2] = 102;
		tabela01[4][0] = 103;
		tabela01[4][1] = 104;
		tabela01[4][2] = 105;
		
		for (int i = 0; i < tabela01.length; i++) {
            for (int j = 0; j < tabela01[i].length; j++) {
                 System.out.print(tabela01[i][j] + " - ");
            }
            System.out.println();  // Para pular para a próxima linha após imprimir uma linha inteira
        }

		
		// 2 metodo
		int [][] tabela02 = {{2, 9}, {4, 2}, {8, 16}};
		
		// ou
		
			int vetor[][] = {
		    {1, 2, 3},
		    {2, 4, 6},
		    {3, 6, 9}};
		
		for (int i = 0; i < linha; i++){
		    for (int j = 0; j < coluna; j++){
		        System.out.print(tabela02[i][j]);  //+ " - "
		    }
		    System.out.println(" ");
		}
	}
}
