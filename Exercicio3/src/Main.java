import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        double n;

        System.out.println("Digite um valor:");
        n = ler.nextDouble();

        System.out.println("ICMS: " + double icms);
        System.out.println("IPI: " + double ipi);
        System.out.println("COFINS: " + double cofins);
        System.out.println("Valor Final: " + (icms + ipi + cofins + n) );



    }
}
