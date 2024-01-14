public class Carro extends Veiculo {

    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado");
    }
    //Uso o private pq existem métodos que nao precisam ser vistos 
    //no exemplo o carro para ligar ele verifica se tem combustivel e se o cambio esta em P para ligar
    //Caso conttrário eu teria que chamar todos os método para poder ligar o carro
    //e chamo os metodos Cambio e combustivel dentro do metodo ligar o nome disso é ENCAPSULAMENTO

    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo câmbio em P");
    }
}
