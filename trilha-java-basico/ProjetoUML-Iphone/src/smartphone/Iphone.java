package smartphone;

import navegadorDeInternet.NavegadorInternet;
import Telefone.AparelhoTelefonico;
import reprodutorMusical.ReprodutoMusical;

public class Iphone implements ReprodutoMusical, NavegadorInternet, AparelhoTelefonico {
    
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música no Reprodutor Musical de seu Iphone");
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada no reprodutor musical de seu iphone");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música no reprodutor musical de seu Iphone");
    }
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação através de seu Iphone");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo Ligação através de seu Iphone");
    }
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz através de seu Iphone");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página através do navegador de seu Iphone");
    }
    @Override
    public void adicionatNovaAba() {
        System.out.println("Adicionando nova aba no navegador de seu Iphone");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualiazando pagina do navegador de seu Iphone");
    }


    
}
