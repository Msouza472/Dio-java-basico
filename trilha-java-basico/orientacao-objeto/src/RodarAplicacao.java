public class RodarAplicacao {
    
    public static void main(String[] args){
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Gol G5");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Vermelho", "Palio", 48);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque( 6.39));
    }
}
