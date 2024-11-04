import java.util.ArrayList;
import java.util.Scanner;

public class NCSLab {

    private void logo() {
        System.out.println("""
                       \s\s\s\s_____   _________________ ______        ______ \s
                       \s\s\s\s___  | / /_  ____/_  ___/ ___  / ______ ___  /_\s
                       \s\s\s\s__   |/ /_  /    _____ \\  __  /  _  __ `/_  __ \\
                       \s\s\s\s_  /|  / / /___  ____/ /  _  /___/ /_/ /_  /_/ /
                       \s\s\s\s/_/ |_/  \\____/  /____/   /_____/\\__,_/ /_.___/\s""");

    }

    private void menu() {
        System.out.print("""
                    | ------------------------ MENU ------------------------ |
                       1 . Mostrar todos os computadores
                       2 . Mostrar todos os computadores com arquitetura x64
                       3 . Calcular consumo energético
                       0 . TERMINAR PROGRAMA
                    | -----------------------  |  |  ----------------------- |
                    Introduza a sua opção:\s""");
    }

    public ArrayList<Computador> listComputador;

    public NCSLab() {
        this.listComputador = new ArrayList<Computador>();
    }

    public ArrayList<Computador> getListComputador() {
        return listComputador;
    }

    public void setListComputador(ArrayList<Computador> listComputador) {
        this.listComputador = listComputador;
    }

    public void createComputadores() {
        int counter = 0;

        for(int i = 0; i < 5; i++) {
            counter++;
            Servidor servidor = new Servidor(counter);
            listComputador.add(servidor);
        }
        for(int i = 0; i < 5; i++) {
            counter++;
            Laptop laptop = new Laptop(counter);
            listComputador.add(laptop);
        }
        for(int i = 0; i < 5; i++) {
            counter++;
            RaspberryPi raspberrypi = new RaspberryPi(counter);
            listComputador.add(raspberrypi);
        }
    }

    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String VERMELHO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        int escolha_utilizador = -1;

        NCSLab ncslab = new NCSLab();
        ncslab.createComputadores();

        ncslab.logo();
        while (escolha_utilizador != 0) {
            ncslab.menu();
            Scanner sc = new Scanner(System.in);
            escolha_utilizador = sc.nextInt();

            switch (escolha_utilizador) {
                case 1:
                    System.out.println("Computadores:");
                    for(Computador computador : ncslab.listComputador) {
                        System.out.println(computador);
                    }
                    break;
                case 2:
                    System.out.println("Computadores com arquitetura x64:");
                    for(Computador computador : ncslab.listComputador) {
                        if(!computador.isArquitetura()) {
                            System.out.println(computador);
                        }
                    }
                    break;
                case 3:
                    for(Computador computador : ncslab.listComputador) {
                        computador.calcularConsumoEnergetico();
                    }

            }
        }
        System.out.println("A terminar o programa...");
    }
}
