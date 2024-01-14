package apps;
public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensagem();
        
    }
    @Override
    public void receberMensagem() {
       System.out.println("Recebendo mensagem pelo MSN");
        
    }
    @Override
    protected void salvarHistoricoMensagem() {
        
    }
    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }
}
    
