import java.util.Random;

public class RaspberryPi extends Computador {
    RaspberryPi(int counter) {
        super(counter);
        setNivel("IoT");
    }

    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int)(Math.random() * (3)) + 1));
        setStorage((int) Math.pow(2, (int)(Math.random() * (4)) + 4));
        setCpu((float) (Math.random()) + 1.0f);
        setArquitetura(random.nextBoolean());
    }

    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico = Math.round(20 * getCpu() * 10)/10f;
        System.out.println("O consumo energético do Raspberry Pi com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

    @Override
    public String toString() {
        return "Raspberry Pi {" +
                "id=" + getId() +
                ", ram=" + getRam() +
                ", storage=" + getStorage() +
                ", cpu=" + getCpu() +
                ", arquitetura=" + (isArquitetura() ? "ARM" : "x64") +
                ", nivel='" + getNivel() + '\'' +
                '}';
    }
}
