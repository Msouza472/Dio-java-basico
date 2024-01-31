package one.digitalinnovation;
public class App {
    public static void main(String[] args) throws Exception {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(22));

        System.out.println(minhaPilha);
    }
}
