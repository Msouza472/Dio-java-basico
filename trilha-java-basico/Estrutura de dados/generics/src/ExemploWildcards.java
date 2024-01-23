import java.util.ArrayList;
import java.util.List;

public class ExemploWildcards {

    // Método que processa uma lista de números (ou seus subtipos)
    public static void processarNumeros(List<? extends Number> lista) {
        for (Number numero : lista) {
            // Leitura permitida, pois usamos delimitação superior (? extends Number)
            System.out.println(numero);
        }
    }

    // Método que adiciona um número inteiro (ou seus supertipos) à lista
    public static void adicionarInteiro(List<? super Integer> lista) {
        // Adição permitida, pois usamos delimitação inferior (? super Integer)
        lista.add(42);
    }

    public static void main(String[] args) {
        // Exemplo usando List<?> (wildcard não limitado)
        List<?> listaWildcard = new ArrayList<>();
        // Você pode ler elementos, mas não pode adicionar elementos específicos
        // Pois não sabemos o tipo exato da lista
        // listaWildcard.add("Texto"); // Isso resultaria em erro de compilação

        // Exemplo usando List<? extends Number> (wildcard com delimitação superior)
        List<? extends Number> listaNumerica = new ArrayList<>();
        // Você pode ler elementos da lista
        processarNumeros(listaNumerica);
        // Mas não pode adicionar elementos específicos
        // listaNumerica.add(42); // Isso resultaria em erro de compilação

        // Exemplo usando List<? super Integer> (wildcard com delimitação inferior)
        List<? super Integer> listaInteiros = new ArrayList<>();
        // Pode adicionar elementos do tipo Integer ou qualquer supertipo de Integer
        adicionarInteiro(listaInteiros);
        // Mas a leitura é restrita a objetos do tipo Object
        // Integer valor = listaInteiros.get(0); // Isso resultaria em erro de compilação

        // Exemplo usando tipos concretos
        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Olá");
        listaStrings.add("Mundo");
        // Não há wildcards aqui, tornando o código mais simples e claro
        for (String texto : listaStrings) {
            System.out.println(texto);
        }
    }
}
