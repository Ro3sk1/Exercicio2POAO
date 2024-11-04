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
        setCpu((float) (Math.random()) + 3.0f);
        setArquitetura(random.nextBoolean());
    }

    public void calcularConsumoEnergetico() {
        float consumoEnergetico = 
    }

}