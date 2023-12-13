package TudoTemUmaCondição;
//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

public class QualOQue {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
    int num1 = scanner.nextInt();

        System.out.println("Digite o 2° valor:");
    int num2 = scanner.nextInt();

        System.out.println("Digite o 3° valor:");
    int num3 = scanner.nextInt();

        if (num1 > num2 && num2 > num3)
            System.out.println("A soma dos dois maiores numero é: " + (num1 + num2) );

        else if (num1 > num3 && num3 > num2)
            System.out.println("A soma dos dois maiores numero é: " + (num1 + num3) );

        else if (num2 > num1  && num1 > num3)
            System.out.println("A soma dos dois maiores numero é: " + (num2 + num1) );

        else if (num2 > num1 && num2 > num3)
            System.out.println("A soma dos dois maiores numero é: " + (num2 + num3) );

        else if (num3 > num1 && num1 > num2)
            System.out.println("A soma dos dois maiores numero é: " + (num3 + num1) );

        else System.out.println("A soma dos dois maiores numero é: " + (num3 + num2) );



    }
}
