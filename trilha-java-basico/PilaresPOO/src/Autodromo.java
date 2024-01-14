public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("897897");

        Moto z400 = new Moto();
        z400.setChassi("471721");
        z400.ligar();

    /*
        Veiculo coringa = z400;
        coringa.ligar();
        **Polimorfismo**
        o metodo ligar pode dar resultados diferentes atraves 
        do atributo coringa quando é =z400 o resultado do metodo 
        é X e quando é =jeep o resultado é Y */
    }
    
}
