public class Main {
    public static void main(String[] args){

        //Calculadora
        System.out.print("Calculando...\n");
        Calculadora.soma(5, 9);
        Calculadora.subtracao(9, 7);
        Calculadora.multiplicacao(8, 9);
        Calculadora.divisao(15, 5);

        //Mensagem
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
}
