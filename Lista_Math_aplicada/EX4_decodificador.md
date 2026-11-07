# Decodificador com Chaves Grandes e Negativas

## O problema

A Cifra de César tradicional usa chaves de 1 a 25. O que acontece se o usuário informar uma chave como `55` ou `-3`? Por que a expressão `(pos + chave) % 26` lida com essas situações com precisão matemática, sem gerar erros de índice fora do intervalo?

## Como funciona

O operador `%` (módulo) devolve o **resto da divisão** por 26. Isso "enrola" qualquer número dentro do intervalo de 0 a 25, que são as 26 posições do alfabeto.

- `pos` é a posição da letra no alfabeto (A = 0, B = 1, ..., Z = 25).
- `chave` é o deslocamento informado pelo usuário.
- O resultado `(pos + chave) % 26` é sempre uma posição válida.

## Caso 1: chave grande (55)

Dar 26 passos é dar uma volta completa no alfabeto. Então `55` equivale a `55 % 26 = 3`.

Exemplo com a letra `C` (pos = 2):

```
(2 + 55) % 26 = 57 % 26 = 5  ->  F
```

É o mesmo resultado de usar a chave 3: `(2 + 3) % 26 = 5`.

## Caso 2: chave negativa (-3)

Uma chave negativa desloca as letras para trás.

Exemplo com a letra `E` (pos = 4):

```
(4 + (-3)) % 26 = 1 % 26 = 1  ->  B
```

Se o resultado ficar negativo, por exemplo com a letra `B` (pos = 1):

```
(1 + (-3)) % 26 = -2 % 26
```

- **Em Python**, o módulo com divisor positivo sempre retorna um valor não negativo: `-2 % 26 = 24`, que é `Y`. Está correto.
- **Em C, C++, Java e JavaScript**, `-2 % 26` retorna `-2`, o que causaria erro de índice. Nessas linguagens, use:

```
((pos + chave) % 26 + 26) % 26
```

## Resumo

| Chave | Equivale a | Efeito |
|------:|-----------:|:-------|
| 55    | 3          | Avança 3 posições (duas voltas completas + 3) |
| -3    | 23         | Recua 3 posições (igual a avançar 23) |

## Por que nunca dá erro de índice?

Para qualquer inteiro `n`, o módulo 26 mapeia o valor em um número entre 0 e 25. Assim, o índice sempre fica dentro do alfabeto, qualquer que seja a chave.

