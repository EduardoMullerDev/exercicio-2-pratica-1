import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {

        Double Idade;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua idade?");

        Idade = teclado.nextDouble();

        System.out.println("Sua idade é:" + Idade);
    }
}
