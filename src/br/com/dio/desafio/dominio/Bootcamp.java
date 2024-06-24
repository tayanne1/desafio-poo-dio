package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }

    public void removerDev(Dev dev) {
        devsInscritos.remove(dev);
        dev.getConteudosInscritos().removeAll(conteudos);
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo) {
        conteudos.remove(conteudo);
    }

    public void progredirDev(Dev dev) {
        dev.progredir();
    }

    public void progredirTodosDevs() {
        devsInscritos.forEach(Dev::progredir);
    }

    public double calcularTotalXpBootcamp() {
        double xpTotal = 0;
        for (Dev dev : devsInscritos) {
            xpTotal += dev.calcularTotalXp();
        }
        return xpTotal;
    }

    public boolean devEstaInscrito(Dev dev) {
        return devsInscritos.contains(dev);
    }

    public void listarDevsInscritos() {
        System.out.println("Devs inscritos no Bootcamp " + nome + ":");
        for (Dev dev : devsInscritos) {
            System.out.println(dev.getNome());
        }
    }

    public void listarConteudosDisponiveis() {
        System.out.println("Conteúdos disponíveis no Bootcamp " + nome + ":");
        for (Conteudo conteudo : conteudos) {
            System.out.println(conteudo.getTitulo());
        }
    }

    public Dev buscarDevPorNome(String nomeDev) {
        for (Dev dev : devsInscritos) {
            if (dev.getNome().equalsIgnoreCase(nomeDev)) {
                return dev;
            }
        }
        return null; 
    }


    public Conteudo buscarConteudoPorTitulo(String tituloConteudo) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getTitulo().equalsIgnoreCase(tituloConteudo)) {
                return conteudo;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devsInscritos=" + devsInscritos +
                ", conteudos=" + conteudos +
                '}';
    }
}
