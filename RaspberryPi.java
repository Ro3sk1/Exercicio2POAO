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

    }

}
