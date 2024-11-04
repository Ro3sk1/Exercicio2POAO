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
        setCpu(Math.round((2.0f + Math.random() * 1.0f) * 10) /