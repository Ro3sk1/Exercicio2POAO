import java.util.Random;

/**
 * Representa um Servidor, que herda atributos comuns de um computador,
 * incluindo o ID, quantidade de memória RAM, armazenamento, velocidade de CPU e arquitetura.
 * Extende a classe Computador.
 */
public class Servidor extends Computador {
    /**
     * Construtor da classe Servidor que inicializa o ID do dispositivo e define
     * seu nível dentro da infraestrutura ICT como "Cloud".
     *
     * @param counter ID para o servidor.
     */
    Servidor(int counter) {
        super(counter);
        setNivel("Cloud");
    }

    /**
     * Define valores aleatórios para os atributos do servidor, incluindo RAM,
     * armazenamento, velocidade da CPU e arquitetura. Se a arquitetura for true, então ARM, se false, então x64.
     */
    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int) (Math.random() * (3)) + 7)); // Define a RAM entre 128GB e 1024GB
        setStorage((int) Math.pow(2, (int) (Math.random() * (5)) + 10)); // Define o armazenamento entre 1TB e 32TB
        setCpu(Math.round((Math.random() + 3.0f) * 10) / 10f); // Define a CPU entre 3.0GHz e 4.0GHz
        setArquitetura(random.nextBoolean()); // Define aleatoriamente a arquitetura, se true então ARM, se false então x64
    }

    /**
     * Calcula e exibe o consumo energético do servidor com base na velocidade da CPU.
     */
    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico = Math.round(80 * getCpu() * 10) / 10f;
        System.out.println("O consumo energético do Servidor com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

    /**
     * Retorna uma representação textual dos atributos do servidor.
     *
     * @return String contendo o ID, RAM, armazenamento, CPU, arquitetura e nível do servidor.
     */
    @Override
    public String toString() {
        return " | Servidor" +
                " | ID = " + getId() +
                " | RAM = " + getRam() + "GB" +
                " | Armazenamento = " + getStorage() + "GB" +
                " | CPU = " + getCpu() + "GHz" +
                " | Arquitetura = " + (isArquitetura() ? "ARM" : "x64") +
                " | Nível = '" + getNivel() + " |";
    }
}
