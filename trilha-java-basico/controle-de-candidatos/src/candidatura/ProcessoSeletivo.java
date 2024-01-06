package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
       imprimirSelecionados();
    }

    static void imprimirSelecionados(){
         String [] candidatos = {"FELIPE", "MARCIA", "MATHEUS", "ANA", "FLAVIA", "CLEBER", "SONIA", "FRANCISCO", "CARLOS", "AUGUSTO"};

         System.out.println("Imprimindo a lista dos candidatos informando o indice do elemento");

         for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n°" + (indice+1) + " é o " + candidatos[indice]);
         }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
        static void selecaoCandidatos(){
            String [] candidatos = {"FELIPE", "MARCIA", "MATHEUS", "ANA", "FLAVIA", "CLEBER", "SONIA", "FRANCISCO", "CARLOS", "AUGUSTO"};

            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);

                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
            candidatoAtual++;
            }
        }
    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato!");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}