import java.util.Random;

public class Computador {
    private int id;
    private long ram, storage;
    private float cpu;
    private boolean arquitetura;
    private String nivel;

    public Computador(int counter) {
        this.id = counter;
        chooseRandValues();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRam() {
        return ram;
    }

    public void setRam(long ram) {
        this.ram = ram;
    }

    public long getStorage() {
        return storage;
    }

    public void setStorage(long storage) {
        this.storage = storage;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public void chooseRandValues() {}

    public void calcularConsumoEnergetico() {}

    public boolean isArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(boolean arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
