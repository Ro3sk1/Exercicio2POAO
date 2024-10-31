import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha_utilizador = -1;

        while (escolha_utilizador != 0) {
            System.out.print("""
                    ------- MENU -------
                    1 . Mostrar todos os computadores
                    2 . Mostrar todos os computadores com arquitetura x64
                    3 . Calcular consumo energético
                    0 . TERMINAR PROGRAMA
                    --------------------
                    Introduza a sua opção:\s""");

            Scanner sc = new Scanner(System.in);
            escolha_utilizador = sc.nextInt();

            switch (escolha_utilizador) {
                case 1:
                    System.out.println("a");
                case 2:
                    System.out.println("a");
            }
        }
        System.out.println("A terminar o programa...");
    }
}
