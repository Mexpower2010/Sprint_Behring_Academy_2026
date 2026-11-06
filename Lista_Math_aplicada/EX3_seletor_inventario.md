# O Seletor de Inventário em Jogos
Considerando
  
| espada | arco | cajado | escudo |
| :---: | :---: | :---: | :---: |
| 0 | 1 | 2 | 3 |

e que o jogador começa no índice 0  e pressiona o botão de avançar item 14 vezes. Qual item estará selecionado ao final? Demonstre o cálculo modular correspondente.

## Cálculo 

Podemos definir como:

$$
\text{item selecionado ao final} = (0+14) \bmod 4
$$

Logo, o item selecionado ao final é o do índice 2, o cajado.