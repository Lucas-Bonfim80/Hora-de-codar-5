package TudoTemUmaCondição;

import java.util.Scanner;
// um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class QualOMaior2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o 1° valor:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2° valor:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o 3° valor:");
        int num3 = scanner.nextInt();

        System.out.println("Digite o 4° valor:");
        int num4 = scanner.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4)
            System.out.println("O 1° valor informado é o maior");

        else if (num2 > num1 && num2 > num3 && num2 > num4)
            System.out.println("O 2° valor informado é o maior");

        else if (num3 > num1 && num3 > num2 && num3 > num4)
            System.out.println("O 3° valor informado é o maior");

        else System.out.println("O 4° valor informado é o maior");

    }
}
