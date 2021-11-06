# SOLID Java Project

Relacionado a:
- Coesão
- Acoplamento
- Encapsulamento

## Single Responsibility Principle: Coesão

"Uma classe deveria ter apenas um único motivo para mudar".

Motivo: relacionado a própria classe

Sempre que necessário, deve-se extender a interfaces, assim evitando acoplamento.

## Open Closed Principle

"Entidades de Software (classes, módulos, funções, etc.) devem estar abertas para extensão, porém fechadas para modificação."

- Cada classe deve conhecer e ser responsável por suas próprias regras de negócio.
- O princípio Aberto/Fechado (OCP) diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação
- Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes
já existentes

## Liskov Substitution Principle

"Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y de tipo S,
onde S é um subtipo de T".

- embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da 
maneira correta;
- O Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas
em qualquer lugar, sem problema.

## Interface Segregation Principle

"Uma classe não deveria ser forçada a depender de métodos que não utilizará."
- é mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos
e interfaces em si) do que das implementações de uma classe;
- As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
- As interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
- O Princípio de Segregação de Interfaces diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;

## Dependency Inversion Principle

"Abstrações não devem depender de implementações. Implementações devem depender de abstrações."
- O Princípio de Inversão de Dependência diz que implementações devem depender de abstrações e abstrações não devem
depender de implementações;
