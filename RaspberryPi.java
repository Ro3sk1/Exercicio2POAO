import java.util.Random;

/**
 * Representa um dispositivo Raspberry Pi, que herda atributos comuns de um computador,
 * incluindo o ID, quantidade de memória RAM, armazenamento, velocidade de CPU e arquitetura.
 * Extende a classe {@link Computador}.
 *
 * @author Guilherme Rosmaninho
 * @author Tiago Mustra
 * @version 1.0
 */
public class RaspberryPi extends Computador {

    /**
     * Construtor da classe RaspberryPi que inicializa o ID do dispositivo e define
     * seu nível dentro da infraestrutura ICT como "IoT".
     *
     * @param counter ID para o dispositivo Raspberry Pi.
     */
    RaspberryPi(int counter) {
        super(counter);
        setNivel("IoT");
    }

    /**
     * Define valores aleatórios para os atributos do Raspberry Pi, incluindo RAM,
     * armazenamento, velocidade da CPU e arquitetura. Se a arquitetura for true, então ARM, se false, então x64.
     */
    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int) (Math.random() * (3)) + 1)); // Define a RAM entre 2GB e 8GB
        setStorage((int) Math.pow(2, (int) (Math.random() * (4)) + 4)); // Define o armazenamento entre 16GB e 256GB
        setCpu(Math.round((1.0f + Math.random() * 1.0f) * 10) / 10f); // Define a CPU entre 1.0GHz e 2.0GHz
        setArquitetura(random.nextBoolean()); // Define aleatoriamente a arquitetura, se true então ARM, se false então x64
    }

    /**
     * Calcula e exibe o consumo energético do Raspberry Pi com base na velocidade da CPU.
     */
    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico = Math.round(20 * getCpu() * 10) / 10f;
        System.out.println("O consumo energético do Raspberry Pi com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

    /**
     * Retorna uma representação textual dos atributos do Raspberry Pi.
     *
     * @return String contendo o ID, RAM, armazenamento, CPU, arquitetura e nível do dispositivo dentro da infraestrutura ICT.
     */
    @Override
    public String toString() {
        return " | Raspberry Pi" +
                " | ID = " + getId() +
                " | RAM = " + getRam() + "GB" +
                " | Armazenamento = " + getStorage() + "GB" +
                " | CPU = " + getCpu() + "GHz" +
                " | Arquitetura = " + (isArquitetura() ? "ARM" : "x64") +
                " | Nível = '" + getNivel() + " |";
    }
}
