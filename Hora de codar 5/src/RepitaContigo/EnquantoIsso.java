package RepitaContigo;

import java.util.Scanner;

//Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido
// um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve
// imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
public class EnquantoIsso {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro: ");
        int num1 = scanner.nextInt();

        int num2;
        do{
            System.out.println("Digite o segundo numero: ");
            num2 = scanner.nextInt();

            if (num2 <= 0) System.out.println("O segundo valor tem q ser positivo");

        }while(num2 <= 0);

        System.out.println("Os valores informados foram: " + num1 + " e " + num2);

        System.out.println("A divisão do primeiro numero em cima do segundo numero é: " + (num1 / num2));

    }
}
