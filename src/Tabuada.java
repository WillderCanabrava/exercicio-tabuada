import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 para ver sua tabuada: ");
        int numero = leitura.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
            System.out.println("Fim!");

        }
    }
}
