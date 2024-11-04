
/**
 * Representa um computador genérico com atributos como ID, RAM, armazenamento, CPU,
 * arquitetura e nível.
 *
 * @author Guilherme Rosmaninho
 * @author Tiago Mustra
 * @version 1.0
 */
public class Computador {
    private int id;
    private long ram, storage;
    private float cpu;
    private boolean arquitetura;
    private String nivel;

    /**
     * Construtor da classe Computador que inicializa o ID do computador
     * e define valores aleatórios para os atributos.
     *
     * @param counter ID para o computador.
     */
    public Computador(int counter) {
        this.id = counter;
        chooseRandValues();
    }

    /**
     * Retorna o ID do computador.
     *
     * @return ID do computador.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do computador.
     *
     * @param id O novo ID do computador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna a quantidade de memória RAM do computador.
     *
     * @return A quantidade de RAM em Gigabytes.
     */
    public long getRam() {
        return ram;
    }

    /**
     * Define a quantidade de memória RAM do computador.
     *
     * @param ram A nova quantidade de RAM em Gigabytes.
     */
    public void setRam(long ram) {
        this.ram = ram;
    }

    /**
     * Retorna a quantidade de armazenamento do computador.
     *
     * @return A quantidade de armazenamento em Gigabytes.
     */
    public long getStorage() {
        return storage;
    }

    /**
     * Define a quantidade de armazenamento do computador.
     *
     * @param storage A nova quantidade de armazenamento em Gigabytes.
     */
    public void setStorage(long storage) {
        this.storage = storage;
    }

    /**
     * Retorna a velocidade do processador do computador.
     *
     * @return A velocidade da CPU em GHz.
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * Define a velocidade do processador do computador.
     *
     * @param cpu A nova velocidade da CPU em GHz.
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    /**
     * Método que atribui valores aleatórios aos atributos do computador.
     */
    public void chooseRandValues() {
        // Método para escolher valores aleatórios para o computador.
    }

    /**
     * Calcula e exibe o consumo energético do computador.
     */
    public void calcularConsumoEnergetico() {
        // Método para calcular o consumo energético do computador.
    }

    /**
     * Retorna o tipo de arquitetura do computador.
     *
     * @return true se for x64, false se for ARM.
     */
    public boolean isArquitetura() {
        return arquitetura;
    }

    /**
     * Define o tipo de arquitetura do computador.
     *
     * @param arquitetura true para x64, false para ARM.
     */
    public void setArquitetura(boolean arquitetura) {
        this.arquitetura = arquitetura;
    }

    /**
     * Retorna o nível do computador dentro da infraestrutura ICT.
     *
     * @return O nível dentro da infraestrutura ICT em formato de string.
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define o nível do computador dentro da infraestrutura ICT.
     *
     * @param nivel O novo nível dentro da infraestrutura ICT.
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * Retorna uma representação textual dos atributos do computador.
     *
     * @return String contendo o ID, RAM, armazenamento, CPU, arquitetura e nível do computador dentro da infraestrutura ICT.
     */
    @Override
    public String toString() {
        return "Computador{" +
                "id=" + getId() +
                ", ram=" + getRam() +
                ", storage=" + getStorage() +
                ", cpu=" + getCpu() +
                ", arquitetura=" + isArquitetura() +
                ", nivel='" + getNivel() + '\'' +
                '}';
    }
}
