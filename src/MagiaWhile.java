import java.util.Scanner;

public class MagiaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numeroMagias = scanner.nextInt();
        System.out.println("===Magias===");

        int cont = 0;
        while(cont < numeroMagias){
            System.out.println("Alohomora!");
            cont++;
        }
    }
}
