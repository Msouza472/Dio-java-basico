package com.projetono;

public class No<T> {

    private T conteudo;
    private No<T> proximonoNo;
    public No(T conteudo) {
        this.proximonoNo= null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public No<T> getProximonoNo() {
        return proximonoNo;
    }
    public void setProximonoNo(No<T> proximonoNo) {
        this.proximonoNo = proximonoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
    
    
    
}
