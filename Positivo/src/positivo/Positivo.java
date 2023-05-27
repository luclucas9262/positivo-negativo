package positivo;

public class Positivo {

    public static void main(String[] args) {

        Numero n = new Numero();

        do {

            n.SetN1();

            if (n.GetN1() >= 0) {
                n.SetPositivo();

            } else {
                n.SetNegativo();

            }

        } while (n.GetN1() != 0);
    }

}
