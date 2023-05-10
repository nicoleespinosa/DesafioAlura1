<h1>Sistema Bancário</h1>
Este é um programa simples em Java que simula um sistema bancário básico. O programa permite que o usuário realize consultas de saldo, receba valores e transfira valores entre contas.

<h2>Funcionalidades</h2>
O programa apresenta um menu de opções que permite ao usuário escolher entre as seguintes operações:

Consultar saldo: exibe o saldo atual da conta.
Receber valor: permite ao usuário adicionar um valor ao saldo da conta.
Transferir valor: permite ao usuário transferir um valor para outra conta.
Sair: encerra o programa.
<h2>Implementação</h2>
O programa é implementado na classe Conta, que contém o método main para iniciar a execução. O programa utiliza a classe Scanner para obter a entrada do usuário.

O programa utiliza variáveis para armazenar informações sobre a conta, como o nome do cliente, o tipo de conta (fixo como "Corrente"), e o saldo inicial.

O menu de opções é exibido em um loop while que continua executando até que a opção "Sair" seja selecionada. Durante cada iteração do loop, o programa exibe as informações da conta e o menu de opções para o usuário.

O programa utiliza estruturas condicionais if-else para executar a operação escolhida pelo usuário. Se o usuário selecionar a opção de consultar o saldo, o programa exibe o saldo atual da conta. Se o usuário selecionar a opção de receber um valor, o programa solicita o valor a ser adicionado e atualiza o saldo. Se o usuário selecionar a opção de transferir um valor, o programa solicita o valor a ser transferido e verifica se o saldo é suficiente para a transferência. Se o saldo for suficiente, o programa realiza a transferência e atualiza o saldo. Caso contrário, o programa exibe uma mensagem informando que o saldo é insuficiente.
