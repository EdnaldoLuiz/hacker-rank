<h1 align=center> int to String </h1>

## Objetivo

Neste desafio, o objetivo é converter um número inteiro em uma string utilizando a linguagem de programação **Java**.

---

## Tarefa

Dado um número inteiro **n**, complete o código parcialmente fornecido para que ele converta corretamente o valor em uma string.

Se a conversão for bem-sucedida, o programa irá imprimir **"Good job"**. Caso contrário, imprimirá **"Wrong answer"**.

---

## Formato de Entrada

Um único número inteiro **n**.

---

## Restrições

$$
-100 ≤ n ≤ 100
$$

---

## Formato de Saída

Se a conversão for bem-sucedida, a saída será:

```plaintext
Good job
```

Caso contrário, será:

```plaintext
Wrong answer
```

---

## Exemplo de Entrada

```plaintext
100
```

---

## Exemplo de Saída

```plaintext
Good job
```

---

## Código da Solução

```java
import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            // String s=???; Complete this line below
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

```