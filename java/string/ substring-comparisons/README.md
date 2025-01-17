<h1 align="center">Java Substring Comparisons</h1>

## Objetivo

Neste desafio, o objetivo é encontrar as substrings **menor** e **maior** em ordem lexicográfica dentro de uma string dada, considerando todas as substrings possíveis de um tamanho específico \( k \).

---

## Tarefa

Dada uma string \( s \) e um inteiro \( k \), encontre as substrings lexicograficamente **menor** e **maior** dentre todas as substrings possíveis de comprimento \( k \).

---

## Formato de Entrada

1. A primeira linha contém a string \( s \), composta apenas por letras do alfabeto inglês (maiúsculas e/ou minúsculas).
2. A segunda linha contém um inteiro \( k \), representando o tamanho das substrings a serem consideradas.

---

## Formato de Saída

A saída deve conter duas linhas:
1. A substring lexicograficamente **menor**.
2. A substring lexicograficamente **maior**.

---

## Restrições

- A string \( s \) consiste apenas de letras do alfabeto inglês.
- \( 1 \leq k \leq \text{tamanho de } s \leq 10^3 \).

---

## Exemplo de Entrada 0

```plaintext
welcometojava
3
```

---

## Exemplo de Saída 0

```plaintext
ava
wel
```

---

## Explicação 0

A string \( s \) é **"welcometojava"** e \( k = 3 \).  
As substrings de comprimento 3 são:

```plaintext
wel, elc, lco, com, ome, met, eto, toj, oja, jav, ava
```

Quando ordenadas lexicograficamente, temos:

```plaintext
ava, com, elc, eto, jav, lco, met, oja, ome, toj, wel
```

- A substring lexicograficamente **menor** é **"ava"**.
- A substring lexicograficamente **maior** é **"wel"**.

---

## Código da Solução

```java

```