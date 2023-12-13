package LogicaProgramacaoBasica;

import java.util.Scanner;

public class AreaLosango {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor da diagonal maior:");

        Float diagonalMaior = Float.valueOf(scanner.nextLine());

        System.out.println("digite o valor da diagonal menor:");

        Float diagonalMenor = Float.valueOf(scanner.nextLine());

        System.out.println("A area do losango é de " + diagonalMaior * diagonalMenor / 2 + "cm");

    }
}
