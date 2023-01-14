import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        pessoasNoCamarote = (tamanhoDaFila / 2) + (tamanhoDaFila % 2);

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}