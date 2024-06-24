# Modificações no Código Original

## Bootcamp Class:
Modificações: Alterei a implementação da classe Bootcamp para adicionar funcionalidades que facilitam a gestão de desenvolvedores (Dev) e conteúdos (Conteudo) inscritos no bootcamp.

Novos Métodos:
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