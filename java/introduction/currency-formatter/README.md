<h1> Java Currency Formatter </h1>

## Objetivo

Neste desafio, o objetivo é utilizar a classe **NumberFormat** para converter um valor monetário em diferentes formatos de moeda, conforme os locais (locales) dos seguintes países:

- Estados Unidos
- Índia
- China
- França

---

## Tarefa

Dado um valor em ponto flutuante de precisão dupla (**double**), utilize o método **getCurrencyInstance** da classe **NumberFormat** para formatar o valor nos formatos de moeda dos países mencionados. Em seguida, imprima os valores formatados conforme o exemplo abaixo:

```plaintext
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
```

aonde *formattedPayment* é o pagamento formatado de acordo com o local

> Obs: India não possui um Locale, você precisa construir um usando aonde a lingua é `EN`

---

## Formato de Entrada

Um único valor em ponto flutuante de precisão dupla (**double**).

---

## Restrições

$$
0 <= payment <= 10^9
$$

---

## Formato de Saída

1. Na primeira linha, imprima **US: u**, onde **u** é o valor formatado para a moeda dos Estados Unidos.
2. Na segunda linha, imprima **India: i**, onde **i** é o valor formatado para a moeda da Índia.
3. Na terceira linha, imprima **China: c**, onde **c** é o valor formatado para a moeda da China.
4. Na quarta linha, imprima **France: f**, onde **f** é o valor formatado para a moeda da França.

---

## Exemplo de Entrada

```plaintext
12324.134
```

---

## Exemplo de Saída

```plaintext
US: $12,324.13
India: Rs.12,324.13
China: ¥12,324.13
France: 12 324,13 €
```

---

## Explicação

Cada linha contém o valor formatado de acordo com o formato de moeda dos respectivos países.
Observe que o formato indiano requer a criação de um **Locale** personalizado, pois ele não está embutido na classe **Locale** do Java.

---

## Código da Solução

```java
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale indiaLocale = new Locale("en", "IN");
        
        String us = getCurrency(Locale.US, payment);
        String india = getCurrency(indiaLocale, payment);
        String china = getCurrency(Locale.CHINA, payment);
        String france = getCurrency(Locale.FRANCE, payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
    public static String getCurrency(Locale locale, double payment) {
        return NumberFormat
        .getCurrencyInstance(locale)
        .format(payment);
    }
}
```