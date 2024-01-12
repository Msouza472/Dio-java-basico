package escola;

public class Escola {
    public static void main(String[] args) {
    /*  Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 12;
        felipe.turno = "manhã";
        ** exemplo 1 */

        Aluno felipe = new Aluno();
        felipe.setNome("Felipe José");
        felipe.setIdade(10);
        felipe.setTurno("Tarde");
    
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do turno da " + felipe.getTurno());
    }
}
