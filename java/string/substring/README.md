<h1 align="center">Substring em Java</h1>

## Objetivo

Neste desafio, utilizaremos o método `substring` da classe **String** em Java para extrair uma substring de um texto dado. A substring será composta por todos os caracteres dentro de um intervalo inclusivo de índices, fornecido como entrada.

---

## Tarefa

Dado uma string \( S \) e dois índices \( a \) e \( b \), imprima a substring formada pelos caracteres no intervalo inclusivo de \( a \) a \( b \).

---

## Formato de Entrada

1. A primeira linha contém uma string, \( S \), composta exclusivamente por letras do alfabeto inglês (maiúsculas ou minúsculas).
2. A segunda linha contém dois inteiros, \( a \) e \( b \), separados por um espaço, indicando o intervalo de índices inclusivos para a substring.

---

## Restrições

- A string \( S \) consiste apenas de letras do alfabeto inglês (A-Z, a-z).
- \( 0 \leq a \leq b < \text{tamanho de } S \).

---

## Formato de Saída

- Imprima a substring formada pelos caracteres do índice \( a \) ao índice \( b \) (inclusive) de \( S \).

---

## Exemplo de Entrada

```plaintext
Helloworld
3 7
```

---

## Exemplo de Saída

```plaintext
lowo
```

---

## Explicação

A string fornecida é **Helloworld**. O intervalo especificado é \( [3, 7] \), que inclui os caracteres nos índices 3, 4, 5, 6 e 7.

Abaixo está a representação da substring destacada:

<div align=center>
    <img width="600px" src="https://s3.amazonaws.com/hr-challenge-images/22039/1470896981-637b6a022f-substring.png">
</div>

## Código da Solução

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String result = S.substring(start, end);
        in.close();
        System.out.println(result);
    }
}
```