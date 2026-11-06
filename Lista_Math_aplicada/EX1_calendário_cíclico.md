# O calendário cíclico

| Domingo | Segunda | Terça | Quarta | Quinta | Sexta | Sábado |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| 0 | 1 | 2 | 3 | 4 | 5 | 6 |

## Problema A

Sendo hoje **terça-feira**, qual dia da semana será daqui a exatamente **100 dias**?

## Resolução

Como os dias da semana se repetem a cada **7 dias**, podemos usar o resto da divisão por 7.

### Dados

- Dia atual: terça-feira, representada por **2**.
- Dias decorridos: **100**.
- Duração do ciclo semanal: **7 dias**.

### Fórmula

$$
\text{dia futuro} = (\text{dia atual} + \text{dias decorridos}) \bmod 7
$$

### Aplicação

Substituindo os valores:

$$
\text{dia futuro} = (2 + 100) \bmod 7
$$

$$
\text{dia futuro} = 102 \bmod 7 = 4
$$

O resto é **4**, que corresponde à **quinta-feira**.

## Resposta

Daqui a exatamente **100 dias**, será **quinta-feira**.

---

## Problema B

Escreva uma linha de código utilizando o operador % que calcule e exiba esse dia.

## Resolução

Como os dias da semana se repetem a cada **7 dias**, podemos usar o resto da divisão por 7.

### Fórmula

```java
int diaAtual = lerInt();
int diaDescorrido = lerInt();
int diaFuturo = (diaAtual+diaDescorrido)%7;
System.out.println(diaFuturo);
```

## Resposta

Dentro de um Main em uma classe de um arquivo resultará na resposta do dia fututo em modo terminal