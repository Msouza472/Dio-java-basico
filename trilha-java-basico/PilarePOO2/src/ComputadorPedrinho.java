import apps.FacebookMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;
import apps.MSNMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}


/*      MSNMessenger msn = new MSNMessenger();
      System.out.println("MSN");
      msn.enviarMensagem();
      msn.receberMensagem();
      System.out.println("FACEBOOK");
      FacebookMessenger facebook = new FacebookMessenger();

      facebook.enviarMensagem();
      facebook.receberMensagem();
      System.out.println("TELEGRAM");
      Telegram telegram = new Telegram();

      telegram.enviarMensagem();
      telegram.receberMensagem();  */