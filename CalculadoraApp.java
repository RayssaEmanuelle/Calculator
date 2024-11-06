import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.executar();
    }
}

class Calculadora {
    private final Scanner scanner = new Scanner(System.in);


    public void executar() {
        Double num1, num2;
        String operacao;
        boolean continuar;

        do {
            System.out.println("Digite o primeiro valor: ");
            num1 = scanner.nextDouble();

            System.out.println("Digite a operação (+, -, /, *): ");
            operacao = scanner.next();

            System.out.println("Digite o segundo valor: ");
            num2 = scanner.nextDouble();

            System.out.println("Resultado: " + realizarCalculo(num1, num2, operacao));
            continuar = verificarNovaOperacao();
        } while (continuar);
    }


    public boolean verificarNovaOperacao() {
        System.out.println("Deseja realizar uma nova operação? (S/N) ");
        return !scanner.next().toUpperCase(Locale.ROOT).equals("N");
    }


    public Double realizarCalculo(Double num1, Double num2, String operacao) {
        Operacao operacaoEscolhida = Operacaof.criarOperacao(operacao);
        if (operacaoEscolhida != null) {
            return operacaoEscolhida.calcular(num1, num2);
        } else {
            System.out.println("Operação inválida!!!");
            return 0.0;
        }
    }
}


interface Operacao {
    Double calcular(Double num1, Double num2);
}


class Soma implements Operacao {
    public Double calcular(Double num1, Double num2) {
        return num1 + num2;
    }
}


class Subtracao implements Operacao {
    public Double calcular(Double num1, Double num2) {
        return num1 - num2;
    }
}


class Divisao implements Operacao {
    public Double calcular(Double num1, Double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero não permitida.");
            return 0.0;
        }
        return num1 / num2;
    }
}


class Multiplicacao implements Operacao {
    public Double calcular(Double num1, Double num2) {
        return num1 * num2;
    }
}


class Operacaof {
    public static Operacao criarOperacao(String operacao) {
        return switch (operacao) {
            case "+" -> new Soma();
            case "-" -> new Subtracao();
            case "/" -> new Divisao();
            case "*" -> new Multiplicacao();
            default -> null;
        };
    }
}
