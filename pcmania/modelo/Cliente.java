package pcmania.modelo;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[100];
        this.qtdComputadores = 0;
    }

    public void addComputador(Computador computador) {
        if (qtdComputadores < computadores.length) {
            computadores[qtdComputadores] = computador;
            qtdComputadores++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostraCompras() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();

        if (qtdComputadores == 0) {
            System.out.println("Nenhum PC foi adquirido.");
        } else {
            System.out.println("PCs adquiridos:");
            for (int i = 0; i < qtdComputadores; i++) {
                System.out.println("\n  --- PC " + (i + 1) + " ---");
                computadores[i].mostraPCConfig();
            }
            System.out.printf("%nTotal da compra: R$%.2f%n", calculaTotalCompra());
        }
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }
}
