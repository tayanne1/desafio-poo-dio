# Modificações no Código Original

## Bootcamp Class:
### Modificações: 
Alterei a implementação da classe Bootcamp para adicionar funcionalidades que facilitam a gestão de desenvolvedores (Dev) e conteúdos (Conteudo) inscritos no bootcamp.


#### Novos Métodos:
- **adicionarDev(Dev dev): Adiciona um desenvolvedor ao bootcamp e inscreve-o automaticamente nos conteúdos disponíveis**
- **removerDev(Dev dev): Remove um desenvolvedor do bootcamp e cancela sua inscrição nos conteúdos**
- **adicionarConteudo(Conteudo conteudo): Adiciona um novo conteúdo ao bootcamp**
- **removerConteudo(Conteudo conteudo): Remove um conteúdo do bootcamp**
- **progredirDev(Dev dev): Avança o progresso de um desenvolvedor nos conteúdos inscritos**
- **progredirTodosDevs(): Avança o progresso de todos os desenvolvedores inscritos nos conteúdos**
- **calcularTotalXpBootcamp(): Calcula o total de XP acumulado por todos os desenvolvedores inscritos no bootcamp**
- **devEstaInscrito(Dev dev): Verifica se um desenvolvedor está inscrito no bootcamp**
- **listarDevsInscritos(): Lista os desenvolvedores atualmente inscritos no bootcamp**
- **listarConteudosDisponiveis(): Lista os conteúdos disponíveis no bootcamp**
- **buscarDevPorNome(String nomeDev): Busca um desenvolvedor inscrito no bootcamp pelo nome**
- **buscarConteudoPorTitulo(String tituloConteudo): Busca um conteúdo no bootcamp pelo título**


### Refatorações:
Utilizei HashSet para armazenar os desenvolvedores e conteúdos, garantindo a remoção automática de duplicatas e ordenação mais eficiente.

## Main Class:
### Modificações: 
Refatorei o método main para incorporar as novas funcionalidades da classe Bootcamp.

#### Novos Recursos:
- Inseri novos métodos para testar e demonstrar as funcionalidades adicionadas na classe Bootcamp
- Implementei chamadas aos métodos adicionados na classe Bootcamp para gerenciar inscrições de desenvolvedores, progresso nos conteúdos e cálculo de XP.
- Exibi informações detalhadas sobre os conteúdos inscritos e concluídos por cada desenvolvedor.
- Adicionei métodos auxiliares para formatar e exibir os conteúdos de maneira legível.

## Exemplo de Utilização
O código foi estruturado de forma a permitir uma gestão mais eficiente de bootcamps, proporcionando maior controle sobre os desenvolvedores inscritos e os conteúdos oferecidos. As modificações garantem uma implementação mais robusta e organizada, facilitando a manutenção e ampliação do sistema.

##
Este arquivo README.md descreve as alterações e melhorias realizadas no código original do projeto, destacando as funcionalidades adicionadas e a forma como foram implementadas.


