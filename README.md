# LabExtra LP2
Essa atividade vem de uma série de tarefas da matéria de Linguagem de programação 2 IMD - 0040

## Objetivo
Ela tem o objetivo de praticar os conceitos aprendidos em sala como: orientação a objetos, classes, herança, interfaces e polimorfismo.

## Implementação
A atividade foi toda implementada na linguagem java, ainda não foi feita com módulos, mas, feita com classes e interfaces. Como nesse
ponto da matéria ainda não tinha sido abordado o tratamento de erros, então há grande espaço para melhoria nessa questão.

## Desenvolvimento
Desenvolvi essa atividade utilizando como base o pdf da mesma que está disponibilizado aqui nesse repositório. Com base nele, comecei
criando a interface 'Fretavel', depois, parti para a classe 'Entregador' que seria a classe base para as classes 'Autonomo' e
'Funcionario'. Após modelar essas 3 classes, parti para a modelagem das classes 'Carro' e 'Moto', as quais são os métodos de transporte
que o sistema adota para o controle das entregas. Agora chega na parte difícil, a classe 'ServicoDeEntrega', confesso que me enrolei
com o polimorfismo nessa classe, não sabia que a interface virava uma instância também e poderia ter objetos do tipo 'Fretavel', com
isso bati um pouco de cabeça no desenvolvimento dessa classe, mas depois que aprendi que poderia, tudo se desenrolou e deu certo.
No main, fiz apenas os casos de teste que a atividade pedia e pronto, atividade feita.
