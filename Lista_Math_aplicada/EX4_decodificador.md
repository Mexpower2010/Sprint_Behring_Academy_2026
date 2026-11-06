# Decodificador com Chaves Grandes e Negativas

A Cifra de César tradicional utiliza chaves de 1 a 25. O que acontece se um usuário informar uma chave como = 55 ou chave = -3?
Explique por que a expressão chave (pos + chave) % 26 lida com essas duas situações com precisão matemática, sem gerar erros de índice fora do intervalo.

## Resolução
para fins educacionais irei resolver baseado no mod euclidiano

considere o alfabeto:

Letra:  A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z  
Indice: 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

ao usarmos o mod 