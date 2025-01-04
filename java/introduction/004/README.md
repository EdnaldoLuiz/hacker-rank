<h1 align=center> Java Stdin and Stdout II </h1>

## Objetivo

Este exercício tem como objetivo praticar a leitura de diferentes tipos de dados do stdin e a impressão desses valores conforme as instruções.

## Formato de Entrada

Existem três linhas de entrada:
- A primeira linha contém um inteiro.
- A segunda linha contém um double.
- A terceira linha contém uma String.

## Formato de Saída

Existem três linhas de saída:
- Na primeira linha, imprima `String:` seguido pela String lida do stdin.
- Na segunda linha, imprima `Double:` seguido pelo double lido do stdin.
- Na terceira linha, imprima `Int:` seguido pelo inteiro lido do stdin.

## Nota

Se você usar o método `nextLine()` imediatamente após o método `nextInt()`, lembre-se de que `nextInt()` lê tokens inteiros; por causa disso, o último caractere de nova linha para essa linha de entrada de inteiro ainda está na fila no buffer de entrada e o próximo `nextLine()` lerá o restante da linha do inteiro (que está vazio).

## Exemplo de Entrada

    42
    3.1415
    Welcome to HackerRank's Java tutorials!

## Exemplo de Saída

    String: Welcome to HackerRank's Java tutorials!
    Double: 3.1415
    Int: 42

## Código da Solução

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();
        
        scanner.close();
        
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
```