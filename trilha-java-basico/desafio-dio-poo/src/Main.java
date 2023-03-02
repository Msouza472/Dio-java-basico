import java.time.LocalDate;

import dio.com.dio.desafio.dominio.Bootcamp;
import dio.com.dio.desafio.dominio.Curso;
import dio.com.dio.desafio.dominio.Dev;
import dio.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());
      
       /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos concluidos Camila " + devCamila.getConteudosConcluidos());

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Matheus " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("Conteúdos inscritos Matheus " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Matheus " + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

        

    }
}
