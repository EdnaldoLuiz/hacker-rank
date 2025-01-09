<h1 align=center> Java Output Formating </h1>

## Objetivo

Este exercício tem como objetivo testar sua compreensão sobre a formatação de saída usando a função `System.out.printf` em Java.

## Formato de Entrada

Cada linha de entrada conterá uma String seguida por um inteiro. 
- Cada String terá no máximo 10 caracteres alfabéticos.
- Cada inteiro estará no intervalo inclusivo de 0 a 999.

## Formato de Saída

Em cada linha de saída devem haver duas colunas:
- A primeira coluna contém a String e é justificada à esquerda usando exatamente 15 caracteres.
- A segunda coluna contém o inteiro, expresso em exatamente 3 dígitos; se o valor original tiver menos de três dígitos, você deve preencher os dígitos à esquerda com zeros.

## Exemplo de Entrada

    java 100
    cpp 65
    python 50

## Exemplo de Saida

    ================================
    java           100 
    cpp            065 
    python         050 
    ================================


## Explicação

Cada String é justificada à esquerda com espaços em branco até completar 15 caracteres. O inteiro é formatado para ter exatamente 3 dígitos, preenchendo com zeros à esquerda se necessário.

## Código da Solução

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        sc.close();
        System.out.println("================================");
    }
}
```