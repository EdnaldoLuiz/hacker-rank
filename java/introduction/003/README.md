<h1 align=center> Java If-Else </h1>

## Objetivo

Este exercício tem como objetivo testar seu conhecimento sobre o uso de declarações condicionais if-else para automatizar processos de tomada de decisão.

<div align=center>
    <img width="400px" src="https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png">
</div>

## Tarefa

Dado um inteiro `N`, execute as seguintes ações condicionais:
- Se `N` for ímpar, imprima "Weird".
- Se `N` for par e estiver no intervalo inclusivo de 2 a 5, imprima "Not Weird".
- Se `N` for par e estiver no intervalo inclusivo de 6 a 20, imprima "Weird".
- Se `N` for par e maior que 20, imprima "Not Weird".

Complete o código fornecido no seu editor para imprimir se `N` é estranho ou não.

## Formato de Entrada

Uma única linha contendo um número inteiro positivo `N`.

## Restrições

1 <= N <= 100

## Formato de Saída

Imprima "Weird" se o número for estranho; caso contrário, imprima "Not Weird".

## Exemplo de Entrada 0

    3

## Exemplo de Saída 0

    Weird

## Exemplo de Entrada 1

    24

## Exemplo de Saída 1

    Not Weird

## Explicação

### Caso de Exemplo 0: N = 3
`N` é ímpar e números ímpares são estranhos, então imprimimos "Weird".

### Caso de Exemplo 1: N = 24
`N > 20` e `N` é par, então não é estranho. Portanto, imprimimos "Not Weird".

## Código da Solução

```java
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String IGNORE_PATTERN = "(\r\n|[\n\r\u2028\u2029\u0085])?";

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip(IGNORE_PATTERN);
        
        boolean isOdd = N % 2 != 0;
        boolean isEvenAndInRange6To20 = N >= 6 && N <= 20;
        boolean isEvenAndInRange2To5 = N >= 2 && N <= 5;
        boolean isEvenAndGreaterThan20 = N > 20;

        if (isOdd || isEvenAndInRange6To20) {
            System.out.println("Weird");
        } else if (isEvenAndInRange2To5 || isEvenAndGreaterThan20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
```