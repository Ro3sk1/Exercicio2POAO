import java.util.Random;

/**
 * Representa um laptop com atributos específicos, incluindo GPU,
 * além de atributos comuns a vários tipos de computadores, como ID,
 * quantidade de memória RAM, armazenamento, velocidade de CPU e arquitetura.
 * Extende a classe {@link Computador}.
 *
 * @author Guilherme Rosmaninho
 * @author Tiago Mustra
 * @version 1.0
 */
public class Laptop extends Computador {
    private boolean gpu;

    /**
     * Construtor da classe Laptop que inicializa o ID do laptop e define
     * seu nível dentro da infraestrutura ICT como "Edge".
     *
     * @param counter ID para o laptop.
     */
    Laptop(int counter) {
        super(counter);
        setNivel("Edge");
    }

    /**
     * Define valores aleatórios para os atributos do laptop, incluindo RAM,
     * armazenamento, velocidade da CPU, presença de GPU e arquitetura. Se a arquitetura for true, então ARM, se false, então x64.
     */
    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int) (Math.random() * (3)) + 4)); // Define a RAM entre 16GB e 128GB
        setStorage((int) Math.pow(2, (int) (Math.random() * (3)) + 8)); // Define o armazenamento entre 256GB e 1TB
        setCpu(Math.round((2.0f + Math.random() * 1.0f) * 10) / 10f); // Define a CPU entre 2.0GHz e 3.0GHz
        setGpu(random.nextBoolean()); // Define aleatoriamente a presença de GPU
        setArquitetura(random.nextBoolean()); // Define aleatoriamente a arquitetura, se true então ARM, se false então x64
    }

    /**
     * Retorna se o laptop possui uma GPU dedicada.
     *
     * @return true se o laptop possui GPU, false caso contrário.
     */
    public boolean getGpu() {
        return gpu;
    }

    /**
     * Define se o laptop possui uma GPU dedicada.
     *
     * @param gpu true se o laptop possui GPU, false caso contrário.
     */
    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    /**
     * Calcula e exibe o consumo energético do laptop com base na presença de GPU e velocidade da CPU.
     * O cálculo é diferente para laptops com e sem GPU.
     */
    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico;

        if (gpu) {
            consumoEnergetico = Math.round(50 * getCpu() * 10) / 10f;
        } else {
            consumoEnergetico = Math.round(50 * getCpu() * 1.2 * 10) / 10f;
        }
        System.out.println("O consumo energético do Laptop com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

    /**
     * Retorna uma representação textual dos atributos do laptop.
     *
     * @return String contendo o ID, RAM, armazenamento, CPU, presença de GPU, arquitetura e nível dentro da infraestrutura ICT do laptop.
     */
    @Override
    public String toString() {
        return " | Laptop" +
                " | ID = " + getId() +
                " | RAM = " + getRam() + "GB" +
                " | Armazenamento = " + getStorage() + "GB" +
                " | CPU = " + getCpu() + "GHz" +
                " | GPU = " + (gpu ? "Sim" : "Não") +
                " | Arquitetura = " + (isArquitetura() ? "ARM" : "x64") +
                " | Nível = '" + getNivel() + " |";
    }
}
