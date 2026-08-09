//Peça um número inteiro ao usuário e diga se é par ou ímpar.
package Desafios;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Digite um numero: ");
        Integer num = Integer.valueOf(scanner.nextLine());
        if (num %2==0){
            System.out.println("Número é par.");
        }else{
            System.out.println("Número é impar");
        }


    }
}
