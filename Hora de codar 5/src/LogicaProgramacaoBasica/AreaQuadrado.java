package LogicaProgramacaoBasica;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da base:");

        Float base = Float.valueOf(scanner.nextLine());

        System.out.println("A area mede " + base * base + "cm");

    }
}
