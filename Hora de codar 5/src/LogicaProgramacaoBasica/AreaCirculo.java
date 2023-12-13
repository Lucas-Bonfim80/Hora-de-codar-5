package LogicaProgramacaoBasica;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de Raio:");

        float raio = Float.parseFloat(scanner.nextLine());

       float pi = (float) 3.14F;

        System.out.println("A area do circulo é de " + pi * (raio * raio) + "cm");
    }

}
