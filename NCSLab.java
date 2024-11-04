import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal que representa o laboratório de computadores NCSLab.
 * Esta classe permite inicializar uma lista de computadores, exibir um menu
 * interativo e processar as escolhas do usuário para exibir informações
 * sobre os computadores e calcular o consumo energético.
 */
public class NCSLab {

    /**
     * Método que exibe o logo do laboratório NCSLab na consola.
     */
    private void logo() {
        System.out.println("""
                       \s\s\s\s_____   _________________ ______        ______ \s
                       \s\s\s\s___  | / /_  ____/_  ___/ ___  / ______ ___  /_\s
                       \s\s\s\s__   |/ /_  /    _____ \\  __  /  _  __ `/_  __ \\
                       \s\s\s\s_  /|  / / /___  ____/ /  _  /___/ /_/ /_  /_/ /
                       \s\s\s\s/_/ |_/  \\____/  /____/   /_____/\\__,_/ /_.___/\s""");
    }

    /**
     * Método que exibe o menu de opções para o usuário na consola,
     * com formatação em cores e negrito para destacar cada opção.
     */
    private void menu() {
        String RESET = "\u001B[0m";
        String VERMELHO_NEGRITO = "\u001B[1;31m";
        String VERDE = "\u001B[32m";
        String NEGRITO = "\u001B[1m";
        System.out.println(NEGRITO + "| ------------------------ MENU ------------------------ |" + RESET + " \n   " + VERDE + "1 ." + RESET + " Mostrar todos os computadores \n   " + VERDE + "2 ." + RESET + " Mostrar todos os computadores com arquitetura x64 \n   " + VERDE + "3 ." + RESET + " Calcular consumo energético \n   " + VERMELHO_NEGRITO + "0 . TERMINAR PROGRAMA " + RESET + " \n" + NEGRITO + "| -----------------------  |  |  ----------------------- |" + RESET);
    }

    /**
     * Lista de objetos do tipo Computador, representando os computadores
     * do laboratório NCSLab.
     */
    public ArrayList<Computador> listComputador;

    /**
     * Construtor padrão da classe NCSLab, que inicializa a lista de computadores.
     */
    public NCSLab() {
        this.listComputador = new ArrayList<Computador>();
    }

    /**
     * Retorna a lista de computadores do laboratório.
     *
     * @return ArrayList contendo objetos do tipo Computador.
     */
    public ArrayList<Computador> getListComputador() {
        return listComputador;
    }

    /**
     * Define a lista de computadores do laboratório.
     *
     * @param listComputador Nova lista de computadores do laboratório.
     */
    public void setListComputador(ArrayList<Computador> listComputador) {
        this.listComputador = listComputador;
    }

    /**
     * Método que cria e adiciona diferentes tipos de computadores à lista.
     * Cria 5 Servidores, 5 Laptops e 5 RaspberryPis, cada um com um ID único.
     */
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

    /**
     * Método principal que executa o programa. Ele exibe o logo do laboratório,
     * exibe o menu e permite ao usuário interagir com as opções disponíveis.
     * As opções permitem listar todos os computadores, filtrar computadores com
     * arquitetura x64 e calcular o consumo energético.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        int escolha_utilizador = -1;
        Scanner sc = new Scanner(System.in);

        NCSLab ncslab = new NCSLab();
        ncslab.createComputadores();

        ncslab.logo();
        while (escolha_utilizador != 0) {
            ncslab.menu();
            while (true) {
                System.out.print("Introduza a sua opção:\s");
                if (sc.hasNextInt()) {
                    escolha_utilizador = sc.nextInt();
                    break;
                } else {
                    System.out.println("ERRO! Por favor, insira um dígito correspondente à opção desejada.");
                    sc.next();
                }
            }

            switch (escolha_utilizador) {
                case 1:
                    System.out.println("<|> Computadores:");
                    for(Computador computador : ncslab.listComputador) {
                        System.out.println(computador);
                    }
                    System.out.println("<|> ");
                    break;
                case 2:
                    System.out.println("<|> Computadores com arquitetura x64:");
                    for(Computador computador : ncslab.listComputador) {
                        if(!computador.isArquitetura()) {
                            System.out.println(computador);
                        }
                    }
                    System.out.println("<|> ");
                    break;
                case 3:
                    for(Computador computador : ncslab.listComputador) {
                        computador.calcularConsumoEnergetico();
                    }
                    break;
                case 0:
                    System.out.println("A terminar o programa...");
                    break;
                default:
                    System.out.println("OPÇÃO ERRADA. TENTE NOVAMENTE!");
                    break;

            }
        }
    }
}