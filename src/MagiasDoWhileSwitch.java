import java.util.Scanner;

public class MagiasDoWhileSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("===Magias===");
            System.out.println("1- Expeliarmos");
            System.out.println("2- Accio");
            System.out.println("3- Petrificus Totalus");
            System.out.println("4- sair");
            System.out.println("Escolha uma opcao:");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Expeliarmos!");
                    break;
                case 2:
                    System.out.println("Accio!");
                    break;
                case 3:
                    System.out.println("Petrificus Totalus!");
                    break;
                case 4:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Invalido!");
                    break;
            }
        }while(opcao != 4);
        }
    }

