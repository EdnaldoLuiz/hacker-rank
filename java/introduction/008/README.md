

# Java Datatypes

## Objetivo

Neste desafio, utilizaremos os **tipos primitivos** do Java para verificar a capacidade de armazenamento de diferentes inteiros em variáveis específicas. O objetivo é determinar quais tipos primitivos podem armazenar corretamente os valores fornecidos como entrada.

---

## Tarefa

Dado um número inteiro de entrada, determine quais dos tipos primitivos do Java podem armazenar esse número. Os tipos primitivos a serem avaliados neste desafio são:

- **byte**: 8 bits, intervalo \(-128\) a \(127\)
- **short**: 16 bits, intervalo \(-32,768\) a \(32,767\)
- **int**: 32 bits, intervalo \(-2,147,483,648\) a \(2,147,483,647\)
- **long**: 64 bits, intervalo \(-9,223,372,036,854,775,808\) a \(9,223,372,036,854,775,807\)

Se o número não puder ser armazenado em nenhum dos tipos primitivos listados acima, exiba que o número **não pode ser armazenado**.

---

## Formato de Entrada

- A primeira linha contém um número inteiro, \( T \), representando o número de casos de teste.
- Cada uma das próximas \( T \) linhas contém um número inteiro \( n \), que pode ser arbitrariamente grande ou pequeno.

---

## Formato de Saída

Para cada valor \( n \):

- Se \( n \) puder ser armazenado em um ou mais tipos primitivos, exiba:
  ```plaintext
  n can be fitted in:
  * dataType
  ```
  Onde `dataType` é o nome de cada tipo primitivo que pode armazenar o valor \( n \), listado em ordem crescente de capacidade (byte, short, int, long).

- Se \( n \) não puder ser armazenado em nenhum dos tipos mencionados, exiba:
  ```plaintext
  n can't be fitted anywhere.
  ```

---

## Restrições

- O valor de \( n \) pode exceder os limites dos tipos primitivos padrão do Java.

---

## Exemplo de Entrada

```plaintext
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

---

## Exemplo de Saída

```plaintext
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

---

## Explicação

- O número **-150** pode ser armazenado em `short`, `int` e `long`, mas não cabe em um `byte`.
- O número **150000** pode ser armazenado em `int` e `long`, mas excede os limites de `byte` e `short`.
- O número **1500000000** pode ser armazenado em `int` e `long`.
- O número **213333333333333333333333333333333333** excede os limites de todos os tipos primitivos mencionados.
- O número **-100000000000000** pode ser armazenado apenas em `long`.

---

## Código da Solução

```java
import java.util.*;

class Solution {
    
    public static void dataType(long valor) {
        System.out.println(valor + " can be fitted in:");
        if(valor >= Byte.MIN_VALUE && valor <= Byte.MAX_VALUE) System.out.println("* byte");
        if(valor >= Short.MIN_VALUE && valor <= Byte.MAX_VALUE) System.out.println("* short");
        if(valor >= Integer.MIN_VALUE && valor <= Integer.MAX_VALUE) System.out.println("* int");
        if(valor >= Long.MIN_VALUE && valor <= Long.MAX_VALUE) System.out.println("* long");
    }
    
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x = sc.nextLong();
                dataType(x);
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
```