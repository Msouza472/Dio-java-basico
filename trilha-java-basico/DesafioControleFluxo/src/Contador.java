import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o parametro um");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o parametro dois");
        int parametroDois = terminal.nextInt();

        try{
            //chamando o método contar
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
           throw new ParametrosInvalidosException();

        }else {
           int contagem = parametroDois - parametroUm;
            for (int i = 1; i < contagem + 1; i++) {
                System.out.println("Imprimindo número " + i);
            }
        }
    }
}
