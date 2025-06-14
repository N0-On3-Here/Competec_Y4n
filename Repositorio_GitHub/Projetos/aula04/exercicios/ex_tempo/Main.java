/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Recebendo os tempos fornecidos pelos alunos
        System.out.print("Quanto tempo leva o aluno 1: ");
        int T1 = input.nextInt();
        System.out.print("Quanto tempo leva o aluno 2: ");
        int T2 = input.nextInt();
        System.out.print("Quanto tempo leva o aluno 3: ");
        int T3 = input.nextInt();
        System.out.print("Quanto tempo leva o aluno 4: ");
        int T4 = input.nextInt();
        System.out.print("Quanto tempo leva o aluno 5: ");
        int T5 = input.nextInt();
        
        // Calculando o tempo verdadeiro de cada aluno
        int tempo1 = T1 * 5; 
        int tempo2 = T2 * T2; 
        int tempo3 = (T3 % 2 == 0) ? T3 / 2 : T3 * 2; 
        int tempo4 = 3 * tempo3;
        int tempo5 = 4 - T1 * 2;
        
        // Encontrando o maior tempo
        int maiorTempo = Math.max(Math.max(Math.max(tempo1, tempo2), tempo3), Math.max(tempo4, tempo5));
        
        // Exibindo o maior tempo verdadeiro
        System.out.println("A maior demora é de " + maiorTempo);
    }
}
