<h1 align=center> Java Stdin and Stdout I </h1>

## Objetivo

Este exercício tem como objetivo praticar a leitura de entrada do stdin e a escrita de saída no stdout em Java.

## Formato de Entrada

Existem `n` linhas de entrada, e cada linha contém um único inteiro.

## Formato de Saída

Você deve imprimir cada inteiro em uma nova linha.

## Exemplo de Entrada

    42
    100
    125

## Exemplo de Saída

    42
    100
    125

## Código da Solução

```java
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int myInt = scanner.nextInt();
            System.out.println(myInt);
        }
        scanner.close();
    }
}
```