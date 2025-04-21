import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // leitura do primeiro inteiro

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // leitura do segundo inteiro

        try {
            // Chamando o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Caso a exceção seja lançada, imprime a mensagem de erro
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação dos parâmetros. Se o primeiro parâmetro for maior, lança a exceção customizada.
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Laço de repetição para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
