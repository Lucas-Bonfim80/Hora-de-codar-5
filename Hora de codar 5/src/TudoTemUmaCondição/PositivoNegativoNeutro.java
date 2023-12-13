package TudoTemUmaCondição;

import java.util.Scanner;

//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
public class PositivoNegativoNeutro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero > 0)
            System.out.println("O numero é positivo");

        else if(numero < 0)
            System.out.println("O numero é negativo");

        else System.out.println("O numero é neutro");
    }
}

