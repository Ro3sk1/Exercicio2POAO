import java.util.Random;

public class Laptop extends Computador {
    private boolean gpu;
    Laptop(int counter) {
        super(counter);
        setNivel("Edge");
    }

    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int)(Math.random() * (3)) + 4));
        setStorage((int) Math.pow(2, (int)(Math.random() * (3)) + 8));
        setCpu(Math.round((2.0f + Math.random() * 1.0f) * 10) / 10f);
        setGpu(random.nextBoolean());
        setArquitetura(random.nextBoolean());
    }

    public boolean getGpu() {
        return gpu;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico;
        if(gpu) {
            consumoEnergetico = Math.round(50 * getCpu() * 10)/10f;
        } else {
            consumoEnergetico = Math.round(50 * getCpu() * 1.2 * 10)/10f;
        }
        System.out.println("O consumo energético do Laptop com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

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
