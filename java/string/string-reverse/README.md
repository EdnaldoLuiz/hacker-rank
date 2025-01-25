<h1 align="center">Java String Reverse</h1>

## Objetivo

Neste desafio, o objetivo é verificar se uma string fornecida é um **palíndromo**, ou seja, se a string lida da esquerda para a direita é igual à string lida da direita para a esquerda.

---

## Tarefa

Dada uma string \(A\), determine se ela é um palíndromo.

- Se for um palíndromo, imprima **"Yes"**.
- Caso contrário, imprima **"No"**.

---

## Formato de Entrada

- A entrada consiste em uma única linha contendo uma string \(A\), composta apenas por letras minúsculas do alfabeto inglês.

---

## Formato de Saída

- A saída deve ser **"Yes"** se a string for um palíndromo, caso contrário, deve ser **"No"**.

---

## Restrições

- A string \(A\) conterá, no máximo, \( 50 \) caracteres minusculos no padrão inglês.

---

## Exemplo de Entrada

```plaintext
madam
```

---

## Exemplo de Saída

```plaintext
Yes
```

---

## Explicação

A string **"madam"** lida de trás para frente resulta em **"madam"**, o que significa que a string é um palíndromo. Assim, a saída correta é **"Yes"**.

---

## Código da Solução

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        isPalindrome(A);
        sc.close();
    }
    
    public static void isPalindrome(String text) {
        String palindrome = new StringBuilder(text).reverse().toString();
        if(palindrome.equals(text)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

---