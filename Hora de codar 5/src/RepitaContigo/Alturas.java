package RepitaContigo;

public class Alturas {
    public static void main(String[] args) {
    float Anacleto = 1.50F;
    float Felisberto = 1.10F;
    int Ano = 0;

        while(Felisberto < Anacleto){
        Felisberto = Felisberto + 0.03F;
        Anacleto = Anacleto + 0.02F;
        Ano ++;
    }
        String passar= ("Vão se passar: " + Ano + " anos");

        System.out.println(passar);
}

}
