<h1 align="center">Java Anagrams</h1>

## Objetivo

O objetivo deste desafio é verificar se duas strings são **anagramas**, ou seja, se contêm os mesmos caracteres com as mesmas frequências, independentemente de maiúsculas e minúsculas.

---

## Tarefa

Dadas duas strings \( a \) e \( b \), determine se elas são **anagramas**, ignorando diferenças de capitalização.

- Se forem anagramas, imprima **"Anagrams"**.
- Caso contrário, imprima **"Not Anagrams"**.

---

## Formato de Entrada

1. A primeira linha contém a string \( a \), composta apenas por letras do alfabeto inglês.
2. A segunda linha contém a string \( b \), também composta apenas por letras do alfabeto inglês.

---

## Formato de Saída

- Imprima **"Anagrams"** se as duas strings forem anagramas.
- Caso contrário, imprima **"Not Anagrams"**.

---

## Restrições

- As strings \( a \) e \( b \) consistem apenas de letras do alfabeto inglês (A-Z, a-z).
- A comparação **não deve ser sensível a maiúsculas e minúsculas**.

---

## Exemplos de Entrada e Saída

### Exemplo 1

**Entrada:**
```plaintext
anagram
margana
```

**Saída:**
```plaintext
Anagrams
```

**Explicação:**

| Caractere | Frequência em `anagram` | Frequência em `margana` |
|-----------|------------------------|------------------------|
| A ou a    | 3                        | 3                        |
| G ou g    | 1                        | 1                        |
| N ou n    | 1                        | 1                        |
| M ou m    | 1                        | 1                        |
| R ou r    | 1                        | 1                        |

As strings contêm os mesmos caracteres nas mesmas quantidades, portanto, são **anagramas**.

---

### Exemplo 2

**Entrada:**
```plaintext
anagramm
marganaa
```

**Saída:**
```plaintext
Not Anagrams
```

**Explicação:**

| Caractere | Frequência em `anagramm` | Frequência em `marganaa` |
|-----------|-------------------------|-------------------------|
| A ou a    | 3                         | 4                         |
| G ou g    | 1                         | 1                         |
| N ou n    | 1                         | 1                         |
| M ou m    | 2                         | 1                         |
| R ou r    | 1                         | 1                         |

As quantidades das letras "A" e "M" não correspondem, portanto, não são **anagramas**.

---

### Exemplo 3

**Entrada:**
```plaintext
Hello
hello
```

**Saída:**
```plaintext
Anagrams
```

**Explicação:**

| Caractere | Frequência em `Hello` | Frequência em `hello` |
|-----------|----------------------|----------------------|
| E ou e    | 1                      | 1                      |
| H ou h    | 1                      | 1                      |
| L ou l    | 2                      | 2                      |
| O ou o    | 1                      | 1                      |

As strings contêm os mesmos caracteres nas mesmas quantidades, portanto, são **anagramas**.

---

## Código da Solução

```java

```