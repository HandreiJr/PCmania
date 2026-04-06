package pcmania.modelo;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private int qtdHardwares;

    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwares = new HardwareBasico[10];
        this.qtdHardwares = 0;
        this.memoriaUSB = null;
    }

    public void addHardwareBasico(HardwareBasico hw) {
        if (qtdHardwares < hardwares.length) {
            hardwares[qtdHardwares] = hw;
            qtdHardwares++;
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfig() {
        System.out.println("  Marca: " + marca);
        System.out.printf("  Preço: R$%.2f%n", preco);

        for (int i = 0; i < qtdHardwares; i++) {
            HardwareBasico hw = hardwares[i];
            System.out.println("  " + hw.getNome() + ": " + hw.getCapacidade());
        }

        if (sistemaOperacional != null) {
            System.out.println("  Sistema Operacional: " + sistemaOperacional.getNome()
                    + " (" + sistemaOperacional.getTipo() + " bits)");
        }

        if (memoriaUSB != null) {
            System.out.println("  Acompanha " + memoriaUSB.getNome()
                    + " de " + memoriaUSB.getCapacidade() + " GB");
        }
    }
}
