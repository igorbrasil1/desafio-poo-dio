import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        Aula aula1 = new Aula(1);
        aula1.setTitulo("Introdução");
        aula1.setDescricao("Introdução ao curso");
        Aula aula2 = new Aula(2);
        aula2.setTitulo("Primeiros Passos");
        aula2.setDescricao("Instalações");
        curso1.getAtividades().add(aula1);
        curso1.getAtividades().add(aula2);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        Aula aula3 = new Aula(1);
        aula3.setTitulo("Introdução");
        aula3.setDescricao("Introdução ao curso");
        Aula aula4 = new Aula(2);
        aula4.setTitulo("Primeiros Passos");
        aula4.setDescricao("Instalações");
        Desafio desafio1 = new Desafio();
        desafio1.setTitulo("Projeto inicial");
        desafio1.setDescricao("Primeiro Projeto do curso");
        curso2.getAtividades().add(aula3);
        curso2.getAtividades().add(aula4);
        curso2.getAtividades().add(desafio1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
