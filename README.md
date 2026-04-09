# Sistema de Folha de Pagamento em Java

Este projeto foi desenvolvido como atividade prática da disciplina "Algoritmos e Programação".

O objetivo é simular um sistema simples de folha de pagamento para uma empresa, permitindo o cadastro de colaboradores e o cálculo do salário final conforme o tipo de vínculo.

Objetivos
- Aplicar conceitos de lógica e programação
- Utilizar estruturas condicionais e de repetição
- Trabalhar com 'ArrayList'
- Organizar o código em classes e métodos
- Simular um problema real de folha de pagamento

Tecnologias
- Java
- IntelliJ IDEA
- Git/GitHub

Funcionalidades:
- Cadastrar Funcionário Padrão
- Cadastrar Funcionário Comissionado
- Cadastrar Funcionário de Produção
- Gerar Folha de Pagamento
- Encerrar o sistema

Regras de negócio:
- Todos os colaboradores possuem:
  - Nome
  - Matrícula
  - Salário base

Tipos de colaboradores:
- Funcionário Padrão → recebe apenas salário base
- Funcionário Comissionado → recebe salário base + comissão
- Funcionário de Produção → recebe salário base + bônus por produtividade

Fórmulas:
- Comissão = '(vendas * percentual / 100)'
- Bônus = '(valorPorPeça * quantidadeProduzida)'

Salário Base
Foi utilizada uma constante com o valor:

#java
static final double SALARIO_BASE = 2000.0;
