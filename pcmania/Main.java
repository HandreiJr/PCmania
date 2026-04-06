package pcmania;

import pcmania.modelo.*;
import pcmania.util.ProcessarPedido;
import java.util.Scanner;

public class Main {

    private static final float MATRICULA = 700;

    public static void main(String[] args) {

        Computador pc1 = new Computador("Apple", MATRICULA,
                new SistemaOperacional("macOS Sequoia", 64));
        pc1.addHardwareBasico(new HardwareBasico("Processador Core i3 (MHz)", 2200));
        pc1.addHardwareBasico(new HardwareBasico("Memoria RAM (GB)", 8));
        pc1.addHardwareBasico(new HardwareBasico("HD (GB)", 500));
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador pc2 = new Computador("Samsung", MATRICULA + 1234,
                new SistemaOperacional("Windows 8", 64));
        pc2.addHardwareBasico(new HardwareBasico("Processador Core i5 (MHz)", 3370));
        pc2.addHardwareBasico(new HardwareBasico("Memoria RAM (GB)", 16));
        pc2.addHardwareBasico(new HardwareBasico("HD (GB)", 1024));
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador pc3 = new Computador("Dell", MATRICULA + 5678,
                new SistemaOperacional("Windows 10", 64));
        pc3.addHardwareBasico(new HardwareBasico("Processador Core i7 (MHz)", 4500));
        pc3.addHardwareBasico(new HardwareBasico("Memoria RAM (GB)", 32));
        pc3.addHardwareBasico(new HardwareBasico("HD (GB)", 2048));
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1024));

        Computador[] promocoes = {pc1, pc2, pc3};

        Cliente cliente = new Cliente("Handrei Junior", "144.979.876-47");

        Scanner scanner = new Scanner(System.in);
        int cod;

        System.out.println("=== Bem-vindo à PC Mania! ===");
        System.out.println();
        exibirPromocoes(promocoes);

        do {
            System.out.print("\nDigite o código da promoção desejada (1, 2 ou 3) ou 0 para finalizar: ");
            cod = scanner.nextInt();

            if (cod >= 1 && cod <= 3) {
                cliente.addComputador(promocoes[cod - 1]);
                System.out.println("Promoção " + cod + " adicionada ao carrinho!");
            } else if (cod != 0) {
                System.out.println("Código inválido... Por favor, insira 1, 2, 3 ou 0.");
            }

        } while (cod != 0);

        scanner.close();

        System.out.println("\n========================================");
        System.out.println("           RESUMO DA COMPRA             ");
        System.out.println("========================================");
        cliente.mostraCompras();

        ProcessarPedido.processarPedido(cliente.getComputadores(), cliente.getQtdComputadores());
    }

    private static void exibirPromocoes(Computador[] promocoes) {
        System.out.println("Promoções disponíveis:");
        for (int i = 0; i < promocoes.length; i++) {
            System.out.println("\n=== Promoção " + (i + 1) + " ===");
            promocoes[i].mostraPCConfig();
        }
    }
}
