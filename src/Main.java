import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.of(2024, 6, 24));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
       
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir(); 
        devCamila.progredir();

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir(); 
        devJoao.progredir(); 

        System.out.println("-------------------------------");
        System.out.println("Conteúdos Inscritos Camila:");
        System.out.println(formatarConteudos(devCamila.getConteudosInscritos()));
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Camila:");
        System.out.println(formatarConteudos(devCamila.getConteudosConcluidos()));
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------------------------------");
        System.out.println("Conteúdos Inscritos João:");
        System.out.println(formatarConteudos(devJoao.getConteudosInscritos()));
        System.out.println("-");
        System.out.println("Conteúdos Concluídos João:");
        System.out.println(formatarConteudos(devJoao.getConteudosConcluidos()));
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("-------------------------------");
        System.out.println("Devs inscritos no Bootcamp " + bootcamp.getNome() + ":");
        bootcamp.listarDevsInscritos();
        System.out.println("Conteúdos disponíveis no Bootcamp " + bootcamp.getNome() + ":");
        bootcamp.listarConteudosDisponiveis();

        System.out.println("-------------------------------");
        System.out.println("Buscando dev por nome 'Camila':");
        Dev devEncontrado = bootcamp.buscarDevPorNome("Camila");
        if (devEncontrado != null) {
            System.out.println("Dev encontrado: " + devEncontrado.getNome());
        } else {
            System.out.println("Dev 'Camila' não encontrado.");
        }

        System.out.println("Buscando conteúdo por título 'curso java':");
        Conteudo conteudoEncontrado = bootcamp.buscarConteudoPorTitulo("curso java");
        if (conteudoEncontrado != null) {
            System.out.println("Conteúdo encontrado: " + conteudoEncontrado.getTitulo());
        } else {
            System.out.println("Conteúdo 'curso java' não encontrado.");
        }
    }

    private static String formatarConteudos(Collection<Conteudo> conteudos) {
        if (conteudos.isEmpty()) {
            return "Nenhum conteúdo";
        }

        StringBuilder sb = new StringBuilder();
        for (Conteudo conteudo : conteudos) {
            sb.append("- ").append(conteudo).append("\n");
        }
        return sb.toString();
    }
}
