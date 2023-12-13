package RepitaContigo;
import java.util.Scanner;
public class Boom {
    public static void main(String[]args) {



        int relogio = 15;
        while (relogio >= 0) {
            System.out.println("Tempo: " + relogio + "s");
            relogio--;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("EXPLOSÃO!");
    }
}
