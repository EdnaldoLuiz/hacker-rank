<h1 align=center> Java Strings Introduction </h1>

## Objetivo

Neste desafio, vamos trabalhar com o conceito de manipulação de **Strings** em Java. O objetivo é realizar algumas operações específicas com duas strings fornecidas, como calcular seu tamanho total, verificar a ordem lexicográfica e formatar suas primeiras letras em maiúsculas.

---

## Tarefa

Dadas duas strings compostas apenas por letras minúsculas do alfabeto inglês, você deve realizar as seguintes operações:

1. Calcular a soma dos comprimentos das duas strings.
2. Determinar se a primeira string é lexicograficamente maior que a segunda (ou seja, se ela aparece **depois** no dicionário).
3. Capitalizar a primeira letra de cada string e exibi-las separadas por um espaço.

---

## Formato de Entrada

1. A primeira linha contém a string **A**.
2. A segunda linha contém a string **B**.

As strings são compostas apenas por letras minúsculas do alfabeto inglês.

---

## Formato de Saída

1. Na primeira linha, exiba a soma dos comprimentos das strings **A** e **B**.
2. Na segunda linha, exiba `Yes` se **A** for lexicograficamente maior que **B**; caso contrário, exiba `No`.
3. Na terceira linha, exiba as duas strings com a primeira letra de cada uma em maiúscula, separadas por um espaço.

---

## Exemplos

### Exemplo 1

**Entrada**:
```
hello
java
```

**Saída esperada**:
```
9
No
Hello Java
```

**Explicação**:
1. O comprimento total é `5 (hello) + 4 (java) = 9`.
2. Lexicograficamente, "hello" vem antes de "java", então a resposta é `No`.
3. As strings capitalizadas são "Hello" e "Java".

---

### Exemplo 2

**Entrada**:
```
zebra
apple
```

**Saída esperada**:
```
10
Yes
Zebra Apple
```

**Explicação**:
1. O comprimento total é `5 (zebra) + 5 (apple) = 10`.
2. Lexicograficamente, "zebra" vem depois de "apple", então a resposta é `Yes`.
3. As strings capitalizadas são "Zebra" e "Apple".

---

## Código da Solução

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int sum = A.length() + B.length();
        System.out.println(sum);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(firstLetterUppercase(A) + " " + firstLetterUppercase(B));
    }
    
    public static String firstLetterUppercase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
```