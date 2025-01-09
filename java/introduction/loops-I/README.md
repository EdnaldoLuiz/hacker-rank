<h1 align=center> Java Loops I </h1>

## Objetivo

Neste desafio, utilizamos **loops** para realizar cálculos matemáticos simples.

---

## Tarefa

Dado um número inteiro *N*, imprima seus primeiros **10 múltiplos**. Cada múltiplo *N x i*, onde `(1 <= i <= 10)` deve ser exibido em uma nova linha no seguinte formato:

**N * i = resultado**

---

## Formato de Entrada

Um único número inteiro *N*.

---

## Restrições

$$
2 <= N <= 20
$$

---

## Formato de Saída

Imprima **10 linhas** de saída. Cada linha deve conter o múltiplo de \( N \) no seguinte formato:


**N * i = resultado**


---

## Exemplo de Entrada

```plaintext
2
```

---

## Exemplo de Saída

```plaintext
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```

---

## Código da Solução

```java
import java.io.*;

public class Solution {
    
    public static void main(String[] args) throws IOException {
        
        int multiples = 10;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= multiples; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }
}
```