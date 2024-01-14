package apps;
public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
        
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    @Override
    protected void salvarHistoricoMensagem() {
        
    }
    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }
}
