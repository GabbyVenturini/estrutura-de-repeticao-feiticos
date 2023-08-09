import java.util.Scanner;

public class MagiasFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");
        int numeroMagias = scanner.nextInt();

        System.out.println("======Magias=====");
        for (int i = 0; i < numeroMagias; i++) {
            System.out.println("Wingardium Leviosa!");

        }
    }
}
