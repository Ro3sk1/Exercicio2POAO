import java.util.Random;

public class Servidor extends Computador {
    Servidor(int counter) {
        super(counter);
        setNivel("Cloud");
    }

    public void chooseRandValues() {
        Random random = new Random();
        setRam((int) Math.pow(2, (int)(Math.random() * (3)) + 7));
        setStorage((int) Math.pow(2, (int)(Math.random() * (5)) + 10));
        setCpu(Math.round((3.0f + Math.random() * 1.0f) * 10) / 10f);
        setArquitetura(random.nextBoolean());
    }

    public void calcularConsumoEnergetico() {
        String RESET = "\u001B[0m";
        String AMARELO = "\u001B[33m";
        float consumoEnergetico = Math.round(80 * getCpu() * 10)/10f;
        System.out.println("O consumo energético do Servidor com ID " + getId() + " é: " + AMARELO + consumoEnergetico + "W" + RESET + ".");
    }

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