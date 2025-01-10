# Java Static Initializer Block

## Objetivo

Neste desafio, vamos trabalhar com o conceito de **blocos de inicialização estática** (Static Initialization Blocks) em Java. Esses blocos são executados quando a classe é carregada, permitindo que variáveis estáticas sejam inicializadas de forma controlada. Nosso objetivo será ler duas variáveis (breadth e height) e calcular a área de um paralelogramo, considerando as regras impostas no enunciado.

---

## Tarefa

Você receberá duas linhas de entrada contendo valores inteiros:
- **breadth** (largura)
- **height** (altura)

A tarefa é:
1. Ler esses dois valores do **stdin** (`System.in`).
2. Verificar se ambos são positivos.
3. Se um dos valores for menor ou igual a zero, lançar (exibir) a exceção:
   ```
   java.lang.Exception: Breadth and height must be positive
   ```
4. Caso contrário, exibir a área do paralelogramo, que é dada por:
   ```
   breadth * height
   ```

O uso do **bloco de inicialização estática** será fundamental para realizar a leitura e a validação das variáveis estáticas.

---

## Formato de Entrada

1. A primeira linha de entrada contém um número inteiro que representa **breadth**.
2. A segunda linha de entrada contém um número inteiro que representa **height**.

**Exemplo:**

```
1
3
```

---

## Formato de Saída

- Se ambos os valores (**breadth** e **height**) forem maiores que zero, a saída deve ser o resultado inteiro da área do paralelogramo.
- Caso um ou ambos os valores sejam menores ou iguais a zero, a saída deve ser:

```
java.lang.Exception: Breadth and height must be positive
```

---

## Exemplo de Entrada

### Exemplo 1

```
1
3
```

**Saída esperada**:
```
3
```

### Exemplo 2

```
-1
2
```

**Saída esperada**:
```
java.lang.Exception: Breadth and height must be positive
```

---

## Código da Solução

```java
public class Solution {

    static int B, H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }

    public static void main(String[] args) {
            if(flag){
                int area=B*H;
                System.out.print(area);
        }
    }//end of main
}//end of class
```

> **Observação**: Caso o valor de **B** ou **H** seja inválido, a mensagem de exceção é exibida imediatamente no bloco estático, e a variável `flag` indica que não deve haver nenhum outro processamento na função `main`.