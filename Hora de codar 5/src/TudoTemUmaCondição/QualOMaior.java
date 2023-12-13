package TudoTemUmaCondição;

import java.util.Scanner;

//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
public class QualOMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o 1° valor:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2° valor:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o 3° valor:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println("O 1° valor informado é o maior");

        else if (num2 > num1 && num2 > num3)
            System.out.println("O 2° valor informado é o maior");

        else System.out.println("O 3° valor informado é o maior");

    }
}
