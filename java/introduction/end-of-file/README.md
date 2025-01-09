<h1 align=center> Java End-of-file </h1>

## Objetivo

Neste desafio, vamos trabalhar com o conceito de **Fim de Arquivo** (EOF) em sistemas operacionais. O objetivo é ler linhas de entrada até alcançar o EOF e numerar cada linha lida, exibindo-a no formato apropriado.

---

## Tarefa

Você deve ler um número desconhecido de linhas de entrada a partir do **stdin** (`System.in`) até encontrar o EOF. Cada linha de entrada conterá uma **String não vazia**. Numere e imprima cada linha na ordem em que foi lida.

---

## Formato de Entrada

- Linhas consecutivas de entrada até o EOF.
- Cada linha contém uma **String não vazia**.

---

## Formato de Saída

Para cada linha lida, exiba o número da linha seguido por um espaço e o conteúdo da linha.

---

## Exemplo de Entrada

```plaintext
Hello world
I am a file
Read me until end-of-file.
```

## Código da Solução

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(scanner.hasNextLine()) {
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
```