package RepitaContigo;
import java.util.Scanner;


//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a
// média aritmética desses valores lidos.
public class CansarDeDigitar {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Defina o número de valores a serem lidos
                int numeroDeValores = 10;

                // Array para armazenar os valores
                double[] valores = new double[numeroDeValores];

                // Loop para a leitura dos valores
                for (int i = 0; i < numeroDeValores; i++) {
                    System.out.print("Digite o valor " + (i + 1) + ": ");
                    valores[i] = scanner.nextDouble();
                }


                System.out.println("Valores informados:");
                for (double valor : valores) {
                    System.out.print(valor + " ");
                }


                double soma = 0;
                for (double valor : valores) {
                    soma += valor;
                }
                double media = soma / numeroDeValores;


                System.out.println("Média Aritmética: " + media);

            }
        }


