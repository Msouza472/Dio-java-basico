import Telefone.AparelhoTelefonico;
import navegadorDeInternet.NavegadorInternet;
import reprodutorMusical.ReprodutoMusical;
import smartphone.Iphone;

public class Console {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        NavegadorInternet navegadorInternet = iphone;
        ReprodutoMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;

        aparelhoTelefonico.ligar();
        reprodutorMusical.selecionarMusica();
        navegadorInternet.adicionatNovaAba();
    }
    
}
