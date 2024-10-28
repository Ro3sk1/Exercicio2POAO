public class Exercicio2 {
    class NCSLab {
        int nivel;
        long id, ram, disco;
        float cpu;
        boolean arquitetura;
    }

    class Servidor extends NCSLab {
        Servidor(String nivel, long ram, long disco, float cpu, String arquitetura) {
            if(nivel.equals("Cloud")) {
                this.nivel = 1;
            } else if(nivel.equals("Edge")) {
                this.nivel = 2;
            } else if (nivel.equals("IoT")) {
                this.nivel = 3;
            }
            this.ram = ram;
            this.disco = disco;
            this.cpu = cpu;
            if(arquitetura.equals("x64")) {
                this.arquitetura = true;
            } else if(arquitetura.equals("ARM")) {
                this.arquitetura = false;
            }
        }
    }

    class Laptop extends NCSLab {
        
    }

    class RaspberryPi extends NCSLab {

    }

    public static void main(String[] args) {

    }
}
