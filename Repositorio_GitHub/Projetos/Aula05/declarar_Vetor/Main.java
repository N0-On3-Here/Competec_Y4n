import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  //tamanho da array 
	  System.out.print("Escreva o tamanho do arranjo: ");
	  int tamanho = input.nextInt();
	  
	  //declarando o vetor 
	  int num[] = new int [tamanho];
	  
	  //atribuindo valor 
	  for (int i=0; i<num.length; i++){
	      i++;
	      System.out.print("Digite o "+i+"° valor: ");
	      i = i - 1;
	      num[i] = input.nextInt();
	  }
	  
	  //imprimir os vetores
	  System.out.println("____________________________");
	  
	  System.out.println("O tamanho do vetor é de "+num.length);
	  System.out.println("Os valores declarados foram:");
	  for (int n : num){
	      System.out.println(n);
	  }
	  
	  //verificar integridade do vetor
	  System.out.println(" vetor [3] = "+ num[3]);
	}
}