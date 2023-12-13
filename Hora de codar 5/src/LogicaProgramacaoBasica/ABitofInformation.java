package LogicaProgramacaoBasica;

import java.util.Scanner;

/*
Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará
a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
*/

public class ABitofInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");

        Integer idadeUsuario = Integer.valueOf(scanner.nextLine());

        System.out.println("Olá, " + nomeUsuario + ", sua idade é " + idadeUsuario);


    }
}
