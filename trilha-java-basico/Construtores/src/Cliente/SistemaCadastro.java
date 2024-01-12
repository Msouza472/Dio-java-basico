package Cliente;

public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa matheus = new Pessoa("Matheus", "123");
        matheus.setEndereco("Rua Amaral");
        
        System.out.println(matheus.getNome() + " " + matheus.getCpf() + " " + matheus.getEndereco());
    }
}
