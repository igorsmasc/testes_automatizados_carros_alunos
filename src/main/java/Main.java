import java.util.function.Function;

/**
 *
 * Um carro tem os seguintes atributos:
 *  - cor
 *  - marca
 *  - modelo
 *  - ligado
 *  - velocidadeAtual
 *  - velocidadeMáxima
 *
 *  Enquanto o carro estiver desligado deve ser capaz de:
 *  - Ligar
 *
 * Enquanto o carro estiver ligado deve ser capaz de:
 * - Desligar
 * - Acelerar
 * - Frear
 * - Motrar estado atual
 *
 * Regras:
 * - O carro não pode passar de sua velocidade máxima
 * - Só podemos realizar as ações com o carro ligado
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - Não existe velocidade negativa
 *
 */

// mostrarValor(somar(1, 2));
    //somar(1, 2) -> 3
// mostrarValor(3);

public class Main {
    public static void main(String[] args) {

    }

    private static void mostrarValor(int valor) {
        System.out.println(valor);
    }
}
