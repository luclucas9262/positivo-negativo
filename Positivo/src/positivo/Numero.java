package positivo;

import java.util.Scanner;

public class Numero {

    private Double a, b;

    Scanner entrada = new Scanner(System.in);

    public void SetN1() {
        System.out.println("Digite um número: ");
        
        this.a = entrada.nextDouble();

    }

    public double GetN1() {
        return this.a;
    }

    public void SetNegativo() {
        System.out.println("NEGATIVO: " + a);
    }

    public void SetPositivo() {
        System.out.println("NAO NEGATIVO " + a);
    }

}
