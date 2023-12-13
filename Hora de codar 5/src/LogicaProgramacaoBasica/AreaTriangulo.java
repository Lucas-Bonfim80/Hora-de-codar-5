package LogicaProgramacaoBasica;

import java.util.Scanner;

public class AreaTriangulo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("digite o valor da base:");

            Float base = Float.valueOf(scanner.nextLine());

            System.out.println("digite o valor da altura:");

            Float altura = Float.valueOf(scanner.nextLine());

            System.out.println("A area do Triângulo é de " + base * altura / 2 + "cm");


    }
}
