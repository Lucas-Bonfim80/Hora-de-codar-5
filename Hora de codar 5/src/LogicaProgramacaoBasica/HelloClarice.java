package LogicaProgramacaoBasica;

import java.util.Scanner;

/*Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".*/
public class HelloClarice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nomeUsuario = scanner.nextLine();

        System.out.println("Olá, " + nomeUsuario);
    }
}
