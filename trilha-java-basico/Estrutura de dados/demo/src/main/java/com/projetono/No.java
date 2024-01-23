package com.projetono;

public class No {

    private String conteudo;
    private No proximonoNo;
    public No(String conteudo) {
        this.proximonoNo= null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public No getProximonoNo() {
        return proximonoNo;
    }
    public void setProximonoNo(No proximonoNo) {
        this.proximonoNo = proximonoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
    
    
    
}
