package LogicaProgramacaoBasica;

import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor da base maior:");

        float baseMaior = Float.parseFloat(scanner.nextLine());

        System.out.println("digite o valor da base menor:");

        float baseMenor = Float.parseFloat(scanner.nextLine());

        System.out.println("digite o valor da altura:");

        float altura = Float.parseFloat(scanner.nextLine());

        System.out.println("A area do trapezio é de " + (baseMaior + baseMenor) * altura / 2 + "cm");


    }
}
