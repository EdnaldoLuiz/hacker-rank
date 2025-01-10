<h1 align=center>Java Date and Time</h1>

## Objetivo

Neste desafio, o objetivo é determinar o dia da semana para uma data específica, utilizando a classe **`Calendar`** da linguagem de programação **Java**.

---

## Tarefa

Você deve implementar a função **`findDay`**, que recebe uma data representada pelos parâmetros **mês**, **dia** e **ano**, e retorna o nome do dia da semana correspondente em letras maiúsculas.

---

## Formato de Entrada

Uma única linha contendo os valores de entrada separados por espaços no seguinte formato:

```plaintext
MM DD YYYY
```

Onde:
- **MM** é o mês (1 a 12).
- **DD** é o dia (1 a 31).
- **YYYY** é o ano (1900 a 2100).

---

## Restrições

- Os valores fornecidos estão dentro do intervalo válido para uma data real.

$$
2000 < year < 3000
$$

---

## Formato de Saída

A saída deve ser uma única linha contendo o nome do dia da semana correspondente, em letras maiúsculas:

---

## Exemplo de Entrada

```plaintext
08 05 2015
```

---

## Exemplo de Saída

```plaintext
WEDNESDAY
```

---

## Código da Solução

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if(year < 2000 && year < 3000) {
            return "Intervalo de ano invalido";
        }
        int subtractNumberToMatchStartingMonth = 1;
        String weekDayNameFormatter = "EEEE";
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(
            year, 
            month - subtractNumberToMatchStartingMonth, 
            day
        );
        DateFormat formatter = new SimpleDateFormat(weekDayNameFormatter);
        String weekDay = formatter.format(calendar.getTime());
        return weekDay.toUpperCase();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
```