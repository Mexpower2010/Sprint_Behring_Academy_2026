# Paridade Explicada
Conheçendo o operador % (mod) que gera resto de divisão podemos descobrir a paridade de qualquer número inteiro, mas por que?
## Explicação
Considere um número inteiro N ele só pode ser **par ou ímpar**, uma resposta bínaria
logo, quando a gente dívide por dois o resto tambem **so pode ser 1 ou 0**
sendo resto **0 para números pares** (divisores de dois) ou **1 para números ímpares**!!

Com isso um **código simples como esse:**

```python 
numero = int(input("Digite um número: "))
eh_par = numero % 2 == 0
```

pode demonstrar a paridade de qualquer número

