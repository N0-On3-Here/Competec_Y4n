/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//criar uma variável com o preço de uma laranja
//criar uma variável com o preço de uma banana
//mostrar a soma do preço da laranja e da banana
//fazer um desconto de 80% do valor da soma dos dois e mostrar esse valor

public class Main
{
	public static void main(String[] args) {
	    //declarando os valores e somando
	    Double Laranja=(4.99);
	    Double Banana=(2.99);
	    Double soma= Laranja+Banana;
	    
	    //imprimindo
	    System.out.print("Valor da Laranja = ");
	    System.out.println(Laranja);
	    System.out.print("Valor da Banana = ");
	    System.out.println(Banana);
	    System.out.print("A soma de ambas frutas é : ");
	    System.out.println (soma);
	}
}