package TudoTemUmaCondição;

import java.util.Arrays;
import java.util.Scanner;

//Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
public class CincoVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextInt();
        }

        Arrays.sort(valores);
        double somaDosDoisMaiores = valores[3] + valores[4];

        System.out.println("A soma dos dois maiores valores é: " + somaDosDoisMaiores);

    }
}
