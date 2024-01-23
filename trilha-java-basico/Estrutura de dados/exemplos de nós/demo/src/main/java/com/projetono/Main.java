package com.projetono;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        No<String> no1 = new No<>("Conteúdo nó 1");
        No<String> no2 = new No<>("Conteúdo nó 2");

        no1.setProximonoNo(no2);

        No<String> no3 = new No<>("Conteúdo nó 3");

        no2.setProximonoNo(no3);

        No<String> no4 = new No<>("Conteúdo nó 4");

        no3.setProximonoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximonoNo());
        System.out.println(no1.getProximonoNo().getProximonoNo());
        System.out.println(no1.getProximonoNo().getProximonoNo().getProximonoNo());
        System.out.println(no1.getProximonoNo().getProximonoNo().getProximonoNo().getProximonoNo());
    
    }
}